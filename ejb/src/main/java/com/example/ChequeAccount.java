package com.example;

import javax.ejb.Stateless;

@Stateless(name = "chk")
public class ChequeAccount implements Account {
    @Override
    public String getString() {
        return "string";
    }
}
