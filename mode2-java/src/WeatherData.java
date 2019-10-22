/*
* 利用java.util.Observable的不便之处
*
* 1.Observable是一个类，不是一个接口，也没有实现一个接口，限制了它的使用和复用。
*   如果一个类想同时继承Observable类和另一个超类的行为，将无法实现，因为java不支持多重继承。
*   再者，没有Observable接口，无法建立自己的实现，和java内置的Observer API搭配使用；
*   也无法将java.util的实现换成另一套做法的实现。
*
* 2.Observable将setChanged（）方法保护起来了，意味着除非继承自Observable，否则无法创建Observable实例并组合到自己的对象中来。
*   违反了设计原则中的“多用组合，少用继承”。
*
* */

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
