package top.mumudm.observer.customer;

public interface NotifyAchievement {

    /**
     * 通知成绩
     * @param score 成绩
     // * @param notifyType 接受类型 1广场通知、2教室通知、3校内广播。。。。
     */
    void publish(String score);

}
