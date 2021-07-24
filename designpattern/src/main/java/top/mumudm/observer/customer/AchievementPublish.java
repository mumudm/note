package top.mumudm.observer.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 公布成绩
 */
@Component
@Slf4j
public class AchievementPublish {

    private final Set<NotifyAchievement> observers = new HashSet<>();

    public void addObserver(NotifyAchievement notifyAchievement){
        observers.add(notifyAchievement);
    }

    public void notifyAchievement(String score){
        if(CollectionUtils.isEmpty(observers)){
            log.info("AchievementPublish not has listener");
        }
        observers.forEach(observer -> observer.publish(score));
    }
}
