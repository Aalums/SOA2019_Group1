package com.recipe.service.manage.repository;

import com.recipe.service.manage.info.Menu;

public class ManageReposity {

    /*
    1. insertMenuToDB -> insert menu to db
    * param Menu menu
    * return status
    */
    public String insertMenuToDB(Menu menu){
        //SQL insert
        //process
        //result
        return "success";
    }

    /*
    2. updateMenuToDB -> update menu to db
    * param String menuId, Menu menu
    * return String status
    */

    /*
    3. deleteMenuToDB -> delete menu to db
    * param String menuId, Menu menu
    * return String status
    */

    /*
    4. getLastId -> get last id of menu by category
    * param String category
    * return int lastId
    */
    public int getLastId(String category){
        //check in db by category
        return 3;
    }


}
