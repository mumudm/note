package top.mumudm.responsibilitychain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AHandle implements Handle {

    @Override
    public boolean process(String type) {
        log.info("a 执行了 ：{}", type);

        return true;
    }
}
