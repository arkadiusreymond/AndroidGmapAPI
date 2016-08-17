package com.example.lokasimesjid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		Thread timer = new Thread() {
			public void run() {
				try {
					// berapalama splashscreen akan ditampilkan dalam milisecond
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					// activity yang akan dijalankan setelah splashscreen
					// selesai
					Intent i = new Intent(Splash.this, MainActivity.class);
					startActivity(i);
					Splash.this.finish();
				}
			}
		};
		timer.start();
	}

}