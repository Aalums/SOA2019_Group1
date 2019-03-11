package com.demo.Recipe.Menu;

import java.util.ArrayList;

public class Menu {

    private String foodName;
    private int time;
    private ArrayList ingredients;
    private ArrayList directions;
    private String type;

    public Menu(String foodName, int time, ArrayList ingredients, ArrayList directions, String type) {
        this.foodName = foodName;
        this.time = time;
        this.ingredients = ingredients;
        this.directions = directions;
        this.type = type;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList getDirections() {
        return directions;
    }

    public void setDirections(ArrayList directions) {
        this.directions = directions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
