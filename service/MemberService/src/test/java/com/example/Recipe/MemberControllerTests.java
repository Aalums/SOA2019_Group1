package com.example.Recipe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MemberControllerTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getMember(){
        MemberService memberservice = restTemplate.getForObject("/Member/0001", MemberService.class);
        assertEquals("0001", memberservice.getMember("0001").getMemberId());
    }

    @Test
    public void addMember(){
        MemberService memberservice = restTemplate.getForObject("/Menber/0002/Proflie", MemberService.class);
        assertEquals("success", memberservice.addMember("0002", "qwerty"));

    }


}



