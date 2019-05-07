package com.example.MenuService.Service;


import com.example.MenuService.Model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    private Menu menu;

    public MenuService(){}

//    public Menu getMenu() {
//        return menu;
//    }
//
//    public void setMenu(Menu menu) {
//        this.menu = menu;
//    }
//
//    public String getCategory(){
//        return "Category";
//}
//
//    public Menu getMenu(String name){
//        menu = new Menu();
//        menu.setFoodName(name);
//        return menu;
//    }
//
//    public String getMenuCategory(String type){
//        return menu.getCategory();
//    }
//
//    public Menu getMenuByMember(String memberId){
//        //get menu from db
//        menu = new Menu();
//        menu.setMemberId(memberId);
//        return menu;
//    }
//
//    public Menu getMenuDetail(String MenuId) {
//        //get menu from db 'menuId'
//        menu = new Menu();
//        return menu;
//    }
}