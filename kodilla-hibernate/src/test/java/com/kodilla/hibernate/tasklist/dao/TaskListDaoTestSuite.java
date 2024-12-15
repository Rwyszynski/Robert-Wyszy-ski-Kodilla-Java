package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "List1";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("List1", "Description");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(name);

        //Then
        assertEquals(LISTNAME, readTasks.get(0).getListName());

        int id = readTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}
