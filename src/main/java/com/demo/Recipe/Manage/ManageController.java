package com.demo.Recipe.Manage;

import com.demo.Recipe.Menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManageController {

    @Autowired
    private ManageService manageService;

    //create new menu
    @RequestMapping(value = "/Member/{memberId}/menu/new",
            method = {RequestMethod.GET, RequestMethod.POST})
    public Manage  createMenu(@PathVariable("memberId") String memberId, Menu menu){
        return manageService.createMenu(memberId, menu);
    }

    //update menu
    @RequestMapping(value = "/Menu/{menuId}/MenuDetail/update",
            method = {RequestMethod.GET, RequestMethod.PUT})
    public Manage updateMenu(@PathVariable String menuId, Menu menu){
        return manageService.updateMenu(menuId, menu);
    }

    //delete menu
    @RequestMapping(value = "/deleteMenu",
            method = {RequestMethod.GET, RequestMethod.DELETE})
    public String deleteMenu() {
        return manageService.deleteMenu("f0000001");
    }
}

