package top.mumudm.observer.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SquareNotifyAchievementImpl implements NotifyAchievement {

    @Override
    public void publish(String score) {
        log.info("广场通知成绩：{}", score);
    }
}
