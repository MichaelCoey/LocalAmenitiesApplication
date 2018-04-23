package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MidUlsterTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_ulster_tourist_information);

        spinner = (Spinner) findViewById(R.id.spn_MidUlsterTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.MUTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng burnavonartsculturalcentre = new LatLng(54.647019, -6.7486836);
        LatLng heaneyhomeplace = new LatLng(54.807533, -6.5236677);
        LatLng loughneagh = new LatLng(54.6202042, -6.5596042);
        LatLng cookstownleisurecentre = new LatLng(54.641308, -6.7426277);

        mMap.addMarker(new MarkerOptions().position(burnavonartsculturalcentre).title("Burnavon Arts Cultural Centre"));
        mMap.addMarker(new MarkerOptions().position(heaneyhomeplace).title("Heaney Homeplace"));
        mMap.addMarker(new MarkerOptions().position(loughneagh).title("Lough Neagh"));
        mMap.addMarker(new MarkerOptions().position(cookstownleisurecentre).title("Cookstown Leisure Centre"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(burnavonartsculturalcentre));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView textElement;
        ImageView imageElement;
        Button button;

        switch (position)
        {
            case 0:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_MUTIM);
                imageElement.setImageResource(R.drawable.burnavonartsculturalcentre);

                textElement = (TextView) findViewById(R.id.txtMUTSDescription);
                textElement.setText(R.string.MUTIM_Spinner_description_BurnavonArtsCulturalCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02886769949"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.burnavon.com"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMUTSContact);
                textElement.setText(R.string.MUTIM_Spinner_contact_BurnavonArtsCulturalCentre);

                textElement = (TextView) findViewById(R.id.txtMUTSAdditional);
                textElement.setText(R.string.MUTIM_Spinner_additional_BurnavonArtsCulturalCentre);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_MUTIM);
                imageElement.setImageResource(R.drawable.heaneyhomeplace);

                textElement = (TextView) findViewById(R.id.txtMUTSDescription);
                textElement.setText(R.string.MUTIM_Spinner_description_SeamusHeaneyHomePlace);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02879387444"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.seamusheaneyhome.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMUTSContact);
                textElement.setText(R.string.MUTIM_Spinner_contact_SeamusHeaneyHomePlace);

                textElement = (TextView) findViewById(R.id.txtMUTSAdditional);
                textElement.setText(R.string.MUTIM_Spinner_additional_SeamusHeaneyHomePlace);
                break;
            case 2:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_MUTIM);
                imageElement.setImageResource(R.drawable.loughneagh);

                textElement = (TextView) findViewById(R.id.txtMUTSDescription);
                textElement.setText(R.string.MUTIM_Spinner_description_LoughNeagh);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02879419741"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.discoverloughneagh.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMUTSContact);
                textElement.setText(R.string.MUTIM_Spinner_contact_LoughNeagh);

                textElement = (TextView) findViewById(R.id.txtMUTSAdditional);
                textElement.setText(R.string.MUTIM_Spinner_additional_LoughNeagh);
                break;
            case 3:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_MUTIM);
                imageElement.setImageResource(R.drawable.cookstownleisurecentre);

                textElement = (TextView) findViewById(R.id.txtMUTSDescription);
                textElement.setText(R.string.MUTIM_Spinner_description_CookstownLeisureCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02886763853"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.midulstercouncil.org/cookstownleisurecentre"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMUTSContact);
                textElement.setText(R.string.MUTIM_Spinner_contact_CookstownLeisureCentre);

                textElement = (TextView) findViewById(R.id.txtMUTSAdditional);
                textElement.setText(R.string.MUTIM_Spinner_additional_CookstownLeisureCentre);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
