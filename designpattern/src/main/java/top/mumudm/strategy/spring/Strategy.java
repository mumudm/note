package top.mumudm.strategy.spring;

/**
 * @author mumu
 * @date 2021-5-19 14:28
 */
public interface Strategy {

    /**
     * 策略方法
     * @param content
     */
    void strategyMethod(String content);

    String getStrategyType();
}
