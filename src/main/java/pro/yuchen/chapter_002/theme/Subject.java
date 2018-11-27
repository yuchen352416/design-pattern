package pro.yuchen.chapter_002.theme;

import pro.yuchen.chapter_002.observer.Observer;

public interface Subject {

    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者们
     */
    void notifyObservers();

}
