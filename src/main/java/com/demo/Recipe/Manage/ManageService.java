package com.demo.Recipe.Manage;

import com.demo.Recipe.Menu.Menu;
import org.springframework.stereotype.Service;

@Service
public class ManageService {

    private Manage manage;

    public ManageService(){}

    public Manage getManage() {
        return manage;
    }

    public void setManage(Manage manage) {
        this.manage = manage;
    }

    public String updateMenu(String menuId, Menu menu){
        return "update";
    }

    public String createMenu(String menuId, Menu menu){
        return "add";
    }

    public String deleteMenu(String menuId){
        return "delete";
    }
}
