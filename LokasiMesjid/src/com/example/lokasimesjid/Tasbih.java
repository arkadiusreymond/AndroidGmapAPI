package com.example.lokasimesjid;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Tasbih extends Activity implements OnClickListener {
    int b;
    ImageButton soni;
    TextView agi;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasbih);
        soni=(ImageButton)findViewById(R.id.button1);
        agi=(TextView)findViewById(R.id.area);
        soni.setOnClickListener(this);
        
    }
    

int a=0;
	public void onClick(View v) {
		// TODO Auto-generated method stub
	switch (v.getId()){	
	case R.id.button1:
		
		
		 setTasbih();
		}
	}

	private void setTasbih() {
		// TODO Auto-generated method stub
	
		if(a<=32){
adapter();			
		
		}
		else if(a>=33){
			try {
				android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(this);
				alert.setTitle("Notifikasi");
				alert.setMessage("silakan mereset ulang");
				alert.setPositiveButton("Keluar",
						new android.content.DialogInterface.OnClickListener() {
							public void onClick(android.content.DialogInterface dialog,
									int which) {
								finish();
								
							}

				});
				
				alert.setNegativeButton("ulangi tasbih",
						new android.content.DialogInterface.OnClickListener() {
							@Override
							public void onClick(android.content.DialogInterface dialog,
									int which) {
								a=0;
								agi.setText(Integer.toString(a));
									}
						});
				alert.show();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}		else{
			String bacaan="gagal semua";
		agi.setText(bacaan);	
		}
	}
	
	private void adapter(){
	a++;
	agi.setText(Integer.toString(a));

	
	
}
	}