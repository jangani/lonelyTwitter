/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
/**
 * Implements the Tweet by checking if its 140 characters, returning the string Tweet,
 * returning the date and an array of Moods
 *
 */
public abstract class Tweet implements Tweetable  {
    private Date date;
    private String message;
    private ArrayList<Mood> FeelsList;

    public String getMessage() {
        return message;
    }

    /**
     * Checks if the tweet is no more than 140 characters and if so
     * it will throw and exception
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Returns a date along with the associated Tweet
     * @param message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    public Tweet(){
        super ();
        this.date = new Date();
    }

    public abstract Boolean isImportant();

    /**
     * Will print the date along with the saved tweet from the User input
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
