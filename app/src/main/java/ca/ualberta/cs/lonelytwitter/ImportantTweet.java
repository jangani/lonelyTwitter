package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jangani on 1/20/17.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message, Date date){
        super(message, date);
    }



    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
