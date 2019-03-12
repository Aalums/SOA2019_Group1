package com.demo.Recipe.Member;


import com.demo.Recipe.Member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    //GET Member
    @GetMapping("/Member/{id}")
    public Member getMember(@PathVariable String id){
        return new Member(id) ;
    }

    //ADD Member
    @PostMapping("/Member/{id}/Proflie")
    public String addMember(@PathVariable String id) {
        return memberService.addMember(id);
    }

}

