package com.example.remote;

import javax.ejb.Stateless;

@Stateless(name = "bmw")
public class RemoteCarImpl implements RemoteCar {
    @Override
    public String getRemoteCar() {
        return "bmw remote";
    }

}
