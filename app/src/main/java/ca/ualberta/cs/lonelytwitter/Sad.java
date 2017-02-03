/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Class which makes the Sad mood and returns
 * the date along with it
 */
public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date when){
        super(when);

    }

    /**
     * Returns the mood sad and overrides whatver mood was there before.
     * @return
     */
    @Override
    public String getFeels(){
        return "sad";

    }
}
