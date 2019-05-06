package com.example.MenuService;

import com.example.MenuService.Model.Menu;
import com.example.MenuService.Service.MenuService;
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
        MenuService menuService = restTemplate.getForObject("/category", MenuService.class);
        assertEquals("Category", menuService.getCategory());
    }

    @Test
    public void getMenu(){
        Menu menu = restTemplate.getForObject("/category/Bold/menu", Menu.class);
        assertEquals("Bold", menu.getCategory());
    }

    @Test
    public void getMenuByMember(){
        MenuService menuService = restTemplate.getForObject("/member/eyenach/menu", MenuService.class);
        assertEquals("eyenach", menuService.getMenuByMember("eyenach").getMemberId());
    }

    @Test
    public void getMenuDetail(){
        MenuService menuService = restTemplate.getForObject("/menu/f0000001/menuDetail", MenuService.class);
        assertEquals("f0000001", menuService.getMenuDetail("f0000001").getMenuId());
    }

    @Test
    public void getMenuByMenuName(){
        MenuService menuService = restTemplate.getForObject("/menu/search/Tomyam", MenuService.class);
        assertEquals("Tomyam", menuService.getMenu("Tomyam").getFoodName());
    }

}