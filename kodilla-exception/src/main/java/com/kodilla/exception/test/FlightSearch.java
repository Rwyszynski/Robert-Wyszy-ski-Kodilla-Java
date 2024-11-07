package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    Map<String, Boolean> airports = Map.of("London", true,
            "Heathrow", false,
            "Seatle", true,
            "Bristol", false,
            "New York", true);

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Boolean isExistDeparture = airports.containsKey(flight.getDepartureAirport());
        if (!isExistDeparture) {
            throw new RouteNotFoundException("Nie istnieje lotnisko początkowe");
        }
        Boolean canWeFly = airports.get(flight.getDepartureAirport());
        if (canWeFly == null || !canWeFly) {
            throw new RouteNotFoundException("Nie możemy lecieć");
        }
    }

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(new Flight("London", "Bristol") );
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}


