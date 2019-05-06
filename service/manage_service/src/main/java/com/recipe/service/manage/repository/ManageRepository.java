package com.recipe.service.manage.repository;

import com.recipe.service.manage.info.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ManageRepository extends CrudRepository<Menu, String> {
    int countAllByCategoryEquals(String Category);
    Menu save(Menu menu);
}
