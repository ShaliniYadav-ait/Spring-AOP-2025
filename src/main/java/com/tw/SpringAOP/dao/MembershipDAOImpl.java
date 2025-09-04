package com.tw.SpringAOP.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addAccount() {
        System.out.println("Account added in membership DAO!");
    }

}
