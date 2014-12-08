package com.one.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class Main extends Activity {
	
	int counter;
	Button add, sub;
	TextView display;
	TextView test, test2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		counter = 0;
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		display = (TextView) findViewById(R.id.tvDisplay);
		Log.i("out", "onCreate called");
		
	}
	
	public void addOne(View v)
	{
		counter++;
		display.setText("Your total is " +counter);
	}
	
	public void subOne(View v)
	{
		counter--;
		display.setText("Your total is " +counter);
	}

	public void radioClicked(View v)
	{
		RadioButton rButton = (RadioButton) findViewById
				(R.id.radio);
		if(rButton.isChecked())
			rButton.setChecked(false);
		else rButton.setChecked(true);
	}
	
	
	public void onDestroy()
	{
		super.onDestroy();
		Log.i("out", "onDestroy called");
	}
}

/*
 * add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});*/
