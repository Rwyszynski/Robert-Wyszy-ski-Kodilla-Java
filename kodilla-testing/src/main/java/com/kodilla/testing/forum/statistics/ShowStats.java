package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.*;


public class ShowStats {

    Statistics statistics;

    public ShowStats(Statistics statistics) {
        this.statistics = statistics;
    }


    public List<String> usersNames() {

        return statistics.usersNames();
    }

    public int postsCount(ForumUser user) {

        return statistics.postsCount(user);
    }

    public int commentsCount(ForumUser user) {

        return statistics.postsCount(user);
    }


    public void calculateAdvStatistics(Statistics statistics) {
        List<String> listOfUsers = statistics.usersNames();
        System.out.println("Liczba użytkowników " + listOfUsers.size());

        int postsCount = 0;
        List<String> listUsers = statistics.usersNames();
        for (int i = 0; i < listOfUsers.size(); i++) {
            String name = listOfUsers.get(i);
            /*
            name.getPostsQuantity();
            */
        }
    }



/*
    public showStatistics(){

    }

 */


}