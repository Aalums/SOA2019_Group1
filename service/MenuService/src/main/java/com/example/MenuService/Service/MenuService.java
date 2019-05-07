package com.example.MenuService.Service;


import com.example.MenuService.Model.Menu;
import com.example.MenuService.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    private Menu menu;

    public MenuService(){}


    public Iterable<Menu> getCategory(){
        return menuRepository.findAll();
}



    public ArrayList<Menu> getMenuCategory(String type){
        return menuRepository.findMenuByCategory(type);
    }

    public  ArrayList<Menu> getMenuByMember(String memberId){
        //get menu from db
        return menuRepository.findMenuByMemberId(memberId);
    }

    public Menu getMenuDetail(String menuId) {
        //get menu from db 'menuId'
        return menuRepository.findByMenuId(menuId);
    }
}