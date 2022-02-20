package com.example.remote;

import javax.ejb.Stateless;

@Stateless(name = "lcl")
public class LocalCarImpl implements LocalCar {
    @Override
    public String getLocalCar() {
        return "bmw local";
    }
}
