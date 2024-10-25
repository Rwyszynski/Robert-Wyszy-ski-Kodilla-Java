package com.kodilla.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;


import com.kodilla.stream.forumuser.*;


public class TestingMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthday(), LocalDate.now()).getYears()>20)
                .filter(forumUser -> forumUser.getPostQuantity() > 0)
                //.map(ForumUser::toString)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println(resultOfForumUser);
        }
    }
