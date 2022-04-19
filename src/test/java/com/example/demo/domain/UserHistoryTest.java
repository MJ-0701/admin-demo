package com.example.demo.domain;

import com.example.demo.repository.UserHistoryRepository;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserHistoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserHistoryRepository userHistoryRepository;

    @Test
    void userHistoryTest(){
        User user = new User();
        user.setEmail("jack2718@naver.com");
        user.setName("채명정");

        userRepository.save(user);

        user.setName("채명정1");
        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);


    }

}