package com.demo.Recipe.Manage;

import com.demo.Recipe.Menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManageController {

    @Autowired
    private ManageService manageService;

    //create new menu
    @PostMapping("/Member/{id}/Menu")
    public String  createMenu(@PathVariable String menuId, Menu menu){
        return manageService.createMenu(menuId, menu);
    }

    //update menu
    @PutMapping("/Menu/{id}/MenuDetail")
    public String updateMenu(@PathVariable String menuId, Menu menu){
        return manageService.updateMenu(menuId, menu);
    }

    //delete menu
    @DeleteMapping("/Menu/{id}")
    public String  deleteMenu(@PathVariable String menuId){
        return manageService.deleteMenu(menuId);
    }


}
