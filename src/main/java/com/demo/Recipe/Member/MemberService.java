package com.demo.Recipe.Member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private Member member;

    public MemberService(){}

    public Member getMember(String memberId){
        return new Member(memberId);
    }

    public String addMember(String memberId){
        return "Success";
    }
}
