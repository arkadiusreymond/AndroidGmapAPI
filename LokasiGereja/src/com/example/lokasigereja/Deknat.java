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

public final class Deknat extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
Button deknatjt;
Button deknatjb;
Button deknatju;
Button deknatjs;
Button deknatjp;
Button deknatbekasi;
Button deknattanggerang;


	
	public static final int Dialog_Exit_ID = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.deknat);
	   findViewById(R.id.btn_deknatjaktim).setOnClickListener(this);
	   findViewById(R.id.btn_deknatjakpus).setOnClickListener(this);
	   findViewById(R.id.btn_deknatjakbar).setOnClickListener(this);
	   findViewById(R.id.btn_deknatjaksel).setOnClickListener(this);
	   findViewById(R.id.btn_deknatjakut).setOnClickListener(this);
	   findViewById(R.id.btn_deknatbekasi).setOnClickListener(this);
	   findViewById(R.id.btn_deknattanggerang).setOnClickListener(this);
	   Typeface font = Typeface.createFromAsset(getAssets(), "CorleoneDue.TTF"); 
		 deknatjt = (Button)findViewById(R.id.btn_deknatjaktim);
		 deknatjt.setTypeface(font);
		deknatjb = (Button)findViewById(R.id.btn_deknatjakbar);
		 deknatjb.setTypeface(font);
		 deknatju = (Button)findViewById(R.id.btn_deknatjakut);
		 deknatju.setTypeface(font);
		
		 deknatjs = (Button)findViewById(R.id.btn_deknatjaksel);
		 deknatjs.setTypeface(font);
		 deknatjp = (Button)findViewById(R.id.btn_deknatjakpus);
		 deknatjp.setTypeface(font);
		 deknatbekasi = (Button)findViewById(R.id.btn_deknatbekasi);
		 deknatbekasi.setTypeface(font);
		 deknattanggerang = (Button)findViewById(R.id.btn_deknattanggerang);
		 deknattanggerang.setTypeface(font);
	 
	   
		
		
    }
   
	   
    
    
    public void onClick(View v){
    	switch(v.getId()) {
    	case R.id.btn_deknatjaktim:
    		Intent i = new Intent(this, ListDeknatJT.class);
    		startActivity(i);
    		break;
    	case R.id.btn_deknatjakpus:
    		Intent a = new Intent(this, ListDeknatJP.class);
    		startActivity(a);
    		break;
    	case R.id.btn_deknatjakbar:
    		Intent s = new Intent(this, ListDeknatJB.class);
    		startActivity(s);
    		break;
    	case R.id.btn_deknatjaksel:
    		Intent d = new Intent(this, ListDeknatJS.class);
    		startActivity(d);
    		break;
    	case R.id.btn_deknatjakut:
    		Intent z = new Intent(this, ListDeknatJU.class);
    		startActivity(z);
    		break;
    	case R.id.btn_deknatbekasi:
    		Intent e = new Intent(this, ListDeknatBekasi.class);
    		startActivity(e);
    		break;
    	case R.id.btn_deknattanggerang:
    		Intent io = new Intent(this, ListDeknatTanggerang.class);
    		startActivity(io);
    		break;
    	
    		
    	
    	
    }
 

}}