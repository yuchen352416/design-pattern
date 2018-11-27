package pro.yuchen.chapter_002.observer;

import pro.yuchen.chapter_002.theme.Subject;

/**
 * 展示统计观察数据
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    Object data;

    public StatisticsDisplay() {}

    public StatisticsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("StatisticsDisplay: " + data);
    }

    public void update(Object o) {
        this.data = o;
    }
}
