package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;
    @Autowired
    private TaskList toDoList;
    @Autowired
    private TaskList inProgressList;
    @Autowired
    private TaskList doneList;

    @Test
    void test1TaskAdd() {
        //Given
        //When
        toDoList.addTask("task1");

        //Then
        Assertions.assertEquals("task1", board.getToDoList().getTasks().get(0));
    }

    @Test
    void test2TaskAdd() {
        //Given
        //When
        inProgressList.addTask("task2");

        //Then
        Assertions.assertEquals("task2", board.getInProgressList().getTasks().get(0));
    }

    @Test
    void test3TaskAdd() {
        //Given
        //When
        doneList.addTask("task3");

        //Then
        Assertions.assertEquals("task3", board.getDoneList().getTasks().get(0));
    }
}
