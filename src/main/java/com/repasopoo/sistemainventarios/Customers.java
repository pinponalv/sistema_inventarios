package com.repasopoo.sistemainventarios;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    private int id;
    private String name;
    //poder ver su historialCompras
    

    public Customers() {
    }

    public Customers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
