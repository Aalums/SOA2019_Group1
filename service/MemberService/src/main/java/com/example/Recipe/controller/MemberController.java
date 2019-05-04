package com.example.Recipe;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class MemberController {
    @RequestMapping("/Member/{memberId}")
    public Member getMember(@PathVariable String memberId){
        return MemberService.getMember(memberId) ;
    }

    //ADD Member
    @PostMapping("/Menber/{id}/Proflie")
    public String addMember(@PathVariable  String id, String username) {
        return  MemberService.addMember(id, username);

    }
}
