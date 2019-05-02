package com.example.Recipe;

public class Member {
   private String memberId;
   private String username;

   public Member(){}
   public Member(String memberId, String username){
      this.memberId = memberId;
      this.username = username;
   }


   public String getMemberId() {
      return memberId;
   }

   public String getUsername() {
      return username;
   }

   public void setMemberId(String memberId) {
      this.memberId = memberId;
   }

   public void setUsername(String username) {
      this.username = username;
   }
}
