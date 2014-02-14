package com.prince.cellulrnetworkinfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		TextView tvNetworkInfo = (TextView) findViewById(R.id.tvNetworkInfo);

		String type = Connectivity.isConnectedFast(MainActivity.this);
		
		System.out.println("Network :: " + type);
		
		tvNetworkInfo.setText(type);
		
	}
}
