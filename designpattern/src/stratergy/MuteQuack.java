package stratergy;

/**
 * @author mumu
 * @date 2021-5-18 17:30
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
