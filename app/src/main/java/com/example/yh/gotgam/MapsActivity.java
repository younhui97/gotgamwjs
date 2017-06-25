package com.example.yh.gotgam;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng seoul = new LatLng( 37.56, 126.97 );
        mMap.addMarker( new MarkerOptions().position(seoul).title( "Marker in Seoul" ) );
        mMap.moveCamera( CameraUpdateFactory.newLatLng(seoul) );
        /*ArrayList<String> gps = getIntent().getStringArrayListExtra("gps");
        String s[]=(gps.get(0).split("/"));
        boolean[] name = getIntent().getBooleanArrayExtra("name");
        LatLng des= new LatLng(Double.parseDouble(s[1]),Double.parseDouble(s[2]));
        mMap.addMarker(new MarkerOptions().position(des).title("arrival location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(des,20));*/

    }


}
