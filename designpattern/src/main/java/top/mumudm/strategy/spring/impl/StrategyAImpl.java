package top.mumudm.strategy.spring.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.mumudm.strategy.spring.Strategy;
import top.mumudm.strategy.spring.StrategyTypeEnum;

/**
 * @author mumu
 * @date 2021-5-19 14:54
 */
@Component
@Slf4j
public class StrategyAImpl implements Strategy {
    @Override
    public void strategyMethod(String content) {
        log.info("a 方法逻辑");
    }

    @Override
    public String getStrategyType() {
        return StrategyTypeEnum.A.getType();
    }
}
