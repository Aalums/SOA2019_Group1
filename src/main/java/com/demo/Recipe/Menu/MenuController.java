package com.demo.Recipe.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/Category")
    public MenuService getCategory(){
        return new MenuService();
    }

    @GetMapping("/Category/{name}/Menu")
    public Menu getMenu(@PathVariable String name){
        return menuService.getMenu(name);
    }

    @GetMapping("/Member/{id}/Menu")
    public Menu getMenuByMember(@PathVariable String id, String name){

        return menuService.getMenu(id, name);
    }

    @GetMapping("/Menu/{id}/MenuDetail")
    public Menu getMenuDetail(@PathVariable String id){

        return menuService.getMenuDetail(id);
    }

//    GET/Menu?search=:name

}
