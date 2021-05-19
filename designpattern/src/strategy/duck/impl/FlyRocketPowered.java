package strategy.duck.impl;

import strategy.duck.FlyBehavior;

/**
 * @author mumu
 * @date 2021-5-18 17:44
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
