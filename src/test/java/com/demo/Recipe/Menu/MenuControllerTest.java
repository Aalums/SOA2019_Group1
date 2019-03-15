package com.demo.Recipe.Menu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getCategory(){
        MenuService menuService = restTemplate.getForObject("/Category", MenuService.class);
        assertEquals("Category", menuService.getCategory());
    }

    @Test
    public void getMenu(){
        Menu menu = restTemplate.getForObject("/Category/Bold/Menu", Menu.class);
        assertEquals("Bold", menu.getCategory());
    }

    @Test
    public void getMenuByMember(){
        MenuService menuService = restTemplate.getForObject("/Member/eyenach/Menu", MenuService.class);
        assertEquals("eyenach", menuService.getMenu("eyenach", "Tomyam").getMemberId());
    }

    @Test
    public void getMenuDetail(){
        MenuService menuService = restTemplate.getForObject("/Menu/f0000001/MenuDetail", MenuService.class);
        assertEquals("f0000001", menuService.getMenuDetail("f0000001").getMenuId());
    }

}