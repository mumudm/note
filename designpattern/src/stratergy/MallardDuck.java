package stratergy;

/**
 * 野鸭
 *
 * @author mumu
 * @date 2021-5-18 17:33
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }
}
