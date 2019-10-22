/*
* 观察者模式：定义了对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖者都会收到通知并自动更新
* 当两个对象之间松耦合，它们依然可以交互，但是不清楚彼此的细节。
* 观察者模式提供了一种对象设计，让主题和观察者之间松耦合。
*
* 设计原则1：为了交互对象之间的松耦合而努力
*
* 详解：在观察者模式中，会改变的是主题的状态，以及观察者的数目和类型。用这个模式，可以改变依赖于主题状态的对象，不必改变主题。
*
*
* */


public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(90,72,30.6f);
    }
}
