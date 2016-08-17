package com.example.lokasigereja;





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
	Button lokasigereja;
	Button tentang;
	Button keluar;
	Button bantuan;
	
	
	public static final int Dialog_Exit_ID = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);
	   findViewById(R.id.btn_lokasigereja).setOnClickListener(this);
	   findViewById(R.id.btn_keluar).setOnClickListener(this);
	   findViewById(R.id.btn_tentang).setOnClickListener(this);
	 
	   Typeface font = Typeface.createFromAsset(getAssets(), "CorleoneDue.TTF"); 
		 tentang = (Button)findViewById(R.id.btn_tentang);
		 tentang.setTypeface(font);
		lokasigereja = (Button)findViewById(R.id.btn_lokasigereja);
		 lokasigereja.setTypeface(font);
		 keluar = (Button)findViewById(R.id.btn_keluar);
		 keluar.setTypeface(font);
		
		 
		
    }
   
	   
    
    
    public void onClick(View v){
    	switch(v.getId()) {
    	case R.id.btn_lokasigereja:
    		Intent i = new Intent(this, Deknat.class);
    		startActivity(i);
    		break;
    		
    	case R.id.btn_tentang:
    		Intent a = new Intent(this, Tentang.class);
    		startActivity(a);
    		break;
    	
    		
    	case R.id.btn_keluar :
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