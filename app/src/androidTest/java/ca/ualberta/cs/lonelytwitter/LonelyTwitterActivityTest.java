package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2 {
    
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }
    
    public void setUp() throws Exeption{
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }
    
    public void testTweet(){
        solo.assertCurrentActivity("wrong Activity", LonelyTwitterActivity.class);
        
        solo.ClickOnButton("Clear");
        solo.enterText(EditText) solo.getView(R.id.body), "Test Tweet");
        
        solo.ClickOnButton("Save");
        
        solo.ClearEditText(EditText) solo.getView(R.id.body));
        
        assertTrue(solo.waitForText("Test Tweet"));
        
        solo.ClickOnButton("Clear");
        assertFalse(solo.searchText("Test Tweet"));
    }
    
    @Override
    public void tearDown() throws Exception{
        
    }
}
