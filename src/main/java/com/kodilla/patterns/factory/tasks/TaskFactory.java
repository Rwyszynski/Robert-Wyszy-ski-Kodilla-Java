package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    List<Task> tasks = new ArrayList<Task>();

    public final Task makeTask(final String task) {
        return switch (task) {
            case SHOPPING -> new ShoppingTask("Vegatables", "Tomatoes", 20);
            case PAINTING -> new PaintingTask("Car paint", "blue", "BMW");
            case DRIVING -> new DrivingTask("Airport transfer", "Chopin Airport", "Van");
            default -> null;
        };
    }
}
