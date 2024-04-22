/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.provider;

/**
 *
 * @author eduar
 */
public abstract class Provider {
    
    public abstract Wheel makeWheel(double radius, String material);
    public abstract Engine makeEngine(double weight, double cost);
    
    @Override
    public String toString() {
        String[] classRoute = getClass().getName().split("\\.");
        String className = classRoute[classRoute.length - 1];
        return className;
    }
    
}
