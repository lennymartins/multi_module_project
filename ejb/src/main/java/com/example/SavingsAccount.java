package com.example;

import javax.ejb.Stateless;

@Stateless(name = "svn")
public class SavingsAccount implements Account {
    @Override
    public String getString() {
        return "savings";
    }
}
