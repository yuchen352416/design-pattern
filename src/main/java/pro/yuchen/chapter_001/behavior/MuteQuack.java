package pro.yuchen.chapter_001.behavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不会叫...");
    }
}
