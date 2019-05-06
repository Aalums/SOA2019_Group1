package com.example.MenuService.Repository;

import com.example.MenuService.Model.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface MenuRepository extends CrudRepository<Menu, String> {
    ArrayList<Menu> findMenuByCategory(String type);
    ArrayList<Menu> findMenuByMemberId(String memberId);
    Menu findByMenuId(String menuId);
    Menu findByFoodName(String foodName);


     }
