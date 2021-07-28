package top.mumudm.responseibilitychain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CHandle implements Handle {

    @Override
    public boolean process(String type) {
        log.info("c 执行了 ：{}", type);

        return true;
    }
}
