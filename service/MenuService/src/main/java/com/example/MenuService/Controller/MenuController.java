package com.example.MenuService.Controller;


import com.example.MenuService.Model.Menu;
import com.example.MenuService.Repository.MenuRepository;
import com.example.MenuService.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @Autowired
    private MenuRepository menuRepository;


    //Get All Category
    @GetMapping(path="/category")
    public @ResponseBody  Iterable<Menu> getCategory(){
        return       menuService.getCategory();
    }

    //Get Menu in Category
    @GetMapping(path = "/category/{type}/menu")
    public @ResponseBody  ArrayList<Menu>  getMenu(@PathVariable String type){
        return menuService.getMenuCategory(type);
    }

    //Get Menu of User
    @GetMapping("/member/{memberId}/menu")
    public @ResponseBody  ArrayList<Menu> getMenuByMember(@PathVariable String memberId){
        return menuService.getMenuByMember(memberId);
   }

    //Get MenuDetail of menuId
    @GetMapping("/menu/{menuId}/menudetail")
    public  @ResponseBody  Menu  getMenuDetail(@PathVariable String menuId){
        return menuService.getMenuDetail(menuId);
    }

}
