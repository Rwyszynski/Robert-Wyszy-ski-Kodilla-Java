package com.kodilla.stream.world;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent asia = new Continent();
        Continent africa = new Continent();
        Continent northAmerica = new Continent();
        Continent southAmerica = new Continent();
        Continent australia = new Continent();
        Continent europe = new Continent();

        Country Germany = new Country(new BigDecimal(84480000));
        Country Montenegro = new Country(new BigDecimal(616177));
        Country Bosnia = new Country(new BigDecimal(3211000));
        Country Moldova = new Country(new BigDecimal(2487000));
        europe.addCountry(Germany);
        europe.addCountry(Montenegro);
        europe.addCountry(Bosnia);
        europe.addCountry(Moldova);

        Country Australia = new Country(new BigDecimal(26640000));
        Country NewZeland = new Country(new BigDecimal(5223000));
        Country Papua = new Country(new BigDecimal(9593000));
        australia.addCountry(Australia);
        australia.addCountry(NewZeland);
        australia.addCountry(Papua);

        Country USA = new Country(new BigDecimal(334900000));
        Country Mexico = new Country(new BigDecimal(128500000));
        Country Panama = new Country(new BigDecimal(4468000));
        Country Canada = new Country(new BigDecimal(40100000));
        northAmerica.addCountry(USA);
        northAmerica.addCountry(Mexico);
        northAmerica.addCountry(Panama);
        northAmerica.addCountry(Canada);

        Country Bolivia = new Country(new BigDecimal(12390000));
        Country Paraguay = new Country(new BigDecimal(6682000));
        Country Wenezuela = new Country(new BigDecimal(28840000));
        southAmerica.addCountry(Bolivia);
        southAmerica.addCountry(Paraguay);
        southAmerica.addCountry(Wenezuela);

        Country India = new Country(new BigDecimal(1429000000));
        Country Mianmar = new Country(new BigDecimal(54580000));
        Country Philipines = new Country(new BigDecimal(117000000));
        asia.addCountry(India);
        asia.addCountry(Mianmar);
        asia.addCountry(Philipines);

        Country Ethiopia = new Country(new BigDecimal(126000000));
        Country Namibia = new Country(new BigDecimal(2484000));
        Country Angola = new Country(new BigDecimal(36680000));
        africa.addCountry(Ethiopia);
        africa.addCountry(Namibia);
        africa.addCountry(Angola);

        World world = new World();
        world.addContinents(asia);
        world.addContinents(africa);
        world.addContinents(australia);
        world.addContinents(europe);
        world.addContinents(northAmerica);
        world.addContinents(southAmerica);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity(world);

        //Then
        BigDecimal expectedPeople = new BigDecimal("2453874177");
        assertEquals(expectedPeople, totalPeople);
    }
}
