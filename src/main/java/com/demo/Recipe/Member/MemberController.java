package com.demo.Recipe.Member;


import com.demo.Recipe.Member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    //GET Member
    @RequestMapping("/Member")
    public Member getMember(@PathVariable String memberId){
    return memberService.getMember(memberId) ;
    }

    //ADD Member
    @PostMapping("/Menber/{id}/Proflie")
    public Member addMember(@PathVariable  String memberId, Member member) {
        memberService.addMember(memberId, member);
    }

}

