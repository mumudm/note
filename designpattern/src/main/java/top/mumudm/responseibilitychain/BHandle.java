package top.mumudm.responseibilitychain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BHandle implements Handle {

    @Override
    public boolean process(String type) {
        log.info("b 执行了 ：{}", type);

        return true;
    }
}
