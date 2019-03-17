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

    public Manage updateMenu(String menuId, Menu menu){
        manage = new Manage();
        manage.setMenuId(menuId);
        return manage;
    }

    public Manage createMenu(String memberId, Menu menu){
        manage = new Manage();
        manage.setMemberId(memberId);
        return manage;
    }

    public String deleteMenu(String menuId){

        return "Delete";
    }
}
