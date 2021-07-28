package top.mumudm.template;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TemplateFactory implements ApplicationContextAware, InitializingBean {

    private ApplicationContext context;

    private final Map<String, Template> map = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void afterPropertiesSet() {
        context.getBeansOfType(Template.class)
                .values()
                .forEach(template -> map.put(template.templateType(), template));
    }

    public Template getTemplate(String type){
        Template template = map.get(type);
        if(template == null){
            throw new RuntimeException("invalid type");
        }
        return template;
    }
}