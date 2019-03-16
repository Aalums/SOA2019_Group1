package com.demo.Recipe.Manage;

import com.demo.Recipe.Menu.Menu;

public class Manage {

    private String memberId;
    private String menuId;
    private Menu menu;

    public Manage() { }

    public Manage(String memberId, String menuId, Menu menu) {
        this.memberId = memberId;
        this.menuId = menuId;
        this.menu = menu;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
