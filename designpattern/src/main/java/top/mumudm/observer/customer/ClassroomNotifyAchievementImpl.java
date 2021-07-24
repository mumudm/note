package top.mumudm.observer.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ClassroomNotifyAchievementImpl implements NotifyAchievement {

    @Override
    public void publish(String score) {
        log.info("教室通知成绩：{}", score);
    }
}
