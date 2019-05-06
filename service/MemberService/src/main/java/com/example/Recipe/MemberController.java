package com.example.Recipe;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class MemberController {
    private Member member;

    @RequestMapping("/Member/{memberId}")
    public Member getMember(@PathVariable String memberId){
        return MemberService.getMember(memberId) ;
    }

    //ADD Member
    @PostMapping("/Menber/{id}/Proflie")
    public Member addMember(@PathVariable  String id, @RequestBody Member memberWeb)  {
//        member = MemberService.(memberId, menu, menuFromWeb);
//        System.out.println("manage2 : "+manage);
        return  MemberService.addMember(id, member.getEmail(), member.getPassword(), member.getName());


    }
}
