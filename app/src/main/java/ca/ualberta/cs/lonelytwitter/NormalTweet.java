/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class which returns a normal tweet along with the associated date
 */
public class NormalTweet extends Tweet{
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * If we attempt to treat this type of tweet as Important this will override it
     * and return false.
     * @return
     */
    @Override
    public Boolean isImportant(){
        return false;
    }
}
