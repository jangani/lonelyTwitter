/*
 * Copyright (c) 2017. TEAM A, CMPUT 301 University of Alberta - All Rights Reserved. You may use, distribute or modify the code under the terms and conditions of Code of Student behavior at University of Alberta
 * You can find a copy of the license in this project. Otherwise please contact at jangani@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * The type Lonely twitter activity.
 * This class is the main view class of the project.  <br> In this class,
 * user interaction and file  manipulation is performed.
 * All files are in the form of "json" files that are stored in the Emulator's accessible from
 * Android Device  Monitor:
 * <pre>
 *     pre-formatted text: <br>
 *         File Explorer -> data -> data -> ca.ualberta.cs.lonelytwitter -> files
 * </pre>
 * <code> begin <br>
 *     some pseudocode  here
 *     end. </code>
 *     The file name is indiciated in the $nbsp &nbsp FILENAME constant.
 *
 *<ul>
 *     <li> item 1
 *     <li>
 *         item 2
 *         item3
 *     </li></li>
 *</ul>
 * <ol>
 *     <li>
 *         item1
 *         item2
 *         item3
 *     </li>
 * </ol>
 * @author jangani
 * @version 1.4.2
 * @since 1.0
 */
public class LonelyTwitterActivity extends Activity {
	/**
	 * The file that all the tweets are saved here
	 * The format of the file is JSON.
	 * @see #loadFromFile()
	 * @see #saveInFile()
	 */

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweetList;
	private ArrayAdapter<Tweet> adapter;

	/**
	 * Called when the activity is first created
	 * @param savedInstanceState
     */

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		Button clearButton = (Button) findViewById(R.id.clear);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
					setResult(RESULT_OK);
					String text = bodyText.getText().toString();

					Tweet tweet = new NormalTweet(text);
					tweetList.add(tweet);



					adapter.notifyDataSetChanged();

					saveInFile();
			}



				//saveInFile(text, new Date(System.currentTimeMillis()));
				//finish();


		});

		clearButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				tweetList.clear();
				adapter.notifyDataSetChanged();
				saveInFile();

			}
		});



	}

	/**
	 * Is invoked when the activity starts
	 */

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		//String[] tweets = loadFromFile();
		tweetList = new ArrayList<Tweet>();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

	/**
	 * Trims extra spces from the Input
	 * @param inputString
	 * @return
     */
	private String trimExtraSpaces( String inputString){inputString= inputString.replaceAll("\\s+", ""); return inputString;}

	/**
	 * Sorts The Tweet List Items
	 */
	private void SortTweetListItems(){}
	/**
	 * Loads tweets from file.
	 * @throws TweetTooLongException is the tweet is too long
	 * @exception FileNotFoundException if the file is not created
	 */

	private void loadFromFile() {

		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson();

			tweetList = gson.fromJson(in, new TypeToken<ArrayList<NormalTweet>>(){}.getType());

			fis.close(); //not necessary


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			tweetList = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException();
		}

	}

	/**
	 * Saves tweets in file in JSON format.
	 * @throws FileNotFoundException if folder not exists
	 */
	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();

			gson.toJson(tweetList, out);

			out.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
			//e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
			//e.printStackTrace();
		}
	}
}
