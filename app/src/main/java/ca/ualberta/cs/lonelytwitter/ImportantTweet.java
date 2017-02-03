/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Class which returns the important tweets and makes
 * the getters and setters for it.
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * Returns a Boolean which overrides the tweet importance of whatever it was
     * before and sets it to true
     * @return
     */
    @Override
    public Boolean isImportant(){
        return true;
    }

}
