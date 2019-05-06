package com.example.MemberService.controller;

import com.example.MemberService.model.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MemberControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    int randomServerPort;

    @Test
    public void addMember() throws URISyntaxException {

        Member member = new Member();
        member.setUsername("test");
        member.setEmail("test@gmail.com");
        member.setPassword("123456");
        member.setName("testja");

        //test
        final String baseUrl = "http://localhost:"+randomServerPort+"/member/add";
        URI uri = new URI(baseUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.set("X-COM-PERSIST", "true");

        HttpEntity<Member> request = new HttpEntity<>(member, headers);

        System.out.println(request);

        ResponseEntity<String> result = restTemplate.postForEntity(uri, request, String.class);

        //Verify request succeed
        assertEquals(201, result.getStatusCodeValue());

    }

    @Test
    public void getMember() {
        Member member = restTemplate.getForObject("/member/test", Member.class);
        assertEquals("test", member.getUsername());
    }
}