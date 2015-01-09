package com.wglxy.example.dash1;

import android.os.Bundle;
/**
 * 
 * @author MAC
 *
 */
public class SearchActivity extends DashboardActivity {

	/**
	 * onCreate
	 *
	 * Called when the activity is first created. This is where you should do
	 * all of your normal static set up: create views, bind data to lists, etc.
	 * This method also provides you with a Bundle containing the activity's
	 * previously frozen state, if there was one.
	 * 
	 * Always followed by onStart().
	 *
	 * @param savedInstanceState
	 *            Bundle
	 */

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		setTitleFromActivityLabel(R.id.title_text);
	}

} // end class
