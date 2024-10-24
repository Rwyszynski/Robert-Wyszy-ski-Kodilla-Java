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

    @BeforeEach
    public void beforeEveryTest() {

        System.out.println("Preparing to execute test");
    }

    @Mock
    private Statistics StatisticsMock;


    private List<ForumPost> generateListOfNForumPosts(int postsQuantity) {
        List<ForumPost> resultList = new ArrayList<>();
        for (int n = 1; n <= postsQuantity; n++) {
            ForumPost forumPost = new ForumPost("Title " + n, "Author " + n);
            resultList.add(forumPost);
        }
        return resultList;
    }

    private List<ForumUser> generateListOfNForumUser(int userQuantity) {
        List<ForumUser> resultList = new ArrayList<>();
        for (int n = 1; n <= userQuantity; n++) {
            ForumUser forumUser = new ForumUser("Name" + n, "realName " + n);
            resultList.add(forumUser);
        }
        return resultList;
    }

    private List<ForumComment> generateListOfNForumComment(int commentQuantity) {
        List<ForumComment> resultList = new ArrayList<>();
        for (int n = 1; n <= commentQuantity; n++) {
            ForumComment forumComment = new ForumComment(new ForumPost("Title " +n, "Author" + n), "commentBody " + n, "author " + n);
            resultList.add(forumComment);
        }
        return resultList;
    }

    @Test
    void testForumPostWithNoPosts() {
        //Given
        ShowStats showStats = new ShowStats(StatisticsMock);
        List<ForumPost> resultForum0Posts = generateListOfNForumPosts(0);
        ForumUser forumUser = new ForumUser("Name", "realName");
        when(StatisticsMock.postsCount(forumUser)).thenReturn(resultForum0Posts.size());

        //When
        int forum0Posts = showStats.postsCount(forumUser);

        //Then
        assertEquals(0, forum0Posts);
    }

    @Test
    void testForumPostWith1000Posts() {
        //Given
        ShowStats showStats = new ShowStats(StatisticsMock);
        List<ForumUser> resultForum1000Posts = generateListOfNForumUser(1000);
        ForumUser forumUser = new ForumUser("Name", "realName");
        when(StatisticsMock.postsCount(forumUser)).thenReturn(resultForum1000Posts.size());

        //When
        int forum0Posts = showStats.postsCount(forumUser);

        //Then
        assertEquals(1000, forum0Posts);
    }

    @Test
    void testForumCommentWith0Comments() {
        //Given
        ShowStats showStats = new ShowStats(StatisticsMock);
        List<ForumComment> resultForum0Comments = generateListOfNForumComment(0);
        ForumUser forumUser = new ForumUser("Name", "realName");
        when(showStats.commentsCount(forumUser)).thenReturn(resultForum0Comments.size());

        //When
        int forum0Comments = showStats.commentsCount(forumUser);

        //Then
        assertEquals(0, forum0Comments);
    }

    @Test
    void testForumUserWith0User() {
        //Given
        ShowStats showStats = new ShowStats(StatisticsMock);
        List<ForumUser> resultForum0Users = generateListOfNForumUser(0);
        ForumUser forumUser = new ForumUser("Name", "realName");
        when(showStats.commentsCount(forumUser)).thenReturn(resultForum0Users.size());

        //When
        int forum0Users = showStats.commentsCount(forumUser);

        //Then
        assertEquals(0, forum0Users);
    }

    @Test
    void testForumUserWith100User() {
        //Given
        ShowStats showStats = new ShowStats(StatisticsMock);
        List<ForumUser> resultForum100Users = generateListOfNForumUser(100);
        ForumUser forumUser = new ForumUser("Name", "realName");
        when(showStats.commentsCount(forumUser)).thenReturn(resultForum100Users.size());

        //When
        int forum100Users = showStats.commentsCount(forumUser);

        //Then
        assertEquals(100, forum100Users);
    }



}

