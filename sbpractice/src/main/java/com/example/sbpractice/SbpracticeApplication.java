package com.example.sbpractice;

import com.example.sbpractice.model.User;
import com.example.sbpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbpracticeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbpracticeApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Zali", "S", "zali@gmail.com"));
        this.userRepository.save(new User("Leah", "S", "leah@gmail.com"));
        this.userRepository.save(new User("Meg", "C", "meg@gmail.com"));
    }
}
