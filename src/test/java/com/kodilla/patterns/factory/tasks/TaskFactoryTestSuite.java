package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        boolean isDone = shopping.isTaskExecuted();
        //Then

        assertEquals("Vegatables", shopping.getTaskName());
        assertTrue(isDone);
    }

    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
       painting.executeTask();
        boolean isDone = painting.isTaskExecuted();
        //Then

        assertEquals("Car paint",painting.getTaskName());
        assertTrue(isDone);
    }

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        boolean isDone = driving.isTaskExecuted();
        //Then

        assertEquals("Airport transfer", driving.getTaskName());
        assertTrue(isDone);
    }
}
