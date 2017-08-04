package com.yhh.spring.data.jpa.example.repository;

import com.yhh.spring.data.jpa.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "SELECT a.* FROM user_group b LEFT JOIN user a on b.user_id = a.user_id WHERE b.group_id = ?1", nativeQuery = true)
    List<User> findAllByGroupId(Integer groupId);
}
