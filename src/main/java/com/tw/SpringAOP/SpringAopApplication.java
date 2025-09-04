package com.tw.SpringAOP;

import com.tw.SpringAOP.dao.AppDAO;
import com.tw.SpringAOP.dao.MembershipDAO;
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
    public CommandLineRunner commandLineRunner(AppDAO theAppDAO, MembershipDAO theMembershipDAO) {
        return runner -> {

            demoTheBeforeAdvice(theAppDAO, theMembershipDAO);
        };
    }

    private void demoTheBeforeAdvice(AppDAO theAppDAO, MembershipDAO theMembershipDAO) {
        theAppDAO.addAccount();

        System.out.println("Calling again!");

        theMembershipDAO.addAccount();
    }
}
