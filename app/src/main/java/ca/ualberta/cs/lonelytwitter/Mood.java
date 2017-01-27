package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

//Created by jangani
public  abstract class Mood {

    private Date when;

    String feels() {
        return "no feels";
    }

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

    public Mood(){

        this.when = new Date();
    }

    public Mood(Date date){

        this.when = date;
    }

}
