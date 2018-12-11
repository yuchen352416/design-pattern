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

    @org.junit.Test
    public void test_005() { // 牛客网--面试题
        Test test = new Test();

        int i = test.test_inner_005();
        System.out.println(i);
    }

    public int test_inner_005() {
        try {
            int i = 0 / 10;
            return i;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 1;
        } finally {
            System.out.println("finally...");
        }
    }

    @org.junit.Test
    public void test_006() {
        short a = 128;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);
    }

    @org.junit.Test
    public void test_007() {
        int t = test_inner_007();
        System.out.println(t);
    }

    public int test_inner_007() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    @org.junit.Test
    public void test_008() {
        class Demo {
            Demo() {
                test();
            }
            public void test() {
                System.out.println("Super.test()");
            }
        }

        class TestDemo extends Demo {
            TestDemo() {
                super.test();
            }
            @Override
            public void test() {
                System.out.println("Sub.test()");
            }
        }

        TestDemo demo = new TestDemo();
        demo.test();
    }
}
