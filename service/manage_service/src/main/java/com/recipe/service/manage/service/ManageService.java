package com.recipe.service.manage.service;

import com.recipe.service.manage.info.Menu;
import com.recipe.service.manage.info.MenuFromWeb;
import com.recipe.service.manage.model.Manage;
import com.recipe.service.manage.repository.ManageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

//connect to repo
@Service
public class ManageService {

    @Autowired
    ManageRepository manageRepository;

    private Manage manage;
    private String menuId = "";

    /*
    1. createMenu (ManageService) -> insertMenuToDB (ManageRepo)
    *  param Menu menu
    *  return Manage manage
    */
    public Manage createMenu(String memberId, Menu menu, MenuFromWeb menuFromWeb){

        //set menu
        menu = setMenu(menu, memberId, menuFromWeb);

        //set menu id
        menu.setMenuId(setNewMenuId(menu.getCategory()));
        menuFromWeb.setMenuId(menu.getMenuId());

        //set manage
        manage = new Manage();
        manage.setMemberId(memberId);
        manage.setMenu(menuFromWeb);
        manage.setMenuId(menuFromWeb.getMenuId());

        //call repo //save menu
        manageRepository.save(menu);

        //return manage
        return manage;
    }

    /*
    2. updateMenu (ManageService) -> updateMenuToDB (ManageRepo)
    *  param Menu menu
    *  return Manage manage
    */

    /*
    3. deleteMenu (ManageService) -> deleteMenuToDB (ManageRepo)
    *  param Menu menu
    *  return Manage manage
    */

    /*
    4. setNewMenuId (ManageService) -> getLastId (ManageRepo)
    *  param String category
    *  return String newMenuId
    */
    public String setNewMenuId(String category){
        try{
            checkCategory(category, menuId);
            //call repo
            menuId += String.format("%07d", manageRepository.countAllByCategoryEquals(category)+1);
            System.out.println("menu id : "+menuId);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return menuId;
    }


    /*
    5. checkCategory
    *  param String category, String menuId
    *  return String menuId
    */
    public String checkCategory(String category, String menuId){
        if(category.equals("tom")){
            menuId = "T";
        }else if(category.equals("fried")){
            menuId = "F";
        }
        else{
            menuId = "E";
        }
        return menuId;
    }

    public Menu setMenu(Menu menu, String memberId, MenuFromWeb menuFromWeb){
        menu = new Menu();
        menu.setMemberId(memberId);
        menu.setFoodName(menuFromWeb.getFoodName());

        String ingredients = "";
        for(String i : menuFromWeb.getIngredients()){
            ingredients += i+",";
        }

        String directions = "";
        for(String i : menuFromWeb.getDirections()){
            directions += i+",";
        }

        menu.setIngredients(ingredients);
        menu.setDirections(directions);
        menu.setTime(menuFromWeb.getTime());
        menu.setCategory(menuFromWeb.getCategory());

        return menu;
    }
}
