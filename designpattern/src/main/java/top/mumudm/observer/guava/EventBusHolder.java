package top.mumudm.observer.guava;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EventBusHolder {

    private EventBusHolder() {
    }

    private static class Holder{
        private static EventBus eventBus = new EventBus("test");
    }

    private static class AsyncHolder{
        private static EventBus eventBus = new AsyncEventBus("async-test",
                new ThreadPoolExecutor(
                10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>()));
    }

    public static EventBus getAsyncHolder(){
        EventBus eventBus = AsyncHolder.eventBus;
        eventBus.register(new ClassroomNotifyAchievementListener());
        eventBus.register(new SquareNotifyAchievementListener());
        return eventBus;
    }

    public static EventBus getHolder(){
        EventBus eventBus = Holder.eventBus;
        eventBus.register(new ClassroomNotifyAchievementListener());
        eventBus.register(new SquareNotifyAchievementListener());
        return eventBus;
    }

}
