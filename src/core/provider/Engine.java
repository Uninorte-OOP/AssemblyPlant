/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.provider;

/**
 *
 * @author eduar
 */
public abstract class Engine {
    
    protected double weight;
    protected double cost;

    public Engine(double weight, double cost) {
        this.weight = weight;
        this.cost = cost;
        System.out.println(this + " created");
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + weight + ", " + cost + ")";
    }
    
}
