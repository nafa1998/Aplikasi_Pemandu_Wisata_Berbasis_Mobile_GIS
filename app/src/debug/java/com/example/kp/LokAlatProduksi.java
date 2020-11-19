package com.example.kp;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class LokAlatProduksi extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lok_alat_produksi);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        float zoomLevel = 18.0f;

        LatLng pemerahan = new LatLng(-7.8328, 110.34593);
        mMap.addMarker(new MarkerOptions().position(pemerahan).title("Pemerahan Nira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pemerahan, zoomLevel));

        LatLng pemurnian = new LatLng(-7.83239, 110.34595);
        mMap.addMarker(new MarkerOptions().position(pemurnian).title("Pemurnian Nira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pemurnian, zoomLevel));

        LatLng penguapan = new LatLng(-7.8323, 110.34575);
        mMap.addMarker(new MarkerOptions().position(penguapan).title("Penguapan Nira"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(penguapan, zoomLevel));

        LatLng puteran = new LatLng(-7.83221, 110.34504);
        mMap.addMarker(new MarkerOptions().position(puteran).title("Puteran Gula"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(puteran, zoomLevel));

        LatLng gudang = new LatLng(-7.83205, 110.34472);
        mMap.addMarker(new MarkerOptions().position(gudang).title("Gudang Gula"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gudang, zoomLevel));

        LatLng kristalisasi = new LatLng(-7.83216, 110.3454);
        mMap.addMarker(new MarkerOptions().position(kristalisasi).title("Kristalisasi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kristalisasi, zoomLevel));
    }
}
