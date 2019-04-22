package com.recipe.service.manage.service;

import com.recipe.service.manage.info.Menu;
import com.recipe.service.manage.model.Manage;
import com.recipe.service.manage.repository.ManageReposity;

//connect to repo
public class ManageService {

    private ManageReposity manageReposity;
    private Manage manage;

    /*
    1. createMenu (ManageService) -> insertMenuToDB (ManageRepo)
    *  param Menu menu
    *  return Manage manage
    */
    public Manage createMenu(String memberId, Menu menu){
        //set menu id
        menu.setMenuId(setNewMenuId(menu.getCategory()));

        //set manage
        manage = new Manage();
        System.out.println("m1 :"+manage);
        manage.setMemberId(memberId);
        manage.setMenu(menu);
        manage.setMenuId(menu.getMenuId());
        System.out.println("m2 :"+ manage);

        //call repo
        manageReposity.insertMenuToDB(menu);

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
        String menuId = "";
        menuId = checkCategory(category, menuId);
        //call repo
        menuId += String.format("%07d", manageReposity.getLastId(category));
        System.out.println("menu id : "+menuId);
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

}
