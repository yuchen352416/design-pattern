package pro.yuchen.chapter_001;

import pro.yuchen.chapter_001.behavior.FlyWithWings;
import pro.yuchen.chapter_001.behavior.Quack;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
