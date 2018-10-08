package com.iesemilidarder.proyecto.data;

public class Submarine extends WaterCraft implements IDive {
    public void goDeeper() {

    }

    public void goSurface() {

    }

    public void doFloat() {
        super.doFloat();
        System.out.println("floto, pero tambien me piro");
    }
}
