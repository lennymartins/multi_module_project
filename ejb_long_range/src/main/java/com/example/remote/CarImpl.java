package com.example.remote;

import javax.ejb.Stateless;

@Stateless(name = "cars")
public class CarImpl implements LocalCar, RemoteCar {
    @Override
    public String getLocalCar() {
        return "local";
    }

    @Override
    public String getRemoteCar() {
        return "remote";
    }
}
