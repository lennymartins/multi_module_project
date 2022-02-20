package com.example;

import com.example.longrange.Bird;

import javax.ejb.Stateless;

@Stateless(name = "brd")
public class WeaverBird implements Bird {
    @Override
    public String getBird() {
        return "weaver";
    }
}
