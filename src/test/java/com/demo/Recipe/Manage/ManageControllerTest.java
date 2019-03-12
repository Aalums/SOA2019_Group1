package com.demo.Recipe.Manage;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.*;

public class ManageControllerTest{

        @Autowired
        private TestRestTemplate restTemplate;

        public void createMenu(){
                //ManageService manageService = restTemplate.getForObject("/Member/eyenach/Menu" ,ManageService.class);
                //assertEquals("eyenach" ,manageService.getManage().getMemberId());
                }

        @Test
        public void updateMenu(){
               // ManageService manageService = restTemplate.getForObject("/Menu/f0000001/MenuDetail" ,ManageService.class);
             //   assertEquals("f0000001" ,manageService.getManage().getMenuId());
                }
        @Test
        public void deleteMenu(){
                //ManageService manageService = restTemplate.getForObject("/Menu/f0000001" ,ManageService.class);
                //assertEquals("f0000001" ,manageService.getManage().getMenuId());
                }

        }
