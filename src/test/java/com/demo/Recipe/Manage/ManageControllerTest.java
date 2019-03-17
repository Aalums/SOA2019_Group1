package com.demo.Recipe.Manage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ManageControllerTest{

        @Autowired
        private TestRestTemplate restTemplate;

        @Test
        public void createMenu(){
                Manage manage = restTemplate.getForObject("/Member/eyenach/Menu" ,Manage.class);
                assertEquals("eyenach" ,manage.getMemberId());
                }

        @Test
        public void updateMenu(){
                Manage manage = restTemplate.getForObject("/Menu/f0000001/MenuDetail" ,Manage.class);
                assertEquals("f0000001" ,manage.getMenuId());
                }
        @Test
        public void deleteMenu(){
                ManageService manageService = restTemplate.getForObject("/Menu/f0000001" ,ManageService.class);
                assertEquals("delete" ,manageService.deleteMenu("f0000001"));
                }

        }
