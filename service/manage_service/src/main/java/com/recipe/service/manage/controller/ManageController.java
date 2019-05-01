package com.recipe.service.manage.controller;

import com.recipe.service.manage.info.Menu;
import com.recipe.service.manage.model.Manage;
import com.recipe.service.manage.service.ManageService;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;

@RestController
public class ManageController {

    private ManageService manageService = new ManageService();
    private Manage manage;

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

        //create body
//        ArrayList<String> ingredient = new ArrayList<>();
//        ingredient.add("mushroom");
//        ingredient.add("shrimp");
//
//        ArrayList<String> directions = new ArrayList<>();
//        directions.add("tom");
//        directions.add("add topping");
//
//        menu = new Menu("phpond", null, "tom-yam", 30, ingredient, directions , "tom");

        //call service create menu
        manage = manageService.createMenu(memberId, menu);
        System.out.println("manage2 : "+manage);

        //save to db
        System.out.println("post info : "+manage.getMenu());

        //create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .replacePath("/member/{memberId}/menu/{menuid}/menudetail")
                .build(manage.getMemberId(), manage.getMenuId());

        return ResponseEntity.created(location).body(menu);
    }

//
//    public Manage fallback(String memberid) {
//        Manage manage = new Manage();
//        manage.setMemberId(memberid);
//        return manage;
//    }
}
