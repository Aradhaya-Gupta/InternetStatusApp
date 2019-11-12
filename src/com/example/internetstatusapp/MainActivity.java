package com.example.internetstatusapp;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button)findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ConnectivityManager cm=(ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
				NetworkInfo ni=cm.getActiveNetworkInfo();
				if(ni!=null&&ni.isConnectedOrConnecting())
				{
					Toast.makeText(MainActivity.this,"Connected or connecting", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "not connected", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
