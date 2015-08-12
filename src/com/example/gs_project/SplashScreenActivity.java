package com.example.gs_project;

import java.net.URL;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

public class SplashScreenActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen_layout);

	}
	
	@Override
	protected void onDestroy() {

		super.onDestroy();

	}
	@Override
	protected void onResume() {
		super.onResume();
		SplashScreenTask task = new SplashScreenTask();
		task.execute((URL[])null);
	}
	
private class SplashScreenTask extends AsyncTask<URL, Integer, Integer> {
    protected Integer doInBackground(URL... urls) {
   	 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return 0;
    }


    protected void onPostExecute(Integer result) {
        showMain();
    }
}


private void showMain(){
	Intent i = new Intent(getBaseContext(), MainActivity.class);
	startActivity(i);

	finish();
}
}
