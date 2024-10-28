package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(World world) {
        return  (BigDecimal) continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    public void addContinents(Continent continent){
        continents.add(continent);
    }
}
