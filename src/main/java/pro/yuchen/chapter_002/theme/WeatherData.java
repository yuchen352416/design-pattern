package pro.yuchen.chapter_002.theme;

import pro.yuchen.chapter_002.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    /**
     * 观察者列表
     */
    List<Observer> observers = new ArrayList<Observer>();

    /**
     * 主题数据
     */
    Integer data = 0;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        // 主题修改数据, 并通知观察者们
        data++;
        for (Observer o : observers) {
            o.update(data);
        }
    }
}
