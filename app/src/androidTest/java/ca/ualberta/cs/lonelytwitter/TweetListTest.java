package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by jangani on 2/16/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        
        try{
            tweets.addTweet(tweet);
            fail();
        }
        catch (IllegalArgumentException I){}
        
        NormalTweet tweet2 = new NormalTweet("some tweet");
        try {
            tweets.addTweet(tweet2);
        } 
        catch (IllegalArgumentException I) {
            fail();
        }
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
        NormalTweet tweet2 = new NormalTweet("other tweet");
        assertFalse(tweets.hasTweet(tweet3));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(),tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testgetCount(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertEquals(tweets.getCount(), 0);
        tweets.addTweet(tweet);
        assertEquals(tweets.getCount(), 1);
    }
    
    public void testGetTweets() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("2");
        tweets.addTweet(tweet);
        NormalTweet tweet2 = new NormalTweet("3");
        tweets.addTweet(tweet2);
        NormalTweet tweet3 = new NormalTweet("1");
        tweets.addTweet(tweet3);
        
        ArrayList<NormalTweet> tweetsTest = tweets.getTweets();
        assert(tweetsTest.get(0).equals(tweet3));
        assert(tweetsTest.get(1).equals(tweet));
        assert(tweetsTest.get(2).equals(tweet2));
    }
}

