package com.iesemilidarder.proyecto.data;

public abstract class Vehicle {
    public abstract void start();

    public void brake() {
        System.out.println("he frenado");
    }
}
