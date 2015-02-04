package com.example.apptest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button button1 ;
	TextView tv;
	Context context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this.getApplicationContext();
		button1 = (Button) this.findViewById(R.id.button1);
		tv = (TextView) this.findViewById(R.id.textView1);
		button1.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				tv.setText("After Clicked");
				Toast.makeText(context ,"onclick", Toast.LENGTH_LONG).show();;
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
