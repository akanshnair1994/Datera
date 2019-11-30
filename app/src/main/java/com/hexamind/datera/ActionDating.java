package com.hexamind.datera;

public class ActionDating {
    private int userId;
    private int actionWithId;
    private String likeDislike;

    public ActionDating(int userId, int actionWithId, String likeDislike) {
        this.userId = userId;
        this.actionWithId = actionWithId;
        this.likeDislike = likeDislike;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getActionWithId() {
        return actionWithId;
    }

    public void setActionWithId(int actionWithId) {
        this.actionWithId = actionWithId;
    }

    public String getLikeDislike() {
        return likeDislike;
    }

    public void setLikeDislike(String likeDislike) {
        this.likeDislike = likeDislike;
    }
}
