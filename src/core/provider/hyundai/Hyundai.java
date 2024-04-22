/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.provider.hyundai;

import core.provider.Engine;
import core.provider.Provider;
import core.provider.Wheel;

/**
 *
 * @author eduar
 */
public class Hyundai extends Provider {

    @Override
    public Wheel makeWheel(double radius, String material) {
        return new HyundaiWheel(radius, material);
    }

    @Override
    public Engine makeEngine(double weight, double cost) {
        return new HyundaiEngine(weight, cost);
    }
    
}
