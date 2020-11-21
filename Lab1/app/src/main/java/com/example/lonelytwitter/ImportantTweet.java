package com.example.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    public ImportantTweet(String message){
        super(message);
    }
}
