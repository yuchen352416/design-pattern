package pro.yuchen.chapter_002.observer;

import pro.yuchen.chapter_002.theme.Subject;

/**
 * 第三方接入展示观察者数据
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    Object data;

    public ThirdPartyDisplay() {}

    public ThirdPartyDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("ThirdPartyDisplay: " + data);
    }

    public void update(Object o) {
        this.data = o;
    }
}
