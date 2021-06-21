package strategy.duck.impl;

import strategy.duck.QuackBehavior;

/**
 * @author mumu
 * @date 2021-5-18 17:29
 */
public class Quack implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("quack~~~");
    }

}
