package com.example.lokasimesjid;




import android.app.AlertDialog;
import android.app.Fragment.SavedState;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;





 
public class ListRukun extends ListActivity  {
	 

    private ListView list;
    ArrayAdapter adapter;
    EditText rukunapa;
     
 
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
       
        
      String NamaMesjid[] = {"Niat","Berdiri jika mampu","Takbiratul Irham","Membaca Al-Fatinah","Ruku’"
    		  ,"I’Tidal","Sujud dua kali","Duduk antara dua sujud","Duduk yang terakhir",
    		  "Tasyahud","Shalawat Atas Nabi SAW","Salam yang pertama","Menertibkan rukun-rukun"};
      setContentView(R.layout.listrukun);
      rukunapa = (EditText) findViewById(R.id.rukunapa);;
     
		this.setListAdapter(adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, NamaMesjid));
		rukunapa.addTextChangedListener(new TextWatcher() {
            
            public void onTextChanged(CharSequence s, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            
            }
             
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                    int arg3) {
                // TODO Auto-generated method stub
                 
            }
             
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                 
            }
        });
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		// Menangkap nilai text yang dklik
		Object o = this.getListAdapter().getItem(position);
		String pilihan = o.toString();
		// Menampilkan hasil pilihan menu dalam bentuk Toast
		tampilkanPilihan(pilihan);
	
    }
    public void ringkas(String pilihan){
    	Intent i = null;
    	rukunapa.setText(pilihan.toString());
		String nama = rukunapa.getText().toString();
		i = new Intent(this, Rukun.class);
		i.putExtra("nama", nama);
		startActivity(i);
    }
	/**
	 * Tampilkan Activity sesuai dengan menu yang dipilih
	 *
	 */
	protected void tampilkanPilihan(String pilihan) {
		try {
			//Intent digunakan untuk sebagai pengenal suatu activity
			Intent i = null;
			if (pilihan.equals("Niat")) {
				ringkas(pilihan);}
			else if (pilihan.equals("Berdiri jika mampu")) {
				ringkas(pilihan);}
			else if (pilihan.equals("Takbiratul Irham")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Membaca Al-Fatinah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Ruku’")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("I’Tidal")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Sujud dua kali")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Duduk antara dua sujud")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Duduk yang terakhir")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Tasyahud")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Shalawat Atas Nabi SAW")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Salam yang pertama")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Menertibkan rukun-rukun")) {
				ringkas(pilihan);}	
			
			
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}    
	
    }
    
