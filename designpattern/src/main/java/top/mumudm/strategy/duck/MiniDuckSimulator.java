package top.mumudm.strategy.duck;

import top.mumudm.strategy.duck.impl.FlyRocketPowered;
import top.mumudm.strategy.duck.impl.MallardDuck;
import top.mumudm.strategy.duck.impl.ModelDuck;

/**
 * 小鸭子模拟器
 *
 * @author mumu
 * @date 2021-5-18 17:32
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("======================================");

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }

}
