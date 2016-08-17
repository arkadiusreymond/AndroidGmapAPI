package com.example.lokasimesjid;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;




import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.*;

public final class MainActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Button tentang;
	Button kompas;
	Button rukun;
	Button bacaan;
	Button lokasimesjid;
	Button keluar;
	
	public static final int Dialog_Exit_ID = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.utama);
	   findViewById(R.id.button1).setOnClickListener(this);
	   findViewById(R.id.button6).setOnClickListener(this);
	   findViewById(R.id.button5).setOnClickListener(this);
	   findViewById(R.id.button4).setOnClickListener(this);
	  
	   findViewById(R.id.button2).setOnClickListener(this);
	   Typeface font = Typeface.createFromAsset(getAssets(), "Ceria Lebaran.otf"); 
		 tentang = (Button)findViewById(R.id.button4);
		 tentang.setTypeface(font);
		kompas = (Button)findViewById(R.id.button2);
		 kompas.setTypeface(font);
		 keluar = (Button)findViewById(R.id.button6);
		 keluar.setTypeface(font);
		
		 rukun = (Button)findViewById(R.id.button5);
		 rukun.setTypeface(font);
		 lokasimesjid = (Button)findViewById(R.id.button1);
		 lokasimesjid.setTypeface(font);
		
    }
   
	   
    
    
    public void onClick(View v){
    	switch(v.getId()) {
    	case R.id.button1:
    		Intent i = new Intent(this, ListMasjid.class);
    		startActivity(i);
    		break;
    	case R.id.button4:
    		Intent e = new Intent(this, Tentang.class);
    		startActivity(e);
    		break;
    	case R.id.button5:
    		Intent w = new Intent(this, ListRukun.class);
    		startActivity(w);
    		break;
    	case R.id.button2:
    		Intent d = new Intent(this, SensorToCompass.class);
    		startActivity(d);
    		break;
    		
    	case R.id.button6 :
    		showDialog(Dialog_Exit_ID);
    		break;	
    	}
    	
    }
 
	protected Dialog onCreateDialog(int id) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		switch (id) {
		case Dialog_Exit_ID:
		}
		return builder.setMessage("Anda Yakin Ingin Keluar?")
				.setCancelable(false).setPositiveButton("Ya",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								MainActivity.this.finish();
							}
						}).setNegativeButton("Tidak",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						}).show();
	}
}