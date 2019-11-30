package com.hexamind.datera;

import java.sql.Date;

public class MatchDating {
    private int userId;
    private int matchedWithId;
    private Date match_date;

    public MatchDating(int userId, int matchedWithId, Date match_date) {
        this.userId = userId;
        this.matchedWithId = matchedWithId;
        this.match_date = match_date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMatchedWithId() {
        return matchedWithId;
    }

    public void setMatchedWithId(int matchedWithId) {
        this.matchedWithId = matchedWithId;
    }

    public Date getMatch_date() {
        return match_date;
    }

    public void setMatch_date(Date match_date) {
        this.match_date = match_date;
    }
}
