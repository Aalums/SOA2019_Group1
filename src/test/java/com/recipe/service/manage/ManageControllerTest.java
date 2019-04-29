package com.recipe.service.manage;

import com.recipe.service.manage.info.Menu;
import com.recipe.service.manage.model.Manage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ManageControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    int randomServerPort;

    @Test
    public void home(){
        assertEquals("welcome manageeeee", restTemplate.getForObject("/", String.class));
    }

    @Test
    public void createNewMenu() throws URISyntaxException {

        final String baseUrl = "http://localhost:"+randomServerPort+"/member/phpond/menu/new";
        URI uri = new URI(baseUrl);

        //create body
        ArrayList<String> ingredient = new ArrayList<>();
        ingredient.add("mushroom");
        ingredient.add("shrimp");

        ArrayList<String> directions = new ArrayList<>();
        directions.add("tom");
        directions.add("add topping");

        Menu menu = new Menu("phpond", "f0000005", "tom-yam", 30, ingredient, directions , "tom");

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");

        HttpEntity<Menu> request = new HttpEntity<>(menu, headers);
        System.out.println("request : "+request);

        ResponseEntity<String> result = this.restTemplate.postForEntity(uri, request, String.class);

        //Verify request succeed
        Assert.assertEquals(201, result.getStatusCodeValue());


//        Manage manage = restTemplate.getForObject("/member/phpond/menu/new", Manage.class);
//        assertEquals("tom-yam", manage.getMenu().toString().toLowerCase());
    }


}