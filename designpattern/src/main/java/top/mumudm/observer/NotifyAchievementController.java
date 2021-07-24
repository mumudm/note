package top.mumudm.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.mumudm.observer.customer.AchievementPublish;
import top.mumudm.observer.spring.NotifyAchievementEvent;

@RestController
@Slf4j
public class NotifyAchievementController {

    @Autowired
    AchievementPublish achievementPublish;
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/notify/{score}")
    public String notifyCustomerObserver(@PathVariable String score) {
        log.info("收到成绩：{}", score);
        // 业务逻辑

        // 通知
        achievementPublish.notifyAchievement(score);

        return "success";
    }

    @GetMapping("/notify/spring/{score}")
    public String notifySpringObserver(@PathVariable String score) {
        log.info("收到成绩：{}", score);
        // 业务逻辑

        // 通知
        applicationEventPublisher.publishEvent(new NotifyAchievementEvent(this, score));

        return "success";
    }
}
