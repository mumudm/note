package top.mumudm.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Template {

    public void templateMethod() {
        init();

        service();

        destroy();
    }

    void init() {
        log.info("方法初始化");
    }

    protected abstract void service();

    protected abstract String templateType();

    void destroy() {
        log.info("方法销毁");
    }
}
