package com.demo.Recipe.Member;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.Assert.*;

public class MemberControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getMember() {
        //call controller
        Member memberService = restTemplate.getForObject("/Member", Member.class);

        //assertion
        assertEquals("eyenach", memberService.getUsername());
    }

    @Test
    public void addMember() {
        //call controller
        Member memberService = restTemplate.getForObject("Member/eyenach/Profile", Member.class);

        //assertion
        assertEquals("addMember", memberService.addMember("eyenach", "eyenach"));
    }

}