package ca.ualberta.cs.lonelytwitter;
//made by jangani 
import java.util.Date;

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
