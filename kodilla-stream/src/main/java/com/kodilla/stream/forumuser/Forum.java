package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    public static List<ForumUser> getUserList() {
        final List<ForumUser> userList = new ArrayList<ForumUser>();

        userList.add(new ForumUser(123, "Robert", 'M', LocalDate.of(2000,7,3), 30));
        userList.add(new ForumUser(124, "Łukasz", 'M', LocalDate.of(1991,7,3), 0));
        userList.add(new ForumUser(125, "Piotr", 'M', LocalDate.of(1989,7,3), 10));
        userList.add(new ForumUser(126, "Marta", 'K', LocalDate.of(2010,7,3), 80));
        userList.add(new ForumUser(127, "Łucja", 'K', LocalDate.of(2005,7,3), 38));
        userList.add(new ForumUser(128, "Grażyna", 'K', LocalDate.of(1988,7,3), 37));
        userList.add(new ForumUser(129, "Gracjan", 'M', LocalDate.of(1999,7,3), 44));

        return userList;

    }
}
