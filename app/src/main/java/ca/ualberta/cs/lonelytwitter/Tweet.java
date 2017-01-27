package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jangani on 1/20/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;

    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public void setMessage(String text) throws TweetTooLongException{
        if (text.length() > 144){
            //We dont want string longer than 144
            throw new TweetTooLongException();
        }
        this.message = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }


    public abstract Boolean isImportant();
    @Override
    public String toString(){
        return date.toString() + " | " + message;
     }
 }
