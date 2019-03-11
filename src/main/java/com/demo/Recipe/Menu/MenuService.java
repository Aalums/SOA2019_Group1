package com.demo.Recipe.Menu;

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
    public String getMenu(String name){
        return "MenuName";
    }
    public String getMenu(String memberId, String name){
        return "Menu";

    }
    public String getMenuDetail(String MenuId) {
        return "MenuDetail";
    }
}
