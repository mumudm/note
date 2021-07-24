package top.mumudm.observer.spring;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ClassroomNotifyAchievement implements ApplicationListener<NotifyAchievementEvent> {

    @Override
    public void onApplicationEvent(NotifyAchievementEvent notifyAchievementEvent) {
        log.info("教室通知成绩：{}", notifyAchievementEvent.getScore());
    }
}
