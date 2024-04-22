/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.provider.Engine;
import core.provider.Provider;
import core.provider.Wheel;
import core.provider.hyundai.Hyundai;
import core.provider.renault.Renault;

/**
 *
 * @author eduar
 */
public class Car {
    
    private Provider provider;
    private Wheel wheel;
    private Engine engine;

    public Car(String provider, double radius, String material, double weight, double cost) {
        this.provider = null;
        if (provider.equals("Renault")) {
            this.provider = new Renault();
        } else if (provider.equals("Hyundai")) {
            this.provider = new Hyundai();
        }
        
        this.wheel = this.provider.makeWheel(radius, material);
        this.engine = this.provider.makeEngine(weight, cost);
    }

    @Override
    public String toString() {
        return "Car(" + provider + ")";
    }
    
    public Provider getProvider() {
        return provider;
    }

    public Wheel getWheel() {
        return wheel;
    }
    
}
