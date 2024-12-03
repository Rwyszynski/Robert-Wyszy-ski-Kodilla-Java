package com.kodilla.patterns.strategy.social;

public sealed class User
permits Millenials, YGeneration, ZGeneration {

    private String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setDifferentPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
