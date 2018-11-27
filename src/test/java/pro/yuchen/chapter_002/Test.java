package pro.yuchen.chapter_002;

import pro.yuchen.chapter_002.observer.*;
import pro.yuchen.chapter_002.theme.Subject;
import pro.yuchen.chapter_002.theme.WeatherData;

public class Test {

    @org.junit.Test
    public void test_001() {
        // 创建主题
        Subject weather = new WeatherData();
        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weather);
        ForecastDisplay forecast = new ForecastDisplay(weather);
        StatisticsDisplay statistics = new StatisticsDisplay(weather);
        ThirdPartyDisplay thirdParty = new ThirdPartyDisplay(weather);

        weather.notifyObservers();
        current.display();
        forecast.display();
        statistics.display();
        thirdParty.display();

        weather.removeObserver(thirdParty);

        weather.notifyObservers();
        current.display();
        forecast.display();
        statistics.display();
        thirdParty.display();

    }

    @org.junit.Test
    public void test_002() {

    }


}
