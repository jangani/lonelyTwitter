package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
// Created by jangani

public class Sad extends Mood {

    public Sad() {
        super();
    }
    public Sad(Date when){
        super(when);
    }
    
    @Override
    public String getFeels(){
        return "sad";
    }
 }
