package com.yhh.spring.data.jpa.example;

import com.yhh.spring.data.jpa.example.model.Group;
import com.yhh.spring.data.jpa.example.model.User;
import com.yhh.spring.data.jpa.example.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataJpaExampleApplication.class)
@Slf4j
@EnableAutoConfiguration
public class SpringDataJpaExampleApplicationTests {

    @Autowired
    private ExampleService exampleService;

    @Test
    public void test() {
        List<User> userList = exampleService.findAllUserByGroupId(1);
        log.info("Got userList from mysql, size is {}.", CollectionUtils.isEmpty(userList) ? 0 : userList.size());
    }

    @Test
    public void test2() {
        List<Group> groupList = exampleService.findGroupByGroupId(1);
        log.info("Got groupList from mysql, size is {}.", CollectionUtils.isEmpty(groupList) ? 0 : groupList.size());
    }

}
