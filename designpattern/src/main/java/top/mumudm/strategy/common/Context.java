package top.mumudm.strategy.common;

import top.mumudm.strategy.common.impl.StrategyAImpl;
import top.mumudm.strategy.common.impl.StrategyBImpl;

/**
 * @author mumu
 * @date 2021-5-19 14:56
 */
public class Context {

    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new StrategyAImpl();
        context.setStrategy(strategy);
        context.strategyMethod();
        System.out.println("-----------------");
        strategy = new StrategyBImpl();
        context.setStrategy(strategy);
        context.strategyMethod();
    }
}
