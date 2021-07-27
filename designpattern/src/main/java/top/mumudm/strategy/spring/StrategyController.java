package top.mumudm.strategy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("strategy")
public class StrategyController {


    @Autowired
    StrategyHandleFactory strategyHandleFactory;

    @GetMapping("spring/{type}")
    public String execute(@PathVariable String type) {
        strategyHandleFactory.getStrategy(type).strategyMethod(type);

        return "success";
    }
}
