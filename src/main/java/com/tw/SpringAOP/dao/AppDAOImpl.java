package com.tw.SpringAOP.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AppDAOImpl implements AppDAO {

    @Override
    public void addAccount() {
        System.out.println("Account added!");
    }

}
