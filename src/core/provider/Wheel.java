/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.provider;

/**
 *
 * @author eduar
 */
public abstract class Wheel {
    
    protected double radius;
    protected String material;

    public Wheel(double radius, String material) {
        this.radius = radius;
        this.material = material;
        System.out.println(this + " created");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + radius + ", " + material + ")";
    }

    public double getRadius() {
        return radius;
    }
    
}
