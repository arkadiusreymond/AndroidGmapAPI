package com.example.lokasimesjid;



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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//http://cariprogram.blogspot.com
//nuramijaya@gmail.com

public class Utama extends FragmentActivity {
 final int RQS_GooglePlayServices = 1;
 private GoogleMap myMap;
 private TextView namamasjid;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager myFragmentManager = getSupportFragmentManager();
        SupportMapFragment mySupportMapFragment = (SupportMapFragment)myFragmentManager.findFragmentById(R.id.map);
        myMap = mySupportMapFragment.getMap();
        namamasjid = (TextView)findViewById(R.id.namamasjid);
	    Intent it = getIntent();
	    String data =  it.getStringExtra("nama");
	    namamasjid.setText(data);
        
       /*lokasi-lokasi masjidnya */
        LatLng lok1 = new LatLng(-6.243519, 106.869043);
        MarkerOptions markerlok1 = new MarkerOptions();
        markerlok1.position(lok1);
        markerlok1.title("Abu Bakar Ash Shidiq");
        markerlok1.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok1);
        
        LatLng lok2 = new LatLng(-6.234552, 106.887848);
        MarkerOptions markerlok2 = new MarkerOptions();
        markerlok2.position(lok2);
        markerlok2.title("Al akhbar");
        markerlok2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok2);
        
        LatLng lok3 = new LatLng(-6.236144, 106.886622);
        MarkerOptions markerlok3 = new MarkerOptions();
        markerlok3.position(lok3);
        markerlok3.title("Al Ikhlas");
        markerlok3.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok3);
        
        LatLng lok4 = new LatLng(-6.234541, 106.891788);
        MarkerOptions markerlok4 = new MarkerOptions();
        markerlok4.position(lok4);
        markerlok4.title("AL Husna");
        markerlok4.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok4);
        
        LatLng lok5 = new LatLng(-6.224222, 106.863555);
        MarkerOptions markerlok5 = new MarkerOptions();
        markerlok5.position(lok5);
        markerlok5.title("Al Istiqamah");
        markerlok5.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok5);
        
        LatLng lok6 = new LatLng(-6.234283, 106.853494);
        MarkerOptions markerlok6 = new MarkerOptions();
        markerlok6.position(lok6);
        markerlok6.title("Al Huda Muhammadiyah");
        markerlok6.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok6);
        
        LatLng lok7 = new LatLng(-6.234461, 106.876545);
        MarkerOptions markerlok7 = new MarkerOptions();
        markerlok7.position(lok7);
        markerlok7.title("Al Bahri");
        markerlok7.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok7);
        
        LatLng lok8 = new LatLng(-6.231811, 106.847628);
        MarkerOptions markerlok8 = new MarkerOptions();
        markerlok8.position(lok8);
        markerlok8.title("AL Ittihad");
        markerlok8.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok8);
        
        LatLng lok9 = new LatLng(-6.224270, 106.869147);
        MarkerOptions markerlok9 = new MarkerOptions();
        markerlok9.position(lok9);
        markerlok9.title("AL Ihsaniyah");
        markerlok9.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok9);
        
        LatLng lok10 = new LatLng(-6.229283, 106.912173);
        MarkerOptions markerlok10 = new MarkerOptions();
        markerlok10.position(lok10);
        markerlok10.title("Al Barkah");
        markerlok10.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok10);
        
        LatLng lok11 = new LatLng(-6.229016, 106.904075);
        MarkerOptions markerlok11 = new MarkerOptions();
        markerlok11.position(lok11);
        markerlok11.title("Al Abidin");
        markerlok11.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok11);
        
        LatLng lok12 = new LatLng(-6.184582, 106.844589);
        MarkerOptions markerlok12 = new MarkerOptions();
        markerlok12.position(lok12);
        markerlok12.title("Al Furqan");
        markerlok12.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok12);
        
        LatLng lok13 = new LatLng(-6.222900, 106.892979);
        MarkerOptions markerlok13 = new MarkerOptions();
        markerlok13.position(lok13);
        markerlok13.title("Al Maghfur");
        markerlok13.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok13);
        
        LatLng lok14 = new LatLng(-6.185334, 106.831323);
        MarkerOptions markerlok14 = new MarkerOptions();
        markerlok14.position(lok14);
        markerlok14.title("Al Huriyah");
        markerlok14.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok14);
        
        LatLng lok15 = new LatLng(-6.240364, 106.873353);
        MarkerOptions markerlok15 = new MarkerOptions();
        markerlok15.position(lok15);
        markerlok15.title("Al Akhyar");
        markerlok15.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok15);
        
        LatLng lok16 = new LatLng(-6.153883, 106.755980);
        MarkerOptions markerlok16 = new MarkerOptions();
        markerlok16.position(lok16);
        markerlok16.title("Al Amanah");
        markerlok16.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok16);
        
        LatLng lok17 = new LatLng(-6.170236, 106.839520);
        MarkerOptions markerlok17 = new MarkerOptions();
        markerlok17.position(lok17);
        markerlok17.title("Al Amin");
        markerlok17.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok17);
        
        LatLng lok18 = new LatLng(-6.184582, 106.844589);
        MarkerOptions markerlok18 = new MarkerOptions();
        markerlok18.position(lok18);
        markerlok18.title("Al Furqon");
        markerlok18.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok18);
        
        LatLng lok19 = new LatLng(-6.231720, 106.866988);
        MarkerOptions markerlok19 = new MarkerOptions();
        markerlok19.position(lok19);
        markerlok19.title("Al Hasanah");
        markerlok19.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok19);
        
        LatLng lok20 = new LatLng(-6.222518, 106.855178);
        MarkerOptions markerlok20 = new MarkerOptions();
        markerlok20.position(lok20);
        markerlok20.title("Al Hidayah");
        markerlok20.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok20);
        
        LatLng lok21 = new LatLng(-6.204875, 106.818663);
        MarkerOptions markerlok21 = new MarkerOptions();
        markerlok21.position(lok21);
        markerlok21.title("Al I'tisham");
        markerlok21.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok21);
        
        LatLng lok22 = new LatLng(-6.234989, 106.883360);
        MarkerOptions markerlok22 = new MarkerOptions();
        markerlok22.position(lok22);
        markerlok22.title("Al Ikhwan");
        markerlok22.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok22);
        
        LatLng lok23 = new LatLng(-6.221836, 106.794614);
        MarkerOptions markerlok23 = new MarkerOptions();
        markerlok23.position(lok23);
        markerlok23.title("Al Insan");
        markerlok23.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok23);
        
        LatLng lok24 = new LatLng(-6.258772, 106.860934);
        MarkerOptions markerlok24 = new MarkerOptions();
        markerlok24.position(lok24);
        markerlok24.title("Al Karomah");
        markerlok24.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok24);
        
        LatLng lok25 = new LatLng(-6.249678, 106.842138);
        MarkerOptions markerlok25 = new MarkerOptions();
        markerlok25.position(lok25);
        markerlok25.title("Al Munawar");
        markerlok25.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok25);
        
        LatLng lok26 = new LatLng(-6.249025, 106.922325);
        MarkerOptions markerlok26 = new MarkerOptions();
        markerlok26.position(lok26);
        markerlok26.title("Al Qunniyah");
        markerlok26.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok26);
        
        LatLng lok27 = new LatLng(-6.293104, 106.889591);
        MarkerOptions markerlok27 = new MarkerOptions();
        markerlok27.position(lok27);
        markerlok27.title("An Nida");
        markerlok27.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok27);
        
        LatLng lok28 = new LatLng(-6.189182, 106.807078);
        MarkerOptions markerlok28 = new MarkerOptions();
        markerlok28.position(lok28);
        markerlok28.title("An Nur");
        markerlok28.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok28);
        
        LatLng lok29 = new LatLng(-6.291955, 106.879131);
        MarkerOptions markerlok29 = new MarkerOptions();
        markerlok29.position(lok29);
        markerlok29.title("Ar Rahman");
        markerlok29.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok29);
        
        LatLng lok30 = new LatLng(-6.225068, 106.859896);
        MarkerOptions markerlok30 = new MarkerOptions();
        markerlok30.position(lok30);
        markerlok30.title("At Tahiriyah");
        markerlok30.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok30);
        
        LatLng lok31 = new LatLng(-6.187419, 106.785178);
        MarkerOptions markerlok31 = new MarkerOptions();
        markerlok31.position(lok31);
        markerlok31.title("At Taqwa");
        markerlok31.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok31);
        
        LatLng lok32 = new LatLng(-6.297895, 106.884162);
        MarkerOptions markerlok32 = new MarkerOptions();
        markerlok32.position(lok32);
        markerlok32.title("At Tin");
        markerlok32.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok32);
        
        LatLng lok33 = new LatLng(-6.232013, 106.889551);
        MarkerOptions markerlok33 = new MarkerOptions();
        markerlok33.position(lok33);
        markerlok33.title("Baitul Hakim");
        markerlok33.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok33);
        
        LatLng lok34 = new LatLng(-6.180449, 106.818899);
        MarkerOptions markerlok34 = new MarkerOptions();
        markerlok34.position(lok34);
        markerlok34.title("Baitul Ihsan");
        markerlok34.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok34);
        
        LatLng lok35 = new LatLng(-6.192409, 106.755288);
        MarkerOptions markerlok35 = new MarkerOptions();
        markerlok35.position(lok35);
        markerlok35.title("Baitul Khoir");
        markerlok35.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok35);
        
        LatLng lok36 = new LatLng(-6.170236, 106.839520);
        MarkerOptions markerlok36 = new MarkerOptions();
        markerlok36.position(lok36);
        markerlok36.title("BAITUL MUGHNI");
        markerlok36.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok36);
        
        LatLng lok37 = new LatLng(-6.240207, 106.876953);
        MarkerOptions markerlok37 = new MarkerOptions();
        markerlok37.position(lok37);
        markerlok37.title("Baitul Muhajirin");
        markerlok37.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok37);
        
        LatLng lok38 = new LatLng(-6.236978, 106.895119);
        MarkerOptions markerlok38 = new MarkerOptions();
        markerlok38.position(lok38);
        markerlok38.title("Baitul Rahmah");
        markerlok38.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok38);
        
        LatLng lok39 = new LatLng(-6.237842, 106.885265);
        MarkerOptions markerlok39 = new MarkerOptions();
        markerlok39.position(lok39);
        markerlok39.title("Baitur Rahman");
        markerlok39.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok39);
        
        LatLng lok40 = new LatLng(-6.293947, 106.961751);
        MarkerOptions markerlok40 = new MarkerOptions();
        markerlok40.position(lok40);
        markerlok40.title("BAITUS SALAM");
        markerlok40.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok40);
        
        LatLng lok41 = new LatLng(-6.236978, 106.895119);
        MarkerOptions markerlok41 = new MarkerOptions();
        markerlok41.position(lok41);
        markerlok41.title("Darrus Salam");
        markerlok41.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok41);
        
        LatLng lok42 = new LatLng(-6.169686, 106.830920);
        MarkerOptions markerlok42 = new MarkerOptions();
        markerlok42.position(lok42);
        markerlok42.title("Istiqlal");
        markerlok42.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok42);
        
        LatLng lok43 = new LatLng(-6.202688, 106.851118);
        MarkerOptions markerlok43 = new MarkerOptions();
        markerlok43.position(lok43);
        markerlok43.title("Jami' Matraman");
        markerlok43.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok43);
        
        LatLng lok44 = new LatLng(-6.240130,106.874091);
        MarkerOptions markerlok44 = new MarkerOptions();
        markerlok44.position(lok44);
        markerlok44.title("Jami Al Barokah");
        markerlok44.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok44);
        
        LatLng lok45 = new LatLng(-6.237101,106.879361);
        MarkerOptions markerlok45 = new MarkerOptions();
        markerlok45.position(lok45);
        markerlok45.title("Jami Al Hidayah");
        markerlok45.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok45);
        
        LatLng lok46 = new LatLng(-6.234989,106.883360);
        MarkerOptions markerlok46 = new MarkerOptions();
        markerlok46.position(lok46);
        markerlok46.title("Jami Al Ikhwan");
        markerlok46.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok46);
        
        LatLng lok47 = new LatLng(-6.235317,106.773712);
        MarkerOptions markerlok47 = new MarkerOptions();
        markerlok47.position(lok47);
        markerlok47.title("Jami Al Irsyad");
        markerlok47.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok47);
        
        LatLng lok48 = new LatLng(-6.224878,106.855828);
        MarkerOptions markerlok48 = new MarkerOptions();
        markerlok48.position(lok48);
        markerlok48.title("Jami Al Makmur");
        markerlok48.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok48);
        
        LatLng lok49 = new LatLng(-6.226334,106.891962);
        MarkerOptions markerlok49 = new MarkerOptions();
        markerlok49.position(lok49);
        markerlok49.title("Jami Al Marzuqiyah");
        markerlok49.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok49);
        
        LatLng lok50 = new LatLng(-6.233069,106.773993);
        MarkerOptions markerlok50 = new MarkerOptions();
        markerlok50.position(lok50);
        markerlok50.title("Jami Al Muharam");
        markerlok50.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok50);
        
        LatLng lok51 = new LatLng(-6.319895,106.835534);
        MarkerOptions markerlok51 = new MarkerOptions();
        markerlok51.position(lok51);
        markerlok51.title("Jami Al Sofwa");
        markerlok51.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok51);
        
        LatLng lok52 = new LatLng(-6.180716,106.817324);
        MarkerOptions markerlok52 = new MarkerOptions();
        markerlok52.position(lok52);
        markerlok52.title("Jami Ar Rohah");
        markerlok52.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok52);
        
        LatLng lok53 = new LatLng(-6.239042,106.889704);
        MarkerOptions markerlok53 = new MarkerOptions();
        markerlok53.position(lok53);
        markerlok53.title("Jami Asy Syakirin");
        markerlok53.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok53);
        
        LatLng lok54 = new LatLng(-6.229400,106.895323);
        MarkerOptions markerlok54 = new MarkerOptions();
        markerlok54.position(lok54);
        markerlok54.title("Jami At Taqwa");
        markerlok54.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok54);
        
        LatLng lok55 = new LatLng(-6.130186,106.835378);
        MarkerOptions markerlok55 = new MarkerOptions();
        markerlok55.position(lok55);
        markerlok55.title("Jami Baabusallam");
        markerlok55.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok55);
        
        LatLng lok56 = new LatLng(-6.249041,106.858920);
        MarkerOptions markerlok56= new MarkerOptions();
        markerlok56.position(lok56);
        markerlok56.title("Jami Baitul Khair");
        markerlok56.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok56);
        
        LatLng lok57 = new LatLng(-6.243905,106.853065);
        MarkerOptions markerlok57 = new MarkerOptions();
        markerlok57.position(lok57);
        markerlok57.title("Jami Maulanan Hasanudin");
        markerlok57.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok57);
        
        LatLng lok58 = new LatLng(-6.236978,106.895119);
        MarkerOptions markerlok58 = new MarkerOptions();
        markerlok58.position(lok58);
        markerlok58.title("Jami Nurul Huda");
        markerlok58.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok58);
        
        LatLng lok59 = new LatLng(-6.346265,106.832506);
        MarkerOptions markerlok59 = new MarkerOptions();
        markerlok59.position(lok59);
        markerlok59.title("Jami Nurul Yaqin");
        markerlok59.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok59);
        
        LatLng lok60 = new LatLng(-6.223508,106.831693);
        MarkerOptions markerlok60 = new MarkerOptions();
        markerlok60.position(lok60);
        markerlok60.title("Khusnul Khatimah");
        markerlok60.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok60);
        
        LatLng lok61 = new LatLng(-6.184078,106.830797);
        MarkerOptions markerlok61 = new MarkerOptions();
        markerlok61.position(lok61);
        markerlok61.title("Masjid Bimantara");
        markerlok61.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok61);
        
        LatLng lok62 = new LatLng(-6.183606,106.838023);
        MarkerOptions markerlok62 = new MarkerOptions();
        markerlok62.position(lok62);
        markerlok62.title("Masjid Islamic Center Indonesia");
        markerlok62.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok62);
        
        LatLng lok63 = new LatLng(-6.240207,106.876953);
        MarkerOptions markerlok63 = new MarkerOptions();
        markerlok63.position(lok63);
        markerlok63.title("Masjid Baitul Muhajirin");
        markerlok63.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok63);
        
        LatLng lok64 = new LatLng(-6.231811,106.847628);
        MarkerOptions markerlok64 = new MarkerOptions();
        markerlok64.position(lok64);
        markerlok64.title("MASJID RAYA AL-ITTIHAD");
        markerlok64.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok64);
        
        LatLng lok65 = new LatLng(-6.230939,106.884495);
        MarkerOptions markerlok65 = new MarkerOptions();
        markerlok65.position(lok65);
        markerlok65.title("Masjid Raya Cipinang Muara");
        markerlok65.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok65);
        
        LatLng lok66 = new LatLng(-6.225273,106.854098);
        MarkerOptions markerlok66 = new MarkerOptions();
        markerlok66.position(lok66);
        markerlok66.title("Masjid SMP 115");
        markerlok66.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok66);
        
        LatLng lok67 = new LatLng(-6.211850,106.959243);
        MarkerOptions markerlok67 = new MarkerOptions();
        markerlok67.position(lok67);
        markerlok67.title("Nur Aulia");
        markerlok67.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok67);
        
        LatLng lok68 = new LatLng(-6.218746,106.944496);
        MarkerOptions markerlok68 = new MarkerOptions();
        markerlok68.position(lok68);
        markerlok68.title("Nur Rohman");
        markerlok68.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok68);
        
        LatLng lok69 = new LatLng(-6.236978,106.895119);
        MarkerOptions markerlok69 = new MarkerOptions();
        markerlok69.position(lok69);
        markerlok69.title("Nurul Huda");
        markerlok69.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok69);
        
        LatLng lok70 = new LatLng(-6.294984,106.971117);
        MarkerOptions markerlok70 = new MarkerOptions();
        markerlok70.position(lok70);
        markerlok70.title("Nurul Islam");
        markerlok70.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok70);
        
        LatLng lok71 = new LatLng(-6.235293,106.884785);
        MarkerOptions markerlok71 = new MarkerOptions();
        markerlok71.position(lok71);
        markerlok71.title("Nurul Jamal");
        markerlok71.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok71);
        
        LatLng lok72 = new LatLng(-6.239042,106.889704);
        MarkerOptions markerlok72 = new MarkerOptions();
        markerlok72.position(lok72);
        markerlok72.title("Nurul Yaqin");
        markerlok72.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok72);
        
        LatLng lok73 = new LatLng(-6.191627,106.767679);
        MarkerOptions markerlok73 = new MarkerOptions();
        markerlok73.position(lok73);
        markerlok73.title("Raudhatul Jannah");
        markerlok73.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok73);
        
        LatLng lok74 = new LatLng(-6.243447,106.897297);
        MarkerOptions markerlok74 = new MarkerOptions();
        markerlok74.position(lok74);
        markerlok74.title("Ummul Quro");
        markerlok74.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        myMap.addMarker(markerlok74);
        
       
        
       
        
        
        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        myMap.getUiSettings().setCompassEnabled(true);
        myMap.getUiSettings().setZoomControlsEnabled(true);
        myMap.getUiSettings().setMyLocationButtonEnabled(true);
        myMap.setMyLocationEnabled(true);
        if(namamasjid.getText().toString().equals("Abu Bakar Ash Shidiq")){
        	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok1, 15));}
	    else if(namamasjid.getText().toString().equals("Al akhbar")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok2, 15));}
	    else if(namamasjid.getText().toString().equals("Al Ikhlas")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok3, 15));}
	    else if(namamasjid.getText().toString().equals("AL Husna")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok4, 15));}
	    else if(namamasjid.getText().toString().equals("Al Istiqamah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok5, 15));}
	    else if(namamasjid.getText().toString().equals("Al Huda Muhammadiyah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok6, 15));}
	    else if(namamasjid.getText().toString().equals("Al Bahri")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok7, 15));}
	    else if(namamasjid.getText().toString().equals("AL Ittihad")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok8, 15));}
	    else if(namamasjid.getText().toString().equals("AL Ihsaniyah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok9, 15));}
	    else if(namamasjid.getText().toString().equals("Al Barkah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok10, 15));}
	    else if(namamasjid.getText().toString().equals("Al Abidin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok11, 15));}
	    else if(namamasjid.getText().toString().equals("Al Furqan")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok12, 15));}
	    else if(namamasjid.getText().toString().equals("Al Maghfur")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok13, 15));}
	    else if(namamasjid.getText().toString().equals("Al Huriyah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok14, 15));}
	    else if(namamasjid.getText().toString().equals("Al Akhyar")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok15, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Amanah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok16, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Amin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok17, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Furqon")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok18, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Hasanah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok19, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Hidayah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok20, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al I'tisham")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok21, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Ikhwan")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok22, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Insan")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok23, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Karomah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok24, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Munawar")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok25, 15));}
      
	    else if(namamasjid.getText().toString().equals("Al Qunniyah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok26, 15));}
      
	    else if(namamasjid.getText().toString().equals("An Nida")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok27, 15));}
      
	    else if(namamasjid.getText().toString().equals("An Nur")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok28, 15));}
      
	    else if(namamasjid.getText().toString().equals("Ar Rahman")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok29, 15));}
      
	    else if(namamasjid.getText().toString().equals("At Tahiriyah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok30, 15));}
      
	    else if(namamasjid.getText().toString().equals("At Taqwa")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok31, 15));}
      
	    else if(namamasjid.getText().toString().equals("At Tin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok32, 15));}
      
	    else if(namamasjid.getText().toString().equals("baitul Hakim")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok33, 15));}
      
	    else if(namamasjid.getText().toString().equals("Baitul Ihsan")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok34, 15));}
      
	    else if(namamasjid.getText().toString().equals("Baitul Khoir")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok35, 15));}
      
	    else if(namamasjid.getText().toString().equals("BAITUL MUGHNI")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok36, 15));}
      
	    else if(namamasjid.getText().toString().equals("Baitul Muhajirin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok37, 15));}
      
	    else if(namamasjid.getText().toString().equals("Baitul Rahmah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok38, 15));}
      
	    else if(namamasjid.getText().toString().equals("Baitur Rahman")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok39, 15));}
      
	    else if(namamasjid.getText().toString().equals("BAITUS SALAM")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok40, 15));}
      
	    else if(namamasjid.getText().toString().equals("Darrus Salam")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok41, 15));}
      
	    else if(namamasjid.getText().toString().equals("Istiqlal")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok42, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami' Matraman")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok43, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Barokah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok44, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Hidayah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok45, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Ikhwan")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok46, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Irsyad")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok47, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Makmur")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok48, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Marzuqiyah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok49, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Muharam")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok50, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Al Sofwa")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok51, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Ar Rohah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok52, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Asy Syakirin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok53, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami At Taqwa")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok54, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Baabusallam")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok55, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Baitul Khair")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok56, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Maulanan Hasanudin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok57, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Nurul Huda")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok58, 15));}
      
	    else if(namamasjid.getText().toString().equals("Jami Nurul Yaqin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok59, 15));}
      
	    else if(namamasjid.getText().toString().equals("Khusnul Khatimah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok60, 15));}
      
	    else if(namamasjid.getText().toString().equals("Masjid Bimantara")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok61, 15));}
      
	    else if(namamasjid.getText().toString().equals("Masjid Islamic Center Indonesia")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok62, 15));}
      
	    else if(namamasjid.getText().toString().equals("Masjid Baitul Muhajirin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok63, 15));}
      
	    else if(namamasjid.getText().toString().equals("MASJID RAYA AL-ITTIHAD")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok64, 15));}
      
	    else if(namamasjid.getText().toString().equals("Masjid Raya Cipinang Muara")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok65, 15));}
      
	    else if(namamasjid.getText().toString().equals("Masjid SMP 115")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok66, 15));}
      
	    else if(namamasjid.getText().toString().equals("Nur Aulia")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok67, 15));}
      
	    else if(namamasjid.getText().toString().equals("Nur Rohman")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok68, 15));}
      
	    else if(namamasjid.getText().toString().equals("Nurull Huda")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok69, 15));}
      
	    else if(namamasjid.getText().toString().equals("Nurul Islam")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok70, 15));}
      
	    else if(namamasjid.getText().toString().equals("Nurul Jamal")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok71, 15));}
      
	    else if(namamasjid.getText().toString().equals("Nurul Yaqin")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok72, 15));}
      
	    else if(namamasjid.getText().toString().equals("Raudhatul Jannah")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok73, 15));}
      
	    else if(namamasjid.getText().toString().equals("Ummul Quro'")){
	    	  myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lok74, 15));}
      
	   
      
      
      
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