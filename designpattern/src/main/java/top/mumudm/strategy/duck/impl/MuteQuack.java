package top.mumudm.strategy.duck.impl;

import top.mumudm.strategy.duck.QuackBehavior;

/**
 * @author mumu
 * @date 2021-5-18 17:30
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
