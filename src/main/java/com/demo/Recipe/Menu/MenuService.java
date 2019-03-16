package com.demo.Recipe.Menu;

import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private Menu menu;

    public MenuService(){}

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getCategory(){
        return "Category";
    }

    public Menu getMenu(String name){
        menu = new Menu();
        menu.setFoodName(name);
        return menu;
    }

    public Menu getMenuCategory(String type){
        menu = new Menu();
        menu.setCategory(type);
        return menu;
    }

    public Menu getMenuByMember(String memberId){
        //get menu from db
        menu = new Menu();
        menu.setMemberId(memberId);
        return menu;
    }

    public Menu getMenuDetail(String MenuId) {
        //get menu from db 'menuId'
        menu = new Menu();
        return menu;
    }
}
