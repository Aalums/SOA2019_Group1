package com.example.MenuService.Controller;


import com.example.MenuService.Model.Menu;
import com.example.MenuService.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    //Get All Category
    @GetMapping("/category")
    public MenuService getCategory(){
        return new MenuService();
    }

    //Get Menu in Category
    @GetMapping("/category/{type}/menu")
    public Menu getMenu(@PathVariable String type){
        return menuService.getMenuCategory(type);
    }

    //Get Menu of User
    @GetMapping("/member/{memberId}/menu")
    public Menu getMenuByMember(@PathVariable String memberId){
        return menuService.getMenuByMember(memberId);
    }

    //Get MenuDetail of menuId
    @GetMapping("/menu/{menuId}/menudetail")
    public Menu getMenuDetail(@PathVariable String menuId){
        return menuService.getMenuDetail(menuId);
    }

    //Get Menu By search
    @GetMapping("/menu/search/{menuName}")
    public Menu getMenuByMenuName(@PathVariable String menuName){
        return menuService.getMenu(menuName);
    }
}
