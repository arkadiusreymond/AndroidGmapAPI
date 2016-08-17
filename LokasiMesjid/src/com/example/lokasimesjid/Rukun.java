package com.example.lokasimesjid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ImageView;
import android.widget.TextView;;


public class Rukun extends  Activity {
	  private TextView dptrukun;
	  private TextView rukunnya;
	  private TextView rukunnya2;
	  private TextView rukunnya3;
	  private ImageView niat;
	  private ImageView tahasyud;
	  private ImageView tahasyudd;
	  private ImageView berdirijkmmp;
	  private ImageView berdirijkmmpp;
	  private ImageView takbiratul;
	  private ImageView alfatinah;
	  private ImageView dudukdiantara;
	  
	 
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.rukun);
	    dptrukun = (TextView)findViewById(R.id.dptrukun);
	    rukunnya = (TextView)findViewById(R.id.rukunnya);
	    rukunnya2 = (TextView)findViewById(R.id.rukunnya2);
	    rukunnya3 = (TextView)findViewById(R.id.rukunnya3);
	    niat = (ImageView)findViewById(R.id.niat);
	    berdirijkmmp = (ImageView)findViewById(R.id.berdirijkmp);
	    berdirijkmmpp = (ImageView)findViewById(R.id.berdirijkmpp);
	    takbiratul = (ImageView)findViewById(R.id.takbiratul);
	    alfatinah = (ImageView)findViewById(R.id.alfatinah);
	    tahasyud = (ImageView)findViewById(R.id.tahasyud);
	    tahasyudd = (ImageView)findViewById(R.id.tahasyudd);
	    dudukdiantara = (ImageView)findViewById(R.id.dudukdiantara);
	    
	    
	    Intent it = getIntent();
	    String data =  it.getStringExtra("nama");
	    dptrukun.setText(data);
	    if(dptrukun.getText().toString().equals("Niat")){
	    	rukunnya.setVisibility(0);
	    	   rukunnya.setText("Niat ialah menyengaja melakukan sesuatu bebareng dengan dilakukannya bagian pertamadari sesuatu itu. Tempat niat ada dalam hari. Adapun dalilnya ialah sabda Nabi SAW:");
	    niat.setVisibility(0);
	    rukunnya2.setVisibility(0);
	    rukunnya2.setText("Sesungguhnya pekerjaan-pekerjaan itu bergantung pada niat-niatnya. (H.R. al-Bukhari: 1, dan Muslim:1907)"

+"\n"+"\n"+"Sahnya niat dalam shalat, harus berbareng dengan Takbiratul Ihram. Yakni ketika mengucapkan takbir hendaklah hari sadar betul bermaksud melakukan shalat, dengan mengingat shalat apa yang dilakukan, dan juga tentang kefardhuannya. Dan tidak dipersyaratkan menggerakkan lidah dalam berniat.");
	    }
	    else if(dptrukun.getText().toString().equals("Berdiri jika mampu")){
	    	rukunnya.setVisibility(0);
	    	   rukunnya.setText("Dalil dari rukun ini ialah hadits yang diriwayatkan oleh al-Bukhari (1066), dari “Imran bin Hushain RA, dia berkata:");
	    berdirijkmmp.setVisibility(0);
	    rukunnya2.setVisibility(0);
	    rukunnya2.setText("Pernah aku terkena wasir. Maka, aku bertanya kepada Rasulullah SAW tentang shalat. Beliau menjawab: “Shalatlah sambil berdiri kalau kamu tidak mampu, maka duduklah. Kalau tidak mampu juga, mka berbaringlah miring.”"

+"\n"+"\n"+"Seseorang bisa dikatakan berdiri, apabila dia tegak lurus. Tetapi apabila dia membungkuk tanpa uzur, sehingga telapak tangannya dapat menyentuh lututnya, maka batal shalatnya. Karena salah satu rukun, berdiri, tidak terdapat pada salah satu bagian dari shalatnya. Dan apabila orang yang mampu shalat itu mampu berdiri pada sebagian shalatnya, sedang pada sebagian lainnya tidak, maka dia wajib berdiri dimana saja yang memungkinkan, dan selebihnya duduk."

+"\n"+"\n"+"Dengan adanya ikatan shalat fardhu, maka shalat sunnah tidak termasuk yang diwajibkan berdiri. Artinya, berdiri dalam shalat sunnah adalah mutlak mandub hukumnya. Jadi, orangoleh duduk dalam shalat sunnah, baik dia mampu berdiri atau tidak. Al-Bukhari (1065) telah meriwayatkan, bahwa Nabi SAW bersabda:");
	    berdirijkmmpp.setVisibility(0);
	    rukunnya3.setVisibility(0);
	    rukunnya3.setText("Barangsiapa shalat sambil berdiri, itu lebih baik. Barangsiapa shalat sambil duduk, dia memperoleh separo pahala orang yang berdiri. Dan barangsiapa shalat sambil tiduran, maka dia memperoleh separo pahala orang yang duduk. Yang dimaksud tifuran (na’iman): berbaring.");
	    
	    }
	    else if(dptrukun.getText().toString().equals("Takbiratul Irham")){
	    rukunnya.setVisibility(0);
	    rukunnya.setText("Dalilnya ialah sebuah hadits riwayat at-Tirmidzi (3), Abu Daud (61) dan lainnya, bahwa Nabi SAW bersabda:");
	    takbiratul.setVisibility(0);
	    rukunnya2.setVisibility(0);
	    rukunnya2.setText("Kunci shalat ialah bersuci, tahrimnya ialah takbir, dan ahlilnya ialah mengucapakan salam. Tahrim: pengharaman. Maksudnya, saat mulai diharamkannya beberapa hal selama dalam shalat. Tahlil: penghalalan. Maksudnya, saat mulai dihalalkan kembali hal-hal tersebut");
	    }
	    else if(dptrukun.getText().toString().equals("Membaca Al-Fatinah")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Membaca surat al-Fatihah adalah rukun pada setiap rakaat dalam shalat apa pun. Dalilnya adalah sebuah hadits riwayat al-Bukhari (723), dan Muslim (394), bahwa Nabi SAW bersabda:");
		    alfatinah.setVisibility(0);
		    rukunnya2.setVisibility(0);
		    rukunnya2.setText("Tidak sah shalat seseorang yang tidak membaca Fatihah Kitab"

		    		+"\n"+"\n"+"Sedang Basmalah adalah salah satu ayat dalam Surat al-Fatihah. Dengan demikian, tidaklah sah bacaan surat al-fatihah, apabila tidak dimulai dengan: Bismi’l-Lahi ‘r-Rohmani ‘r-Rohim. Karena ada sebuah hadits riwayat Ibnu Khuzaimah dengan Isnad shahih, dari Ummu Slamah RA: اَنَّ النَّبِيَّ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ عَدَّ بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيْمِ اَيَةً Bahwasanya Nabi SAW menghitung Bismi’l-Lahi ‘r-Rohmani ‘r-Rohim sebagai salah satu ayat. ");
		    }
	    else if(dptrukun.getText().toString().equals("Ruku’")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Menurut syara’, ruku’ ialah menunduk seukuran yang memungkin seorang mustahalli meletakkan telapak tangannya pada lututnya. Ini adalah umuran minimal. Sedang ruku’ yangpaling sempurna ialah menunduk sehingga punggung menjadi rata. ");
		    
		    }
	    else if(dptrukun.getText().toString().equals("I’Tidal")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("I’tidal ialah berdri tegal yang memisahkan antara ruku’ dan sujud. ");
		    
		    
		    }
	    else if(dptrukun.getText().toString().equals("Sujud dua kali")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Menurut syara’, definisi ialah menempelnya kening orang shalat pada tempat sujud.");
	    
	    }
	    else if(dptrukun.getText().toString().equals("Duduk antara dua sujud")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Duduk antara dua sujud wajib dilakukan pada setiap rakaat." 

		    		+"\n"+"\n"+"DALIL DUDUK ANTARA DUA SUJUD Adapun dalilnya ialah sabda Nabi SAW dalam hadits tersebut di atas, yang antara lain:");
	    dudukdiantara.setVisibility(0);
	    rukunnya2.setVisibility(0);
	    rukunnya2.setText("Kemudian bangkitlah sehingga kamu duduk dengan tenang (Thuma’ninah). (Lihat dalil sujud)");
	    }
	    else if(dptrukun.getText().toString().equals("Duduk yang terakhir")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Yang dimaksud ialah duduk pada akhir rakaat yang terakhir dari shalat itu, yang dipungkasi dengan salam.");
	   
	    }
	    else if(dptrukun.getText().toString().equals("Tasyahud")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Tasyahud termasuk rukun shalat, karena ada sebuah hadits riwayat al-Bukhari (5806), danMuslim (402) dan lainnya dari Ibnu Mas’ud RA, dia berkata: “Dulu, apabila kamu shalat bersama Nabi SAW, kami mengucapkan –sedang menurut al-Baihaqi (2/138), dan ad-Daruquthni (1/350), kami mengucapkan sebelum kami diwajibkan membaca tasyahud-:");
	   tahasyud.setVisibility(0);
	   rukunnya2.setVisibility(0);
	   rukunnya2.setText("Sejahtera atas Allah sebelum hamba-hamba-Nya. sejahetera atas Jibril. Sejahtera atas Mika’il. Sejahtera atas Fulan." 

			   +"\n"+"\n"+"Namun, setelah Nabi SAW berlalu, maka beliau menghadapkan ke mukanya kepada kami, lalu bersabda:");
	    tahasyudd.setVisibility(0);
	    rukunnya3.setVisibility(0);
	    rukunnya3.setText("....... Sesunguhnya Allah adalah Maha Sejahtera. Mka, apabila seorang dari kamu sekalian duduk dalam shalat, ucapkanlah, “at-Tahiyatu.....”" 

	    		 +"\n"+"\n"+"Huwa ‘s-Salam, maksudnya, as-Salam adalah salah satu di antara nama-nama Allah Ta’ala yang konon artinya: Allah Sejahtera dari hal-hal yang menimpa makhluk-Nya, seperti cacat dan kebinasaan. (An-Nihayah).");
	    }
	    else if(dptrukun.getText().toString().equals("Shalawat Atas Nabi SAW")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Maksudnya, membaca shalawat atas NabiMuhammad SAW sesudah selesai membaca tasyahud tersebut di atas, sebelum salam. ");
	   
	    }
	    else if(dptrukun.getText().toString().equals("Salam yang pertama")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Yaitu ucapan mushalli dengan menengok ke kanan: اَلسَّلاَمُ عَلَيْكُمْ وَرَحْمَةُ اللهِ Yang artinya: Sejahtera dan rahmat Allah atas kamu sekalian.");
	   
	    }
	    else if(dptrukun.getText().toString().equals("Menertibkan rukun-rukun")){
		    rukunnya.setVisibility(0);
		    rukunnya.setText("Yakni, dimulai dengan niat dan Takbiratul Ihram, kemudian membaca al-Fatihah, lalu ruku’, i’tidal, sujud.....dst."

		    		+"\n"+"\n"+"Apabila ada salah satu di antara rukun-rukun ini didahulukan daripada yang semestinya, maka shalat menjadi batal, manakala disengaja. Adapun kalau hal itu dilakukan tanpa disengaja, maka shalat itu, sejak yang pertama-tama dilakukan tidak pada tempatnya, menjadi batal." 

+"\n"+"\n"+"Dengan demikian, dari sejak iru seluruhnya wajib diulangi. Dengan demikian, kalau mushalli meneruskan shalatnya –setelah merubah urutan yang diperintahkan- sampai kepada tempat yang serupa pada rakaat berikutnya, maka amalan yang benar pada rakaat berikutnya itu, menggantikan amalan yang rusak pada rakaat sebelumnya tadi. Dan dengan demikian, shalatnya wajib ditambah satu rakaat lagi, sebagai ganti rakaat yang rusak, dikarenakan rusaknya urutan di antara rukun-rukun.");
	   
	    }
	    
	
	}
	    
	    
	  
	

	  @Override
	  public boolean onCreateOptionsMenu(Menu menu) {
	    getMenuInflater().inflate(R.menu.main, menu);
	    return true;
	  }
	}

