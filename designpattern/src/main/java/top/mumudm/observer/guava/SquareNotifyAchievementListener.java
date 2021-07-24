package top.mumudm.observer.guava;


import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SquareNotifyAchievementListener {

    @Subscribe
    public void publish(ScoreEvent score) {
        log.info("广场通知成绩：{}", score.getScore());
    }
}
