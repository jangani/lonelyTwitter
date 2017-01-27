package ca.ualberta.cs.lonelytwitter;
//made by jangani

import java.util.Date;
public class Happy extends Mood {
    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

   @Override
    public  String getFeels(){
       return "happy";
   }
 }
