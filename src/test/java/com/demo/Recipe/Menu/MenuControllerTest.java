package com.demo.Recipe.Menu;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.*;

public class MenuControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCategory(){
        MenuService menuService = restTemplate.getForObject("/Category" , MenuService.class);
        assertEquals("ต้ม ผัด แกง ทอก", MenuService.getCategory.getCategory());
    }

    @Test
    public void getMenuByName(){
        MenuService menuService = restTemplate.getForObject("/Category/Tomyam/Menu", MenuService.class);
        assertEquals("Tomyam", MenuService.getMenuByname().getFoodName());
    }

    @Test
    public void getMenuByMember(){
        MenuService menuService = restTemplate.getForObject("/Member/eyenach/Menu", MenuService.class);
        assertEquals("eyenach", MenuService.getMenuByMember().getMember().getUsername());
    }

    @Test
    public void getMenuDetail(){
        MenuService menuService = restTemplate.getForObject("/Menu/f000001/MenuDetail", MenuService.class);
        assertEquals("ซักอย่าง", MenuService.getMenuDetail());
    }


}