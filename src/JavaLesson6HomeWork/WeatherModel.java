package JavaLesson6HomeWork;

import java.time.Period;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;

    public List<Weather> getSavedToDBWeather();
}