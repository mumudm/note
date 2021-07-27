package top.mumudm.strategy.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mumu
 * @date 2021-5-19 14:56
 */
@Component
public class StrategyHandleFactory implements ApplicationContextAware, InitializingBean {

    private ApplicationContext context;

    private final Map<String, Strategy> map = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void afterPropertiesSet() {
        context.getBeansOfType(Strategy.class)
                .values()
                .forEach(handler -> map.put(handler.getStrategyType(), handler));
    }

    public StrategyHandle getStrategy(String type){
        Strategy strategy = map.get(type);
        if(strategy == null){
            throw new RuntimeException("invalid type");
        }
        return new StrategyHandle(strategy);
    }
}
