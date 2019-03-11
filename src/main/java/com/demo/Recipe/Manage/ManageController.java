package com.demo.Recipe.Manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManageController {

    @Autowired
    private ManageService manageService;

    //create new menu
    @PostMapping("/Member/{id}/Menu")
    public Manage createMenu(@PathVariable String memberId, Menu menu){
        return manageService.createMenu(memberId, menu);
    }

    //update menu
    @PutMapping("/Menu/{id}/MenuDetail")
    public Manage creatMenu(@PathVariable String menuId, Menu menu){
        return manageService.updateMenu(menuId, menu);
    }

    //delete menu
    @DeleteMapping("/Menu/{id}")
    public Manage creatMenu(@PathVariable String menuId){
        return manageService.deleteMenu(menuId);
    }


}
