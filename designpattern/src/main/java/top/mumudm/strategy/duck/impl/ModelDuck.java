package top.mumudm.strategy.duck.impl;

import top.mumudm.strategy.duck.Duck;

/**
 * @author mumu
 * @date 2021-5-18 17:42
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
