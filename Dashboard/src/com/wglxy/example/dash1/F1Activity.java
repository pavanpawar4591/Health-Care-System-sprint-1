package com.wglxy.example.dash1;

import android.os.Bundle;
import android.widget.Toast;
/**
 * 
 * @author MAC
 * model Ambulance
 *
 */
public class F1Activity extends DashboardActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Toast.makeText(getBaseContext(), "Sending SMS", Toast.LENGTH_LONG)
				.show();

	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onDestroy() {

		super.onPause();
	}

} // end class
