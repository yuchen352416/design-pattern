package pro.yuchen.chapter_001;

import pro.yuchen.chapter_001.behavior.FlyRocketPowered;

public class Test {

    @org.junit.Test
    public void test_001() {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();
        duck.swim();
    }

    @org.junit.Test
    public void test_002() {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }


}
