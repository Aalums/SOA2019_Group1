package com.recipe.service.manage.controller;

import com.recipe.service.manage.info.Menu;
import com.recipe.service.manage.info.MenuFromWeb;
import com.recipe.service.manage.model.Manage;
import com.recipe.service.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;

@RestController
public class ManageController {

    @Autowired
    private ManageService manageService;

    private Manage manage;
    private Menu menu;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    //home
    @GetMapping("/")
    public String home(){
        return "welcome manageeeee";
    }

    //create new menu (POST)
//    @RequestMapping(value = "/member/{memberId}/menu/new",
//            method = {RequestMethod.GET, RequestMethod.POST})
    @PostMapping("/member/{memberId}/menu/new")
    public ResponseEntity<Object> createNewMenu(@PathVariable String memberId, @RequestBody MenuFromWeb menuFromWeb) throws Exception{

        //set up

        //call service create menu
        manage = manageService.createMenu(memberId, menu, menuFromWeb);
        System.out.println("manage2 : "+manage);

        //save to db
        System.out.println("post info : "+manage.getMenu());

        //create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .replacePath("/member/{memberId}/menu/{menuid}/menudetail")
                .build(manage.getMemberId(), manage.getMenuId());

        return ResponseEntity.created(location).body(menuFromWeb);
    }

//
//    public Manage fallback(String memberid) {
//        Manage manage = new Manage();
//        manage.setMemberId(memberid);
//        return manage;
//    }
}
