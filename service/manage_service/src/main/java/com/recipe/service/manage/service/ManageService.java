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

    private Manage manage = new Manage();
    private String menuId = "";
    private Menu menu;

    /*
    1. createMenu (ManageService) -> insertMenuToDB (ManageRepo)
    *  param Menu menu
    *  return Manage manage
    */
    public Manage createMenu(MenuFromWeb menuFromWeb){

        //set menu
        menu = setMenu(menuFromWeb.getMemberId(), menuFromWeb);

        //set menu id
        menu.setMenuId(setNewMenuId(menu.getCategory()));
        menuFromWeb.setMenuId(menu.getMenuId());

        //set manage
        manage = setManage(menuFromWeb);

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
    public Manage updateMenu(MenuFromWeb menuFromWeb){
        //set menu
        menu = setMenu(menuFromWeb.getMemberId(), menuFromWeb);
        menu.setMenuId(menuFromWeb.getMenuId());

        //set manage
        manage = setManage(menuFromWeb);

        //call repo //save menu
        manageRepository.save(menu);

        return manage;
    }

    /*
    3. setNewMenuId (ManageService) -> getLastId (ManageRepo)
    *  param String category
    *  return String newMenuId
    */
    public String setNewMenuId(String category){
        try{
            if(category.equals("test")){
                menuId = "X0000000";
            }else{
                checkCategory(category);
                //call repo
                menuId += String.format("%07d", manageRepository.countAllByCategoryEquals(category)+1);
            }
            System.out.println("menu id : "+menuId);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return menuId;
    }


    /*
    4. checkCategory
    *  param String category, String menuId
    *  return String menuId
    */
    public String checkCategory(String category){
        if(category.equals("boiled")){
            menuId = "T";
        }else if(category.equals("fried")){
            menuId = "F";
        }
        else if(category.equals("baked")){
            menuId = "B";
        }
        return menuId;
    }

    public Menu setMenu(String memberId, MenuFromWeb menuFromWeb){
        menu = new Menu();
        menu.setMemberId(memberId);
        menu.setFoodName(menuFromWeb.getFoodName());

        String ingredients = "";
        int count = 0;
        for(String i : menuFromWeb.getIngredients()){
            count++;
            if(menuFromWeb.getIngredients().size() == count){
                ingredients += i;
            }else{
                ingredients += i+",";
            }

        }

        String directions = "";
        count = 0;
        for(String i : menuFromWeb.getDirections()){
            count++;
            if(menuFromWeb.getDirections().size() == count){
                directions += i;
            }else {
                directions += i + ",";
            }
        }

        menu.setIngredients(ingredients);
        menu.setDirections(directions);
        menu.setTime(menuFromWeb.getTime());
        menu.setCategory(menuFromWeb.getCategory());

        return menu;
    }

    public Manage setManage(MenuFromWeb menuFromWeb){

        //set manage
        manage.setMemberId(menuFromWeb.getMemberId());
        manage.setMenu(menuFromWeb);
        manage.setMenuId(menuFromWeb.getMenuId());

        return manage;
    }
}
