package com.example.Recipe;

public class MemberService {
    private static Member member;

    public MemberService(){}
    public static String addMember(String memberId, String username){
        member = new Member(memberId, username);

        return "success";
    }

    public static Member getMember(String memberId){
        member = new Member();
        member.setMemberId(memberId);

        return member;
    }
}
