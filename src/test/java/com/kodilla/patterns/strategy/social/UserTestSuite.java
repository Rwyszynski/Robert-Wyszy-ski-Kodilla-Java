package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mark = new Millenials("Mark Whalberg");
        User peter = new YGeneration("Peter Novotny");
        User dimitr = new ZGeneration("Dmitr Czuczkin");
        //When
        String marksChoice = mark.sharePost();
        System.out.println(marksChoice);
        String petersChoice = peter.sharePost();
        System.out.println(petersChoice);
        String dimitrChoice = dimitr.sharePost();
        System.out.println(dimitrChoice);

        //Then
        assertEquals("I'm Facebook user", marksChoice);
        assertEquals("I'm Twitter user", petersChoice);
        assertEquals("I'm Snapchat user", dimitrChoice);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User peter = new YGeneration("Peter Nowotny");

        //When
        String petersChoice = peter.sharePost();
        System.out.println("Peter " + petersChoice);
        SnapchatPublisher snapchatPublisher = new SnapchatPublisher();
        peter.setDifferentPublisher(snapchatPublisher);
        petersChoice = peter.sharePost();
        System.out.println("Peter now " + petersChoice);

        //Then
        assertEquals("I'm Snapchat user", petersChoice);
    }
}
