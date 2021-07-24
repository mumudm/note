package top.mumudm.strategy.duck.impl;

import top.mumudm.strategy.duck.FlyBehavior;

/**
 * @author mumu
 * @date 2021-5-18 17:37
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wing");
    }
}
