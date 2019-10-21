public class Main {
    public static void main(String[] args){
        WeatherData wd = new WeatherData();
        CurrentConditionDisplay cd = new CurrentConditionDisplay(wd);
        ForecastDisplay fd = new ForecastDisplay(wd);

        wd.setMeasurements(80,65,30.4f);
        wd.setMeasurements(85,60,30.2f);
        wd.setMeasurements(83,63,30.1f);

    }
}
