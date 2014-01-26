package com.example.myfirstapp2;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.content.Intent;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

	    // Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setText(message);

	    // Set the text view as the activity layout
	    setContentView(textView);
	    
	    //enable left arrow to home icon
	    getActionBar().setDisplayHomeAsUpEnabled(true);
	}



	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			//navigate back home
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
