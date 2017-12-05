package com.bignerdranch.android.firstsqlite;

/**
 * Created by hauhan on 29/11/2017.
 */

public class Comment {

    private long id;
    private String comment;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public String getComment() {
        return comment;
    }

    public String toString()
    {
        return comment;
    }


}
