package com.yhh.spring.data.jpa.example.service;

import com.yhh.spring.data.jpa.example.model.Group;
import com.yhh.spring.data.jpa.example.model.User;
import com.yhh.spring.data.jpa.example.repository.GroupRepository;
import com.yhh.spring.data.jpa.example.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ExampleService {

    private final GroupRepository groupRepository;

    private final UserRepository userRepository;

    @Autowired
    public ExampleService(GroupRepository groupRepository, UserRepository userRepository) {
        this.groupRepository = groupRepository;
        this.userRepository = userRepository;
    }

    public List<Group> findGroupByGroupId(Integer id) {
        return groupRepository.findGroupByGroupId(id);
    }

    public List<User> findAllUserByGroupId(Integer id) {
        return userRepository.findAllByGroupId(id);
    }

}
