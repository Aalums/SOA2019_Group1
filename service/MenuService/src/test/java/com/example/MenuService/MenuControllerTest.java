package com.example.MenuService;


import com.example.MenuService.Model.Menu;
import com.example.MenuService.Service.MenuService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import org.springframework.test.context.junit4.SpringRunner;


import java.net.HttpURLConnection;
import java.net.URL;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MenuControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    int randomServerPort;

    @Autowired
    MenuService menuService;

    @Before
    public  void  setData(){
        Menu menu=new Menu();
        menu.setMenuId("F0000001");
        menu.setFoodName("ต้แยำกุ้ง");
        menu.setMemberId("phpond");
        menu.setCategory("tom");
    }

    private int httpStatus  (String endpoint) throws Exception{

        URL url = new URL("http://localhost:"+randomServerPort+endpoint);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        int statusCode = http.getResponseCode();
        return statusCode ;

    }
    // GET ALL

    @Test
    public void getCategory() throws Exception  {
        int status = httpStatus("/menu/category");
        Assert.assertEquals(200,status);
    }


    @Test
    public void getMenuByCategory() throws Exception{
        int status = httpStatus("/menu/category/tom/menu");
        Assert.assertEquals(200,status);
    }

    @Test
    public void getMenuByMember() throws Exception{
        int status = httpStatus("/menu/member/phpond/menu");
        Assert.assertEquals(200,status);
    }

    @Test
    public void getMenuDetail() throws Exception{
        int status = httpStatus("/menu/menu/f0000001/menudetail");
        Assert.assertEquals(200,status);
    }


}