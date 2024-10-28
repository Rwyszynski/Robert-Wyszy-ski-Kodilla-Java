package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

interface ArrayOperations {

    static double getAverage (int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers[i]));

        OptionalDouble avarageArray = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();

        return avarageArray.getAsDouble();
    }
}

/*
        przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
        wyświetlić kolejne elementy tablicy, a następnie:

        przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int
        endExclusive), a także kolektora average() obliczyć średnią. Na końcu metoda powinna zwracać
        średnią jako wynik typu double.

         */




