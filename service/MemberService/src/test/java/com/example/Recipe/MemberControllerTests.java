package com.example.Recipe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MemberControllerTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getMember(){
        MemberService memberservice = restTemplate.getForObject("/Member/0001", MemberService.class);
        assertEquals("0001", memberservice.getMember("0001").getUsername());
    }

    @Test
    public void addMember() throws ExecutionException, InterruptedException, IOException {
        Member member = new Member("ron", "ron@gmail.com", "123456", "ron" );
        MemberService memberservice = restTemplate.getForObject("/Menber/0002/Proflie", MemberService.class);
        assertEquals("success", memberservice.addMember(member.getUsername(), member.getEmail(), member.getPassword(), member.getName()));

    }


}



