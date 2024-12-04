package com.kodilla.patterns.builder.bigmac;
import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("Bacon")
                .ingredients("Pickle")
                .bun("Sezame bun")
                .burgers(2)
                .sauce("Garlic")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);
    }
}
