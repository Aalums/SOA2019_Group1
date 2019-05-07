package com.example.MenuService.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "menu", schema = "")
public class Menu {

    @Id
    private String menuId;

    @Column(name="memberId", nullable = true)
    private String memberId;
    private String foodName;
    private int time;

    @Column(columnDefinition="TEXT")
    private String ingredients;

    @Column(columnDefinition="TEXT")
    private String directions;

    private String category;

    public Menu(){}


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getTime() {
        return time;
    }
//
//    public void setTime(int time) {
//        this.time = time;
//    }

    public List<String> getIngredients() {
        String _ingredients[] = ingredients.split(",");
        List<String> in = new ArrayList<String>();
        in = Arrays.asList(_ingredients);
        return in;
    }

//    public void setIngredients(String ingredients) {
//        this.ingredients = ingredients;
//    }

    public List<String> getDirections() {
        String _directions [] = directions.split(",");
        List<String> di = new ArrayList<String>();
        di = Arrays.asList(_directions);
        return di;
    }

//    public void setDirections(String directions) {
//        this.directions = directions;
//    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String type) {
        this.category = type;
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
}