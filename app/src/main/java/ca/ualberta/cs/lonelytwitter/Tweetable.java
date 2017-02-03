/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;
/**
 * Checks if the actual tweet is a tweet and if not throws an exception for being too long
 */
public interface Tweetable {
    String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
