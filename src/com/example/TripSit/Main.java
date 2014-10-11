package com.example.TripSit;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void logTrip(View view) {
		Intent i = new Intent(Main.this, TripLogger.class);
		startActivity(i);
	}
}
