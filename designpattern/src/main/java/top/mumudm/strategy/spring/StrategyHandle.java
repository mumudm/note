package top.mumudm.strategy.spring;

/**
 * @author mumu
 * @date 2021-5-19 14:56
 */
public class StrategyHandle {

    private Strategy strategy;

    public StrategyHandle() {
    }

    public StrategyHandle(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(String content) {
        strategy.strategyMethod(content);
    }


}
