package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.*;


public class ShowStats {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avaragePostsForUser;
    private double avarageCommentsForUser;
    private double avarageCommentsForPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvaragePostsForUser() {
        return avaragePostsForUser;
    }

    public double getAvarageCommentsForUser() {
        return avarageCommentsForUser;
    }

    public double getAvarageCommentsForPost() {
        return avarageCommentsForPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers != 0){
            avaragePostsForUser = (double) numberOfPosts / (double) numberOfUsers;
            avarageCommentsForUser = (double) numberOfComments / (double) numberOfUsers;
        }

        if (numberOfPosts != 0){
            avarageCommentsForPost = (double) numberOfComments / (double) numberOfPosts;
        }


    }



/*
    public showStatistics(){

    }

 */


}