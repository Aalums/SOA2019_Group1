package com.example.MemberService.repository;

import com.example.MemberService.model.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {
    Member save(Member member);
    Member findMemberByUsername(String username);
}
