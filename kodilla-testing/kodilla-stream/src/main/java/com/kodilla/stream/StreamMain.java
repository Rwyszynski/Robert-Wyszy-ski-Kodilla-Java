package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.beautifier.*;
public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("That is a text to change.", (toBeautify) -> toBeautify.toUpperCase() );
        poemBeautifier.beautify("That is a text to change.", (toBeautify) -> toBeautify + "ABC" );
        poemBeautifier.beautify("That is a text to change.", (toBeautify) ->  "ABC " + toBeautify);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}