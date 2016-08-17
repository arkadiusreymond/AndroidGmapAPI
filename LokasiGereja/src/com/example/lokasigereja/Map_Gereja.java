package com.example.lokasigereja;



import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

//http://cariprogram.blogspot.com
//nuramijaya@gmail.com

public class Map_Gereja extends FragmentActivity {
 final int RQS_GooglePlayServices = 1;
 private GoogleMap myMap;
 private TextView namagereja;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager myFragmentManager = getSupportFragmentManager();
        SupportMapFragment mySupportMapFragment = (SupportMapFragment)myFragmentManager.findFragmentById(R.id.map);
        myMap = mySupportMapFragment.getMap();
        namagereja = (TextView)findViewById(R.id.namagereja);
	    Intent it = getIntent();
	    String data =  it.getStringExtra("nama");
	    namagereja.setText(data);
        
       /*lokasi-lokasi gerejanya */
        LatLng lok1 = new LatLng(-6.115635,106.917518);
        MarkerOptions markerlok1 = new MarkerOptions();
        markerlok1.position(lok1);
        markerlok1.title("Salib Suci");
        markerlok1.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok1);
        
        LatLng lok2 = new LatLng(-6.138869,106.845342);
        MarkerOptions markerlok2 = new MarkerOptions();
        markerlok2.position(lok2);
        markerlok2.title("St. Alfonsus");
        markerlok2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok2);
        
        LatLng lok3 = new LatLng(-6.122292,106.81575);
        MarkerOptions markerlok3 = new MarkerOptions();
        markerlok3.position(lok3);
        markerlok3.title("St. Lukas");
        markerlok3.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok3);
        
        LatLng lok4 = new LatLng(-6.15071,106.886316);
        MarkerOptions markerlok4 = new MarkerOptions();
        markerlok4.position(lok4);
        markerlok4.title("St. Yakobus");
        markerlok4.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok4);
        
        LatLng lok5 = new LatLng(-6.111539,106.894371);
        MarkerOptions markerlok5 = new MarkerOptions();
        markerlok5.position(lok5);
        markerlok5.title("St. Fransiskus Xaverius");
        markerlok5.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok5);
        
        LatLng lok6 = new LatLng(-6.110174,106.791031);
        MarkerOptions markerlok6 = new MarkerOptions();
        markerlok6.position(lok6);
        markerlok6.title("Stella Maris");
        markerlok6.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok6);
        
        LatLng lok7 = new LatLng(-6.130655,106.780189);
        MarkerOptions markerlok7 = new MarkerOptions();
        markerlok7.position(lok7);
        markerlok7.title("St. Philipus Rasul");
        markerlok7.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok7);
        
        LatLng lok8 = new LatLng(-6.220425,106.811721);
        MarkerOptions markerlok8 = new MarkerOptions();
        markerlok8.position(lok8);
        markerlok8.title("SP. Maria Ratu");
        markerlok8.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok8);
        
        LatLng lok9 = new LatLng(-6.283221,106.838554);
        MarkerOptions markerlok9 = new MarkerOptions();
        markerlok9.position(lok9);
        markerlok9.title("Keluarga Kudus");
        markerlok9.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok9);
        
        LatLng lok10 = new LatLng(-6.240903,106.794807);
        MarkerOptions markerlok10 = new MarkerOptions();
        markerlok10.position(lok10);
        markerlok10.title("St. Yohanes Penginjil");
        markerlok10.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok10);
        
        LatLng lok11 = new LatLng(-6.232541,106.841156);
        MarkerOptions markerlok11 = new MarkerOptions();
        markerlok11.position(lok11);
        markerlok11.title("St. Fransiskus Asisi");
        markerlok11.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok11);
        
        LatLng lok12 = new LatLng(-6.278102,106.792549);
        MarkerOptions markerlok12 = new MarkerOptions();
        markerlok12.position(lok12);
        markerlok12.title("St.Stefanus");
        markerlok12.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok12);
        
        LatLng lok13 = new LatLng(-6.328265,106.821045);
        MarkerOptions markerlok13 = new MarkerOptions();
        markerlok13.position(lok13);
        markerlok13.title("Ratu Rosari Kapel Bahtera Kasih");
        markerlok13.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok13);
        
        LatLng lok14 = new LatLng(-6.184929,106.946701);
        MarkerOptions markerlok14 = new MarkerOptions();
        markerlok14.position(lok14);
        markerlok14.title("St. Gabriel");
        markerlok14.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok14);
        
        LatLng lok15 = new LatLng(-6.223497,106.909622);
        MarkerOptions markerlok15 = new MarkerOptions();
        markerlok15.position(lok15);
        markerlok15.title("St. Anna");
        markerlok15.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok15);
        
        LatLng lok16 = new LatLng(-6.258308,106.86705);
        MarkerOptions markerlok16 = new MarkerOptions();
        markerlok16.position(lok16);
        markerlok16.title("St. Robertus Bellarminus");
        markerlok16.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok16);
        
        LatLng lok17 = new LatLng(-6.173153,106.886303);
        MarkerOptions markerlok17 = new MarkerOptions();
        markerlok17.position(lok17);
        markerlok17.title("St. Bonaventura");
        markerlok17.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok17);
        
        LatLng lok18 = new LatLng(-6.306767,106.859154);
        MarkerOptions markerlok18 = new MarkerOptions();
        markerlok18.position(lok18);
        markerlok18.title("St. Aloysius Gonzaga");
        markerlok18.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok18);
        
        LatLng lok19 = new LatLng(-6.232029,106.867592);
        MarkerOptions markerlok19 = new MarkerOptions();
        markerlok19.position(lok19);
        markerlok19.title("St. Antonius Padua");
        markerlok19.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok19);
        
        LatLng lok20 = new LatLng(-6.189537,106.885616);
        MarkerOptions markerlok20 = new MarkerOptions();
        markerlok20.position(lok20);
        markerlok20.title("Keluarga Kudus");
        markerlok20.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok20);
        
        LatLng lok21 = new LatLng(-6.193121,106.857437);
        MarkerOptions markerlok21 = new MarkerOptions();
        markerlok21.position(lok21);
        markerlok21.title("St. Yoseph");
        markerlok21.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok21);
        
        LatLng lok22 = new LatLng(-6.175756,106.810001);
        MarkerOptions markerlok22 = new MarkerOptions();
        markerlok22.position(lok22);
        markerlok22.title("Maria Bunda Perantara");
        markerlok22.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok22);
        
        LatLng lok23 = new LatLng(-6.149771,106.803879);
        MarkerOptions markerlok23 = new MarkerOptions();
        markerlok23.position(lok23);
        markerlok23.title("Damai Kristus");
        markerlok23.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok23);
        
        LatLng lok24 = new LatLng(-6.185931,106.845449);
        MarkerOptions markerlok24 = new MarkerOptions();
        markerlok24.position(lok24);
        markerlok24.title("Hati Kudus");
        markerlok24.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok24);
        
        LatLng lok25 = new LatLng(-6.137141,106.821388);
        MarkerOptions markerlok25 = new MarkerOptions();
        markerlok25.position(lok25);
        markerlok25.title("St.Petrus&Paulus");
        markerlok25.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok25);
        
        LatLng lok26 = new LatLng(-6.191073,106.805107);
        MarkerOptions markerlok26 = new MarkerOptions();
        markerlok26.position(lok26);
        markerlok26.title("Kristus Salvator");
        markerlok26.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok26);
        
        LatLng lok27 = new LatLng(-6.143094,106.811632);
        MarkerOptions markerlok27 = new MarkerOptions();
        markerlok27.position(lok27);
        markerlok27.title("St. Maria de Fatima");
        markerlok27.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok27);
        
        LatLng lok28 = new LatLng(-6.189579,106.780154);
        MarkerOptions markerlok28 = new MarkerOptions();
        markerlok28.position(lok28);
        markerlok28.title("Maria Bunda Karmel");
        markerlok28.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok28);
        
        LatLng lok29 = new LatLng(-6.168716,106.791374);
        MarkerOptions markerlok29 = new MarkerOptions();
        markerlok29.position(lok29);
        markerlok29.title("St. Kristoforus");
        markerlok29.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok29);
        
        LatLng lok30 = new LatLng(-6.160694,106.741091);
        MarkerOptions markerlok30 = new MarkerOptions();
        markerlok30.position(lok30);
        markerlok30.title("St. Thomas Rasul");
        markerlok30.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok30);
        
        LatLng lok31 = new LatLng(-6.135776,106.724228);
        MarkerOptions markerlok31 = new MarkerOptions();
        markerlok31.position(lok31);
        markerlok31.title("Trinitas");
        markerlok31.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok31);
        
        LatLng lok32 = new LatLng(-6.156939,106.758903);
        MarkerOptions markerlok32 = new MarkerOptions();
        markerlok32.position(lok32);
        markerlok32.title("St. Andreas");
        markerlok32.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok32);
        
        LatLng lok33 = new LatLng(-6.205408,106.731121);
        MarkerOptions markerlok33 = new MarkerOptions();
        markerlok33.position(lok33);
        markerlok33.title("Maria Kusuma Karmel");
        markerlok33.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok33);
        
        LatLng lok34 = new LatLng(-6.169654,106.863485);
        MarkerOptions markerlok34 = new MarkerOptions();
        markerlok34.position(lok34);
        markerlok34.title("St. Paskalis");
        markerlok34.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok34);
        
        LatLng lok35 = new LatLng(-6.15967,106.831688);
        MarkerOptions markerlok35 = new MarkerOptions();
        markerlok35.position(lok35);
        markerlok35.title("St.Perawan Maria Diangkat ke Surga");
        markerlok35.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok35);
        
        LatLng lok36 = new LatLng(-6.256602,106.973137);
        MarkerOptions markerlok36 = new MarkerOptions();
        markerlok36.position(lok36);
        markerlok36.title("St. Bartholomeus");
        markerlok36.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok36);
        
        LatLng lok37 = new LatLng(-6.185931,106.845449);
        MarkerOptions markerlok37 = new MarkerOptions();
        markerlok37.position(lok37);
        markerlok37.title("Hati Kudus");
        markerlok37.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok37);
        
        LatLng lok38 = new LatLng(-6.199094,106.838924);
        MarkerOptions markerlok38 = new MarkerOptions();
        markerlok38.position(lok38);
        markerlok38.title("St. Ignatius");
        markerlok38.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok38);
        
        LatLng lok39 = new LatLng(-6.206858,106.808928);
        MarkerOptions markerlok39 = new MarkerOptions();
        markerlok39.position(lok39);
        markerlok39.title("Kristus Raja");
        markerlok39.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok39);
        
        LatLng lok40 = new LatLng(-6.184929,106.826221);
        MarkerOptions markerlok40 = new MarkerOptions();
        markerlok40.position(lok40);
        markerlok40.title("St. Theresia");
        markerlok40.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok40);
        
        LatLng lok41 = new LatLng(-6.204043,106.709808);
        MarkerOptions markerlok41 = new MarkerOptions();
        markerlok41.position(lok41);
        markerlok41.title("St. Bernadet");
        markerlok41.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok41);
        
        LatLng lok42 = new LatLng(-6.253189,106.763565);
        MarkerOptions markerlok42 = new MarkerOptions();
        markerlok42.position(lok42);
        markerlok42.title("St. Matius, Penginjil");
        markerlok42.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok42);
        
        LatLng lok43 = new LatLng(-6.194998,106.847336);
        MarkerOptions markerlok43 = new MarkerOptions();
        markerlok43.position(lok43);
        markerlok43.title("St. Agustinus");
        markerlok43.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok43);
        
        LatLng lok44 = new LatLng(-6.338502,106.74929);
        MarkerOptions markerlok44 = new MarkerOptions();
        markerlok44.position(lok44);
        markerlok44.title("Rasul Barnabas");
        markerlok44.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok44);
        
        LatLng lok45 = new LatLng(-6.239538,106.741936);
        MarkerOptions markerlok45 = new MarkerOptions();
        markerlok45.position(lok45);
        markerlok45.title("St. Monika");
        markerlok45.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok45);
        
        LatLng lok46 = new LatLng(-6.223497,106.968673);
        MarkerOptions markerlok46 = new MarkerOptions();
        markerlok46.position(lok46);
        markerlok46.title("St. Mikhael");
        markerlok46.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok46);
        
        LatLng lok47 = new LatLng(-6.162508,106.660549);
        MarkerOptions markerlok47 = new MarkerOptions();
        markerlok47.position(lok47);
        markerlok47.title("St. Maria");
        markerlok47.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok47);
        
        LatLng lok48 = new LatLng(-6.235272,107.020542);
        MarkerOptions markerlok48 = new MarkerOptions();
        markerlok48.position(lok48);
        markerlok48.title("St. Arnoldus");
        markerlok48.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok48);
        
        LatLng lok49 = new LatLng(-6.265688, 106.936580);
        MarkerOptions markerlok49 = new MarkerOptions();
        markerlok49.position(lok49);
        markerlok49.title("St. Leo Agung");
        markerlok49.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok49);
        
        LatLng lok50 = new LatLng(-6.306426,106.939437);
        MarkerOptions markerlok50 = new MarkerOptions();
        markerlok50.position(lok50);
        markerlok50.title("St. Servatius");
        markerlok50.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok50);
        
        LatLng lok51 = new LatLng(-6.277078,106.904815);
        MarkerOptions markerlok51 = new MarkerOptions();
        markerlok51.position(lok51);
        markerlok51.title("Kalvari");
        markerlok51.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        myMap.addMarker(markerlok51);
        
        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        myMap.getUiSettings().setCompassEnabled(true);
        myMap.getUiSettings().setZoomControlsEnabled(true);
        myMap.getUiSettings().setMyLocationButtonEnabled(true);
        myMap.setMyLocationEnabled(true);
        if(namagereja.getText().toString().equals("Salib Suci")){
      	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok1, 15));}
	    else if(namagereja.getText().toString().equals("St. Alfonsus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok2, 15));}
	    else if(namagereja.getText().toString().equals("St. Lukas")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok3, 15));}
	    else if(namagereja.getText().toString().equals("St. Yakobus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok4, 15));}
	    else if(namagereja.getText().toString().equals("St. Fransiskus Xaverius")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok5, 15));}
	    else if(namagereja.getText().toString().equals("Stella Maris")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok6, 15));}
	    else if(namagereja.getText().toString().equals("St. Philipus Rasul")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok7, 15));}
	    else if(namagereja.getText().toString().equals("SP. Maria Ratu")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok8, 15));}
	    else if(namagereja.getText().toString().equals("Keluarga Kudus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok9, 15));}
	    else if(namagereja.getText().toString().equals("St. Yohanes Penginjil")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok10, 15));}
	    else if(namagereja.getText().toString().equals("St. Fransiskus Asisi")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok11, 15));}
	    else if(namagereja.getText().toString().equals("St.Stefanus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok12, 15));}
	    else if(namagereja.getText().toString().equals("Ratu Rosari Kapel Bahtera Kasih")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok13, 15));}
	    else if(namagereja.getText().toString().equals("St. Gabriel")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok14, 15));}
	    else if(namagereja.getText().toString().equals("St. Anna")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok15, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Robertus Bellarminus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok16, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Bonaventura")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok17, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Aloysius Gonzaga")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok18, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Antonius Padua")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok19, 15));}
    
	    else if(namagereja.getText().toString().equals("Keluarga Kudus2")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok20, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Yoseph")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok21, 15));}
    
	    else if(namagereja.getText().toString().equals("Maria Bunda Perantara")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok22, 15));}
    
	    else if(namagereja.getText().toString().equals("Damai Kristus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok23, 15));}
    
	    else if(namagereja.getText().toString().equals("Hati Kudus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok24, 15));}
    
	    else if(namagereja.getText().toString().equals("St.Petrus&Paulus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok25, 15));}
    
	    else if(namagereja.getText().toString().equals("Kristus Salvator")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok26, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Maria de Fatima")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok27, 15));}
    
	    else if(namagereja.getText().toString().equals("Maria Bunda Karmel")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok28, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Kristoforus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok29, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Thomas Rasul")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok30, 15));}
    
	    else if(namagereja.getText().toString().equals("Trinitas")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok31, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Andreas")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok32, 15));}
    
	    else if(namagereja.getText().toString().equals("Maria Kusuma Karmel")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok33, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Paskalis")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok34, 15));}
    
	    else if(namagereja.getText().toString().equals("St.Perawan Maria Diangkat ke Surga")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok35, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Bartholomeus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok36, 15));}
    
	    else if(namagereja.getText().toString().equals("Hati Kudus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok37, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Ignatius")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok38, 15));}
    
	    else if(namagereja.getText().toString().equals("Kristus Raja")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok39, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Theresia")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok40, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Bernadet")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok41, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Matius, Penginjil")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok42, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Agustinus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok43, 15));}
    
	    else if(namagereja.getText().toString().equals("Rasul Barnabas")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok44, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Monika")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok45, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Mikhael")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok46, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Maria")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok47, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Arnoldus")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok48, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Leo Agung")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok49, 15));}
    
	    else if(namagereja.getText().toString().equals("St. Servatius")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok50, 15));}
    
	    else if(namagereja.getText().toString().equals("Kalvari")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok51, 15));}
    
	    
    
	   
    
    
    
      myMap.setOnMarkerClickListener(new OnMarkerClickListener() {
 
 @Override
 public boolean onMarkerClick(Marker arg0) {
  // TODO Auto-generated method stub
  
  try {
   StringBuilder urlString = new StringBuilder();         
   String daddr = (String.valueOf(arg0.getPosition().latitude)+","+String.valueOf(arg0.getPosition().longitude)); 
   urlString.append("http://maps.google.com/maps?f=d&hl=en"); 
   urlString.append("&saddr="+String.valueOf(myMap.getMyLocation().getLatitude())+","+String.valueOf(myMap.getMyLocation().getLongitude())); 
   urlString.append("&daddr="+daddr);
   Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString.toString()));
   startActivity(i);
  } catch (Exception ee) {
   Toast.makeText(getApplicationContext(), "Lokasi Saat Ini Belum Didapatkan, Coba Nyalakan GPS, Keluar Ruangan dan Tunggu Beberapa Saat", Toast.LENGTH_LONG).show();
  }
  return false;
 }
});
      
      
      myMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
 
 @Override
 public void onInfoWindowClick(Marker arg0) {
  // TODO Auto-generated method stub
  //JIKA KLIKNYA INGIN DI INFO WINDOW
 }
});
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
  }
  
}