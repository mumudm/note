package strategy.common.impl;

import strategy.common.Strategy;

/**
 * @author mumu
 * @date 2021-5-19 14:54
 */
public class StrategyAImpl implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("a 方法逻辑");
    }
}
