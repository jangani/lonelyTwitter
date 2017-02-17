package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by jangani on 2/16/17.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet){
        tweets.add(tweet);
    }
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public NormalTweet getTweet(int index){
        return tweets.get(index);
    }

}
