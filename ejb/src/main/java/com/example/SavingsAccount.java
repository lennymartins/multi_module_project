package com.example;

import javax.ejb.Stateless;
import java.util.List;

@Stateless(name = "svn")
public class SavingsAccount implements Account {
    @Override
    public String getString() {
        return "savings";
    }

    @Override
    public String testDB() {
        return "not this";
    }

    @Override
    public List<PpbmAddressDetail> testPU() {
        return null;
    }
}
