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

public class NewryMourneDownTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newry_mourne_down_tourist_information);

        spinner = (Spinner) findViewById(R.id.spn_NewryMourneDownTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.NMDTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng newrymournemuseum = new LatLng(54.173021, -6.3381077);
        LatLng magherachurchandroundtower = new LatLng(53.4420033, -7.8086258);
        LatLng fewilliams = new LatLng(54.3309365, -6.2878114);
        LatLng dundrumcastle = new LatLng(554.2619321, -5.8471467);

        mMap.addMarker(new MarkerOptions().position(newrymournemuseum).title("Newry Mourne Museum"));
        mMap.addMarker(new MarkerOptions().position(magherachurchandroundtower).title("Maghera Church and Round Tower"));
        mMap.addMarker(new MarkerOptions().position(fewilliams).title("FE Williams"));
        mMap.addMarker(new MarkerOptions().position(dundrumcastle).title("Dundrum Castle"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(newrymournemuseum));
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
                imageElement = (ImageView) findViewById(R.id.imgView_NMDTIM);
                imageElement.setImageResource(R.drawable.newrymournemuseum);

                textElement = (TextView) findViewById(R.id.txtNMDTSDescription);
                textElement.setText(R.string.NMDTIM_Spinner_description_NewryandMourneMuseum);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02830313182"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.bagenalscastle.com/project/index.asp"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtNMDTSContact);
                textElement.setText(R.string.NMDTIM_Spinner_contact_NewryandMourneMuseum);

                textElement = (TextView) findViewById(R.id.txtNMDTSAdditional);
                textElement.setText(R.string.NMDTIM_Spinner_additional_NewryandMourneMuseum);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_NMDTIM);
                imageElement.setImageResource(R.drawable.magherachurchandroundtower);

                textElement = (TextView) findViewById(R.id.txtNMDTSDescription);
                textElement.setText(R.string.NMDTIM_Spinner_description_MagheraChurchAndRoundTower);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02890823207"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.megalithicireland.com/Maghera%20Round%20Tower.html"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtNMDTSContact);
                textElement.setText(R.string.NMDTIM_Spinner_contact_MagheraChurchAndRoundTower);

                textElement = (TextView) findViewById(R.id.txtNMDTSAdditional);
                textElement.setText(R.string.NMDTIM_Spinner_additional_MagheraChurchAndRoundTower);
                break;
            case 2:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_NMDTIM);
                imageElement.setImageResource(R.drawable.fewilliams);

                textElement = (TextView) findViewById(R.id.txtNMDTSDescription);
                textElement.setText(R.string.NMDTIM_Spinner_description_FEMcWilliamGalleryandStudio);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02840623322"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.femcwilliam.com/Home.aspx"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtNMDTSContact);
                textElement.setText(R.string.NMDTIM_Spinner_contact_FEMcWilliamGalleryandStudio);

                textElement = (TextView) findViewById(R.id.txtNMDTSAdditional);
                textElement.setText(R.string.NMDTIM_Spinner_additional_FEMcWilliamGalleryandStudio);
                break;
            case 3:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_NMDTIM);
                imageElement.setImageResource(R.drawable.dundrumcastle);

                textElement = (TextView) findViewById(R.id.txtNMDTSDescription);
                textElement.setText(R.string.NMDTIM_Spinner_description_DundrumHeritageTrail);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02843722222"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.downdc.gov.uk/Leisure---Culture/Tourism/Heritage/Dundrum,-Killough,-Killyleagh.aspx"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtNMDTSContact);
                textElement.setText(R.string.NMDTIM_Spinner_contact_DundrumHeritageTrail);

                textElement = (TextView) findViewById(R.id.txtNMDTSAdditional);
                textElement.setText(R.string.NMDTIM_Spinner_additional_DundrumHeritageTrail);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
