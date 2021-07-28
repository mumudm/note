package top.mumudm.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BTemplate extends Template{

    @Override
    protected void service() {
        log.info("b 模板执行");
    }

    @Override
    protected String templateType() {
        return "b";
    }

}
