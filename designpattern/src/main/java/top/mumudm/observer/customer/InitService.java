package top.mumudm.observer.customer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * IOC 容器加载完成后把观察者对象注册到成绩发布出，即 {@link AchievementPublish}
 */
@Component
public class InitService implements ApplicationContextAware, ApplicationRunner {

    private ApplicationContext context;

    @Autowired
    private AchievementPublish achievementPublish;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<String, NotifyAchievement> beans = context.getBeansOfType(NotifyAchievement.class);
        beans.values().forEach(notifyAchievement -> achievementPublish.addObserver(notifyAchievement));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
