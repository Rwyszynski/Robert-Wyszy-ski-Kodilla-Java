package com.kodilla.patterns.singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("nr1");
        logger.log("nr2");
        logger.log("nr3");
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("nr3", lastLog);
    }
}
