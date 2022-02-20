package com.example;

import javax.ejb.Stateless;

@Stateless
public class ChequeAccount implements Account {
    @Override
    public String getString() {
        return "string";
    }
}
