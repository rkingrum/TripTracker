package com.example.TripSit;

import android.content.Intent;
import android.os.Handler;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by robert on 10/11/2014.
 */
public class SplashScreen extends Activity {

	//Splash screen timer
	private static int SPLASH_TIME_OUT = 3000;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent i = new Intent(SplashScreen.this, Main.class);
				startActivity(i);

				finish();
			}
		}, SPLASH_TIME_OUT);
	}
}