package com.demo.Recipe.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    //GET Member
    @GetMapping("/Member/{memberId}")
    public Member getMember(@PathVariable String memberId){
        return memberService.getMember(memberId);
    }

    //ADD Member
    @PostMapping("/Member/Register/{memberId}")
    public String addMember(@RequestBody Member member, @PathVariable String memberId) {
        return memberService.addMember(member, memberId);
    }
}

