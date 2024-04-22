/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.provider.hyundai.Hyundai;
import core.provider.renault.Renault;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author eduar
 */
public class AssemblyPlant {
    
    private int maxCars;
    private ArrayList<Car> cars;

    public AssemblyPlant(int maxCars) {
        this.maxCars = maxCars;
        this.cars = new ArrayList<>();
        System.out.println("Assembly Plant started, waiting for Cars...\n");
    }
    
    public boolean addCar(Car car) {
        if (this.cars.size() < this.maxCars) {
            this.cars.add(car);
            System.out.println("Car " + this.cars.size() + " added to Assembly Plant\n");
            return true;
        }
        System.out.println("Car limit reached, unable to add new Car\n");
        return false;
    }
    
    private ArrayList<String> getProviderTypes() {
        ArrayList<String> types = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getProvider() instanceof Renault) {
                types.add("Renault");
            } else if (car.getProvider() instanceof Hyundai) {
                types.add("Hyundai");
            }
        }
        return types;
    }
    
    public void providerSummary() {
        System.out.println("Providers Summary:\n");
        
        ArrayList<String> types = getProviderTypes();
        System.out.println("- Cars using Renault = " + Collections.frequency(types, "Renault"));
        System.out.println("- Cars using Hyundai = " + Collections.frequency(types, "Hyundai") + "\n");
        
        for (int i = 0; i < types.size(); i++) {
            System.out.println("- Car " + (i + 1) + " uses " + types.get(i) + " Provider");
        }
        System.out.println("");
    }
    
    public Car getCarBiggestWheel() {
        Car maxCar = null;
        double maxRadius = -1;
        for (Car car : this.cars) {
            if (car.getWheel().getRadius() > maxRadius) {
                maxRadius = car.getWheel().getRadius();
                maxCar = car;
            }
        }
        return maxCar;
    }
    
}
