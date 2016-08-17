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
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;




 
public class Listjs extends ListActivity  {
	 

    private ListView list;
    ArrayAdapter adapter;
    EditText input;
     TextView namamesjid;
 
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 
       
        
      String NamaMesjid[] = {"At Taqwa"
      		,"At Tin"
      		,"baitul Hakim"
      		,"Baitul Ihsan"
      		,"Baitul Khoir"
      		,"BAITUL MUGHNI"
      		,"Baitul Muhajirin"
      		,"Baitul Rahmah"
      		,"Baitur Rahman"
      		,"BAITUS SALAM"
      		,"Darrus Salam"
      		,"Istiqlal"
      		,"Jami' Matraman"
      		,"Jami Al Barokah"
      		};
      setContentView(R.layout.listmasjid);
      input = (EditText) findViewById(R.id.editText1);
     
		this.setListAdapter(adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, NamaMesjid));
		input.addTextChangedListener(new TextWatcher() {
            
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
    	input.setText(pilihan.toString());
		String nama = input.getText().toString();
		i = new Intent(this, Utama.class);
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
			if (pilihan.equals("Abu Bakar Ash Shidiq")) {
				ringkas(pilihan);}
			else if (pilihan.equals("Al akhbar")) {
				ringkas(pilihan);}
			else if (pilihan.equals("Al Ikhlas")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("AL Husna")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Istiqamah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Huda Muhammadiyah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Bahri")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("AL Ittihad")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("AL Ihsaniyah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Barkah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Abidin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Furqan")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Maghfur")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Huriyah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Akhyar")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Amanah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Amin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Furqon")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Hasanah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Hidayah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al I'tisham")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Ikhwan")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Insan")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Karomah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Munawar")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Al Qunniyah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("An Nida")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("An Nur")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Ar Rahman")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("At Tahiriyah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("At Taqwa")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("At Tin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("baitul Hakim")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Baitul Ihsan")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Baitul Khoir")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("BAITUL MUGHNI")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Baitul Muhajirin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Baitul Rahmah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Baitur Rahman")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("BAITUS SALAM")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Darrus Salam")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Istiqlal")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami' Matraman")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Barokah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Hidayah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Ikhwan")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Irsyad")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Makmur")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Marzuqiyah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Muharam")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Al Sofwa")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Ar Rohah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Asy Syakirin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami At Taqwa")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Baabusallam")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Baitul Khair")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Maulanan Hasanudin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Nurul Huda")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Jami Nurul Yaqin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Khusnul Khatimah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Masjid Bimantara")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Masjid Islamic Center Indonesia")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Masjid Baitul Muhajirin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("MASJID RAYA AL-ITTIHAD")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Masjid Raya Cipinang Muara")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Masjid SMP 115")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Nur Aulia")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Nur Rohman")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Nurull Huda")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Nurul Islam")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Nurul Jamal")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Nurul Yaqin")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Raudhatul Jannah")) {
				ringkas(pilihan);}	
			else if (pilihan.equals("Ummul Quro'")) {
				ringkas(pilihan);}	
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}    
	
    }
    
