package pro.yuchen.chapter_002.observer;

import pro.yuchen.chapter_002.theme.Subject;

/**
 * 展示默认观察数据
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Object data;

    public CurrentConditionsDisplay() {}

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay: " + data);
    }

    public void update(Object o) {
        this.data = o;
    }
}
