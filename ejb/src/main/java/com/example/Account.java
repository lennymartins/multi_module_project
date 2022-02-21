package com.example;

import javax.ejb.Local;
import java.util.List;

@Local
public interface Account {

    String getString();

    public String testDB();
    public List<PpbmAddressDetail> testPU();
}
