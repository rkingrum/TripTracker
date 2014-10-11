package com.example.TripSit;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by robert on 10/11/2014.
 */
public class TripLogger extends Activity {

	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.trip_logger);
	}


}