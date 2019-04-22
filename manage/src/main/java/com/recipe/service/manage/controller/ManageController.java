package com.recipe.service.manage.controller;

import com.google.errorprone.annotations.FormatString;
import com.recipe.service.manage.info.Menu;
import com.recipe.service.manage.model.Manage;
import com.recipe.service.manage.service.ManageService;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Random;

@RestController
public class ManageController {

    private ManageService manageService;
    private String menuId;
    private Manage manage2;

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
    @RequestMapping(value = "/member/{memberId}/menu/new",
            method = {RequestMethod.GET, RequestMethod.POST})
//    @PostMapping("/member/{memberId}/menu/new")
    public ResponseEntity<Object> createNewMenu(@PathVariable String memberId, @RequestBody Menu menu) throws Exception{

        //call service create menu
//        manage2 = manageService.createMenu(memberId, menu);
//        System.out.println("manage2 : "+manage2);

//        manage2 = new Manage();
//        manage2 = manageService.createMenu(memberId, menu);
        System.out.println(">> manage2 : "+manage2);
        //get info. from website

        menu.setMemberId(memberId);

        //set menuId
        //check type
        if(menu.getCategory().equals("tom")){
            menuId = "T";
        }else{
            menuId = "E";
        }
        //get last menuId from db
        /* send to repo */
        menuId += String.format("%07d", 5);
        System.out.println("menu id : "+menuId);
        menu.setMenuId(menuId);

        Manage manage = new Manage();

        //send to add menu service --> add to db
        manage.setMemberId(memberId);
        manage.setMenuId(menuId);
        manage.setMenu(menu);

        //save to db
        System.out.println("post info : "+manage.getMenu());

        //create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{menuid}/menudetail")
                .buildAndExpand(manage.getMunuId())
                .toUri();


        return ResponseEntity.created(location).body(menu);
    }
//
//    public Manage fallback(String memberid) {
//        Manage manage = new Manage();
//        manage.setMemberId(memberid);
//        return manage;
//    }
}
