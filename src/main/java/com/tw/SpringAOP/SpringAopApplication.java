package com.tw.SpringAOP;

import com.tw.SpringAOP.dao.AppDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO theAppDAO) {
        return runner -> {

            demoTheBeforeAdvice(theAppDAO);
        };
    }

    private void demoTheBeforeAdvice(AppDAO theAppDAO) {
        theAppDAO.addAccount();
    }
}
