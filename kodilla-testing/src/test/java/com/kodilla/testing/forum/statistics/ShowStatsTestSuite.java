package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.kodilla.testing.forum.*;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class ShowStatsTestSuite {

    @Mock
    private Statistics statistics;

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("Preparing to execute test");
    }

    @Test
    void testForumPostWithNoPosts() {
        //Given
        ShowStats showStats = new ShowStats();
        when(statistics.postsCount()).thenReturn(0);

        //When
        showStats.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, showStats.getNumberOfUsers());
        assertEquals(0, showStats.getNumberOfPosts());
        assertEquals(0, showStats.getNumberOfComments());
        assertEquals(0, showStats.getAvaragePostsForUser());
        assertEquals(0, showStats.getAvarageCommentsForUser());
        assertEquals(0, showStats.getAvarageCommentsForPost());
    }

    @Test
    void testForumPostWith1000Posts() {
        //Given
        ShowStats showStats = new ShowStats();
        when(statistics.postsCount()).thenReturn(1000);

        //When
        showStats.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, showStats.getNumberOfUsers());
        assertEquals(1000, showStats.getNumberOfPosts());
        assertEquals(0, showStats.getNumberOfComments());
        assertEquals(0, showStats.getAvaragePostsForUser());
        assertEquals(0, showStats.getAvarageCommentsForUser());
        assertEquals(0, showStats.getAvarageCommentsForPost());
    }

    @Test
    void testForumCommentWith0Comments() {
        //Given
        ShowStats showStats = new ShowStats();
        when(statistics.commentsCount()).thenReturn(0);

        //When
        showStats.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, showStats.getNumberOfUsers());
        assertEquals(0, showStats.getNumberOfPosts());
        assertEquals(0, showStats.getNumberOfComments());
        assertEquals(0, showStats.getAvaragePostsForUser());
        assertEquals(0, showStats.getAvarageCommentsForUser());
        assertEquals(0, showStats.getAvarageCommentsForPost());
    }


    @Test
    void testForumUserWith0User() {
        //Given
        ShowStats showStats = new ShowStats();
        List<String> users = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(users);

        //When
        showStats.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, showStats.getNumberOfUsers());
        assertEquals(0, showStats.getNumberOfPosts());
        assertEquals(0, showStats.getNumberOfComments());
        assertEquals(0, showStats.getAvaragePostsForUser());
        assertEquals(0, showStats.getAvarageCommentsForUser());
        assertEquals(0, showStats.getAvarageCommentsForPost());
    }


    @Test
    void testForumUserWith100User() {
        //Given
        ShowStats showStats = new ShowStats();
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("user" + i);
        }
        when(statistics.usersNames()).thenReturn(users);

        //When
        showStats.calculateAdvStatistics(statistics);

        //Then
        assertEquals(100, showStats.getNumberOfUsers());
        assertEquals(0, showStats.getNumberOfPosts());
        assertEquals(0, showStats.getNumberOfComments());
        assertEquals(0, showStats.getAvaragePostsForUser());
        assertEquals(0, showStats.getAvarageCommentsForUser());
        assertEquals(0.0, showStats.getAvarageCommentsForPost());

    }

    @Test
    void testForumPostsGratherThanComments() {
        //Given
        ShowStats showStats = new ShowStats();
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(50);

        //When
        showStats.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, showStats.getNumberOfUsers());
        assertEquals(100, showStats.getNumberOfPosts());
        assertEquals(50, showStats.getNumberOfComments());
        assertEquals(0, showStats.getAvaragePostsForUser());
        assertEquals(0, showStats.getAvarageCommentsForUser());
        assertEquals(0.5, showStats.getAvarageCommentsForPost());
    }

    @Test
    void testForumCommentsGratherThanPosts() {
        //Given
        ShowStats showStats = new ShowStats();
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(100);

        //When
        showStats.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0, showStats.getNumberOfUsers());
        assertEquals(50, showStats.getNumberOfPosts());
        assertEquals(100, showStats.getNumberOfComments());
        assertEquals(0, showStats.getAvaragePostsForUser());
        assertEquals(0, showStats.getAvarageCommentsForUser());
        assertEquals(2, showStats.getAvarageCommentsForPost());
    }
}

