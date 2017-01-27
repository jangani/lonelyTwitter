package ca.ualberta.cs.lonelytwitter;

//Created by Ghazal Jangani
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
