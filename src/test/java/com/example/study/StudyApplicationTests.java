package com.example.study;

import com.example.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

    @Test
    void contextLoads() {
        User user1=new User();
        User user2=user1;
        System.out.println(user1.equals(user2));
    }

}
