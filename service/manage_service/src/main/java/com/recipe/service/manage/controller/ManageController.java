package com.recipe.service.manage.controller;

import com.recipe.service.manage.info.Menu;
import com.recipe.service.manage.info.MenuFromWeb;
import com.recipe.service.manage.model.Manage;
import com.recipe.service.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
    private String resultDel;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    //create new menu (POST)
    @PostMapping("/member/{memberId}/menu/new")
    public ResponseEntity<?> createNewMenu(@PathVariable String memberId, @RequestBody MenuFromWeb menuFromWeb) throws Exception{

        //call service create menu
        manage = new Manage();
        menuFromWeb.setMemberId(memberId);
        manage = manageService.createMenu(menuFromWeb);

        //create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .replacePath("/member/{memberId}/menu/{menuid}")
                .build(manage.getMemberId(), manage.getMenuId());

        ResponseEntity.created(location);

        return ResponseEntity.status(HttpStatus.CREATED).body(manage);
    }

    //update menu (PUT)
    @PutMapping("/member/{memberId}/menu/{menuId}/update")
    public ResponseEntity<?> updateMenu(@PathVariable String memberId, @PathVariable String menuId, @RequestBody MenuFromWeb menuFromWeb){

        //call service create menu
        manage = new Manage();
        menuFromWeb.setMemberId(memberId);
        menuFromWeb.setMenuId(menuId);
        manage = manageService.updateMenu(menuFromWeb);

        //create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .replacePath("/member/{memberId}/menu/{menuId}")
                .build(manage.getMemberId(), manage.getMenuId());

        ResponseEntity.created(location);

        return ResponseEntity.status(HttpStatus.OK).body(manage);
    }


}
