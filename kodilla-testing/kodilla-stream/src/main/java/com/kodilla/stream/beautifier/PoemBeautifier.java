package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String toBeautify, PoemDecorator poem) {

        String result = poem.decorate(toBeautify);
        System.out.println(result);
    }

}
