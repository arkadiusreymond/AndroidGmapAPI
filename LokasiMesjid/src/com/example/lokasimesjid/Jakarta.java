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

public final class Jakarta extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Button jt;
	Button ju;
	Button jb;
	Button js;
	Button jp;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.jakarta);
	   findViewById(R.id.ju).setOnClickListener(this);
	   findViewById(R.id.jp).setOnClickListener(this);
	   findViewById(R.id.js).setOnClickListener(this);
	   findViewById(R.id.jt).setOnClickListener(this);
	   findViewById(R.id.jt).setOnClickListener(this);
	   findViewById(R.id.jb).setOnClickListener(this);
	   Typeface font = Typeface.createFromAsset(getAssets(), "Ceria Lebaran.otf"); 
		 jt = (Button)findViewById(R.id.jt);
		 jt.setTypeface(font);
		jb = (Button)findViewById(R.id.jb);
		 jb.setTypeface(font);
		 ju = (Button)findViewById(R.id.ju);
		 ju.setTypeface(font);
		
		 js = (Button)findViewById(R.id.js);
		 js.setTypeface(font);
		 jp = (Button)findViewById(R.id.jp);
		 jp.setTypeface(font);
		
    }
   
	   
    
    
    public void onClick(View v){
    	switch(v.getId()) {
    	case R.id.jt:
    		Intent i = new Intent(this, Listjt.class);
    		startActivity(i);
    		break;
    	case R.id.ju:
    		Intent e = new Intent(this, Listju.class);
    		startActivity(e);
    		break;
    	case R.id.jp:
    		Intent w = new Intent(this, Listjp.class);
    		startActivity(w);
    		break;
    	case R.id.js:
    		Intent d = new Intent(this, Listjs.class);
    		startActivity(d);
    		break;
    		
    	case R.id.jb:
    		Intent qq = new Intent(this, Listjb.class);
    		startActivity(qq);
    		break;
    	}
    	
    }
 
}