package top.mumudm.observer.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SquareNotifyAchievement implements ApplicationListener<NotifyAchievementEvent> {

    @Override
    public void onApplicationEvent(NotifyAchievementEvent notifyAchievementEvent) {
        log.info("广场通知成绩：{}", notifyAchievementEvent.getScore());
        log.info("广场通知成绩：{}", notifyAchievementEvent.toString());
    }
}
