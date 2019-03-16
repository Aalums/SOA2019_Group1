package com.demo.Recipe.Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    //Get All Category
    @GetMapping("/Category")
    public MenuService getCategory(){
        return new MenuService();
    }

    //Get Menu in Category
    @GetMapping("/Category/{type}/Menu")
    public Menu getMenu(@PathVariable String type){
        return menuService.getMenu(type);
    }

    //Get Menu of User
    @GetMapping("/Member/{memberId}/Menu")
    public Menu getMenuByMember(@PathVariable String memberId){
        return menuService.getMenuByMember(memberId);
    }

    //Get MenuDetail of menuId
    @GetMapping("/Menu/{menuId}/MenuDetail")
    public Menu getMenuDetail(@PathVariable String menuId){
        return menuService.getMenuDetail(menuId);
    }

    //Get Menu By search
    @GetMapping("/Menu?search=:{menuName}")
    public Menu getMenuByMenuName(@PathVariable String menuName){
        return menuService.getMenu(menuName);
    }
}
