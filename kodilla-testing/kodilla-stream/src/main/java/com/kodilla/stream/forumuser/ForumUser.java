package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;

public final class ForumUser {

    private final Integer id;
    private final String userName;
    private final char sex;
    private final LocalDate birthday;
    private final int postQuantity;

    public ForumUser(Integer id, String userName, char sex, LocalDate birthday, int postQuantity) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.postQuantity = postQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postQuantity=" + postQuantity +
                '}';
    }

}
