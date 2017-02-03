/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class which makes the getters and setters for the Happy Mood
 * personality
 */
public class Happy extends Mood {
    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

    /**
     * Returns the happy mood and oveerides whatever previous mood
     * was there.
     * @return
     */
   @Override
    public  String getFeels(){
       return "happy";
   }
}
