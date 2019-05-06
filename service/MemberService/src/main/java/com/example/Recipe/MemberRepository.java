package com.example.Recipe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<MemberTable, String> {
    int countAllByCategoryEquals(String Category);
    MemberTable save(MemberTable menu);
}