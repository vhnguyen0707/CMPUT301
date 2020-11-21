package com.example.lonelytwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tweet tweet = new ImportantTweet("I am an important tweet! Not normal like last time!");
        Tweet tweet1 = new NormalTweet("I am a normal tweet!");
        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();

        tweetList.add(tweet);
        tweetList.add(tweet1);
        //tweet.setMessage("Our fist online 301 lab!");
        //tweet.setDate(new Date());

    }
}