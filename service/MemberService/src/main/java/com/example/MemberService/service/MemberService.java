package com.example.MemberService.service;

import com.example.MemberService.model.Member;
import com.example.MemberService.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public Member addMember(Member member)  {
        memberRepository.save(member);
        return member;
    }

    public Member getMember(String username){
        //call repo
        return memberRepository.findMemberByUsername(username);
    }
}
