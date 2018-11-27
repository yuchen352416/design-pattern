package pro.yuchen.chapter_002.observer;

import pro.yuchen.chapter_002.theme.Subject;

/**
 * 预测展示观察者数据
 */
public class ForecastDisplay implements Observer, DisplayElement {

    Object data;

    public ForecastDisplay() {}

    public ForecastDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("ForecastDisplay: " + data);
    }

    public void update(Object o) {
        this.data = o;
    }
}
