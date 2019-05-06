package com.example.Recipe;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.ValueEventListener;
import org.springframework.beans.factory.annotation.Autowired;


public class MemberService {
    @Autowired

    MemberRepository memberRepository;

    private static Member member;



    public MemberService(){}

    public static Member addMember(String username, String email, String password, String name)  {
        member = new Member(username, email, password, name);

        MemberTable memberTable = new MemberTable();
        memberTable.setEmail(member.getEmail());
        memberTable.setName(member.getName());
        memberTable.setPassword(member.getPassword());
        memberTable.setUsername(member.getUsername());



        //call repo //save menu
        memberRepository.save(memberTable);


        return member;
    }

    public static Member getMember(String memberId){
        member = new Member();
        member.setUsername(memberId);

        return member;
    }
}
