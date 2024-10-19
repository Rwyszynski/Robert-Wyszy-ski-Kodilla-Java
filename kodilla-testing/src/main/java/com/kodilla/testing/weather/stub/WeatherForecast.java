package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double avarageTemperature() {
        Double avarageTemp= 0.0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            avarageTemp = avarageTemp + temperature.getValue();

        }
        return avarageTemp/5;

    }

    public Double medianTemperature() {
        Double medianTemp = 0.0;
        List listOfTemp = new ArrayList();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            listOfTemp.add(temperature.getValue());
        }
        Collections.sort(listOfTemp);

        medianTemp = (Double) listOfTemp.get(2);
        return medianTemp;
    }
}