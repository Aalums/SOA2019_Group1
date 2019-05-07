package com.recipe.service.manage;

import com.recipe.service.manage.info.MenuFromWeb;
import com.recipe.service.manage.model.Manage;
import com.recipe.service.manage.service.ManageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;
import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ManageControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    ManageService manageService;

    @Autowired
    MockMvc mockMvc;

    private Manage manage;
    private MenuFromWeb menu;

    @LocalServerPort
    int randomServerPort;

    //set up
    public MenuFromWeb setMenu(){

        //create menu
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("mushroom");
        ingredients.add("shrimp");

        ArrayList<String> directions = new ArrayList<>();
        directions.add("tom");
        directions.add("add topping");

        menu.setMemberId("phpond");
        menu.setFoodName("ไข่เค็มดอง");
        menu.setTime(30);
        menu.setIngredients(ingredients);
        menu.setDirections(directions);
        menu.setCategory("test");

        return menu;
    }

    @Test
    public void createNewMenu() throws Exception {

//        menu = new MenuFromWeb();
//        menu = setMenu();
//
//        //create manage
//        manage = new Manage();
//        manage.setMemberId(menu.getMemberId());
//        manage.setMenu(menu);
//        manage.setMenuId(menu.getMenuId());
//
//        //test
//        final String baseUrl = "http://localhost:"+randomServerPort+"/member/phpond/menu/new";
//        URI uri = new URI(baseUrl);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("X-COM-PERSIST", "true");
//
//        HttpEntity<MenuFromWeb> request = new HttpEntity<>(menu, headers);
//
//        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);
//
//        //Verify request succeed
//        Assert.assertEquals(201, result.getStatusCodeValue());

    }

    @Test
    public void updateMenu() throws Exception {

//        menu = new MenuFromWeb();
//        menu = setMenu();
//        menu.setTime(50);
//
//        //create manage
//        manage = new Manage();
//        manage.setMemberId(menu.getMemberId());
//        manage.setMenu(menu);
//        manage.setMenuId(menu.getMenuId());
//
//        //test
//        final String baseUrl = "http://localhost:"+randomServerPort+"/member/phpond/menu/X0000000/update";
//        URI uri = new URI(baseUrl);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("X-COM-PERSIST", "true");
//
//        HttpEntity<MenuFromWeb> request = new HttpEntity<>(menu, headers);
//
//        ResponseEntity<String> result = this.restTemplate.exchange(uri, HttpMethod.PUT, request, String.class);
//
//        //Verify request succeed
//        Assert.assertEquals(200, result.getStatusCodeValue());

    }

}