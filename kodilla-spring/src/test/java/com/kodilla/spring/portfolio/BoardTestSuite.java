package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){}
    //Given
    ApplicationContext context = new AnnotationConfigApplicationContext(Board.class);
    //When
    Board board = context.getBean("board", Board.class);

    //Then

}
