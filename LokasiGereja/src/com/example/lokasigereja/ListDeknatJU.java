package com.example.lokasigereja;




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
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;




 
public class ListDeknatJU extends ListActivity  {
	 

    private ListView list;
    ArrayAdapter adapter;
    TextView input;
     TextView namagereja;
 
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
       getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 
        
      String namagereja[] = {"Salib Suci"
        		,"St. Alfonsus"
        		,"St. Lukas"
        		,"St. Yakobus"
        		,"St. Fransiskus Xaverius"
        		,"St. Antonius Padua"
        		,"Stella Maris"
        		,"St. Philipus Rasul"        		};
      setContentView(R.layout.listdeknatju);
      input = (TextView) findViewById(R.id.editText1);
     
		this.setListAdapter(adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, namagereja));
		
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
    	input.setText(pilihan.toString());
		String nama = input.getText().toString();
		i = new Intent(this, Map_Gereja.class);
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
			if (pilihan.equals("Salib Suci")) {
				ringkas(pilihan);}
			else if (pilihan.equals("St. Alfonsus")) {
				ringkas(pilihan);}
			else if (pilihan.equals("St. Lukas")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("St. Yakobus")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("St. Fransiskus Xaverius")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("St. Antonius Padua")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Stella Maris")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("St. Philipus Rasul")) {
				ringkas(pilihan);}	
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}    
	
    }
    
