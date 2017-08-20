package com.yhh.spring.data.jpa.example.repository;


import com.yhh.spring.data.jpa.example.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {

    @Query(value = "SELECT * FROM `group` WHERE group_id = ?1", nativeQuery = true)
    List<Group> findGroupByGroupId(Integer groupId);

    //entityName is a keyword, it not work in this situation.
    @Query(value = "SELECT g FROM #{#entityName} g WHERE g.groupId = ?1")
    List<Group> findGroupByGroupId1(Integer groupId);

}
