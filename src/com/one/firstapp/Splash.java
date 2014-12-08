package com.one.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i("out", "Splash created");
		setContentView(R.layout.splash);
		Thread timer = new Thread()
		{
			public void run()
			{
				try
				{
					Log.i("out", "Splash image start");
					sleep(2000);
				} 
				catch(InterruptedException e)
				{
					e.printStackTrace();
					Log.i("out", "Thread interrupted");
				}
				finally
				{
					Intent openMain = new Intent(Splash.this, Menu.class);
					startActivity(openMain);
					finish();
				}	
			}
			
		};
		timer.start();
	
	}
	/*@Override
	protected void onPause(){
		super.onPause();
		finish();
	}*/

}
