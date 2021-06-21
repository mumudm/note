package strategy.duck;

/**
 * @author mumu
 * @date 2021-5-18 17:21
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    /**
     * 展示
     */
    public abstract void display();

    /**
     * 执行飞行
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 执行庸医
     */
    public void performQuack(){
        quackBehavior.quack();
    }

    /**
     * 游泳
     */
    public void swim(){
        System.out.println("All duck float, even decoys duck");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
