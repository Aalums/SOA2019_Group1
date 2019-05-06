package com.example.MemberService.controller;

import com.example.MemberService.model.Member;
import com.example.MemberService.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    private Member user;

    //ADD Member
    @PostMapping(value = "/member/add", produces = "application/json;charset=UTF-8")
    public ResponseEntity<?> addMember(@RequestBody Member member)  {

        user = memberService.addMember(member);

        System.out.println(user.getUsername());
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .replacePath("/member/{memberId}")
                .build(user.getUsername());

        System.out.println(location);

        return ResponseEntity.created(location).body(user);
    }

    @GetMapping(value = "/member/{memberId}", produces = "application/json;charset=UTF-8")
    public Member getMember(@PathVariable String memberId){
        return memberService.getMember(memberId);
    }

}
