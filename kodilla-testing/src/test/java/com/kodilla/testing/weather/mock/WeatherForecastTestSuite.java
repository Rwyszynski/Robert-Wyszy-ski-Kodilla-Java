package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("TDD: Forecast Test Suite ")
class ForumTestSuite {

    @Mock
    private static Temperatures temperaturesMock;

    @BeforeEach
    public void beforeEach() {
        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Nested
    @ExtendWith(MockitoExtension.class)
    class WeatherForecastTestSuite {

        @Test
        void testCalculateForecastWithMock() {
            //Given

            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }

        @Test
        void testAvarageTemperature() {
            //Given

            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double avgTemp = weatherForecast.avarageTemperature();

            //Then
            Assertions.assertEquals(25.56, avgTemp);
        }

        @Test
        void testMedianTemperature() {
            //Given

            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double medTemp = weatherForecast.medianTemperature();

            //Then
            Assertions.assertEquals(25.5, medTemp);
        }
    }
}