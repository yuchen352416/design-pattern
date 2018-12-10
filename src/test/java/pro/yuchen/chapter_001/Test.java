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

    @org.junit.Test
    public void test_003() { // 甜甜购--面试题
        String str = " asdfjkltatyuiuytdfghj";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    char t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(arr);
    }

    @org.junit.Test
    public void test_004() { // 甜甜购--面试题
        for (int i = 10000; i <= 99999; i++) {
            int w1 = i / 10000;
            int w2 = i / 1000 % 10;
            int w3 = i / 100 % 10;
            int w4 = i / 10 % 10;
            int w5 = i % 10;

            if ((w1 == w2 && w3 == w4) || (w2 == w3 && w4 == w5)) {
                System.out.println(i);
            }
        }
    }

}
