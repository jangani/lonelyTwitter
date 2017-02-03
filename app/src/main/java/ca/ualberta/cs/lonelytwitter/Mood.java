/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Main class of Mood which sets the default mood as well returns the date
 */
public  abstract class Mood {

    private Date when;

    /**
     * Returns default mood
     * @return
     */
    String feels() {
        return "no feels";

    }

    /**
     * Returns default date
     * @return
     */

    Date getDate(){
        return this.when;

    }

    public String getFeels() {
        return "no feels ";
    }


    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }


    /**
     * Returns the date for the Mood
     */
    public Mood(){

        this.when = new Date();
    }

    public Mood(Date date){

        this.when = date;
    }

}
