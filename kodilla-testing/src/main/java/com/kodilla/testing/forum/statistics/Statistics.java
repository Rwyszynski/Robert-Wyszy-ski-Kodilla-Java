package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

import java.util.List;

public interface Statistics {

    List<String> usersNames(); // list of users names
    int postsCount(ForumUser user);          // total quantity of forum posts
    int commentsCount(ForumUser user);       // total quantity of forum comments
}