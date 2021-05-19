package strategy.common.impl;

import strategy.common.Strategy;

/**
 * @author mumu
 * @date 2021-5-19 14:54
 */
public class StrategyBImpl implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("b 方法逻辑");
    }
}
