package com.kodilla.stream.immutable;

public final class ForumUser {
    private String username;  // czy final
    private String realName;  // czy final

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
