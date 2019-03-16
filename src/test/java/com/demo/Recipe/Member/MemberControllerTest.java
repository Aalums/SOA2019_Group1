package com.demo.Recipe.Member;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MemberControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getMember() {
        //call controller
        Member member = restTemplate.getForObject("/Member/eyenach", Member.class);

        //assertion
        assertEquals("eyenach", member.getUsername());
    }

    @Test
    public void addMember() {
        //call controller
        MemberService memberService = restTemplate.getForObject("/Member/Register/eyenach", MemberService.class);

        //assertion
        assertEquals("Success", memberService.addMember("eyenach"));
    }
}