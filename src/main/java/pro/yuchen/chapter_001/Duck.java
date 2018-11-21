package pro.yuchen.chapter_001;

import pro.yuchen.chapter_001.behavior.FlyBehavior;
import pro.yuchen.chapter_001.behavior.QuackBehavior;

public abstract class Duck {
    /**
     * 鸭子叫
     */
    protected QuackBehavior quackBehavior;

    /**
     * 鸭子飞
     */
    protected FlyBehavior flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks  oat, even decoys!");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
