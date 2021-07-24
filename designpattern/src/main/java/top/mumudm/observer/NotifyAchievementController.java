package top.mumudm.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.mumudm.observer.customer.AchievementPublish;

@RestController
@Slf4j
public class NotifyAchievementController {

    @Autowired
    AchievementPublish achievementPublish;

    @GetMapping("/notify/{score}")
    public String notifyCustomerObserver(@PathVariable String score){
        log.info("收到成绩：{}" ,score);
        // 业务逻辑

        // 通知
        achievementPublish.notifyAchievement(score);

        return "success";
    }
}
