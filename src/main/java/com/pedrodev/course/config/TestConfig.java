package com.pedrodev.course.config;

import com.pedrodev.course.entities.User;
import com.pedrodev.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "9999999", "12345");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "91111111", "12345");

        userRepository.saveAll(Arrays.asList(user1, user2));

    }
}
