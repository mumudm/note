package top.mumudm.observer.spring;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@ToString
@Getter
public class NotifyAchievementEvent extends ApplicationEvent {

    private String score;

    public NotifyAchievementEvent(Object source) {
        super(source);
    }


    public NotifyAchievementEvent(Object source, String score) {
        super(source);
        this.score = score;
    }
}
