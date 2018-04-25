package uk.ac.ulster.michaelcoey.localamenitiesapplication;

/*Needed Imports For Functionality*/
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

public class FermanaghOmaghTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    /*Setting up string array, spinner object and google map object*/
    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fermanagh_omagh_tourist_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_FermanaghOmaghTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.FOTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    /*Google Map Setup*/
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng enniskillencastle = new LatLng(54.3462355, -7.6466085);
        LatLng struleartscentre = new LatLng(54.600791, -7.3054164);
        LatLng ardhowentheatre = new LatLng(54.337314, -7.6284977);
        LatLng marblearch = new LatLng(54.258183, -7.8156064);

        mMap.addMarker(new MarkerOptions().position(enniskillencastle).title("Enniskillen Castle"));
        mMap.addMarker(new MarkerOptions().position(struleartscentre).title("Strule Arts Centre"));
        mMap.addMarker(new MarkerOptions().position(ardhowentheatre).title("Ardhowen Theatre"));
        mMap.addMarker(new MarkerOptions().position(marblearch).title("Marble Arch"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(enniskillencastle));
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
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_FOTIM);
                imageElement.setImageResource(R.drawable.enniskillencastle);

                textElement = (TextView) findViewById(R.id.txtFOTSDescription);
                textElement.setText(R.string.FOTIM_Spinner_description_EnniskillenCastleMuseums);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02866325000"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.enniskillencastle.co.uk/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtFOTSContact);
                textElement.setText(R.string.FOTIM_Spinner_contact_EnniskillenCastleMuseums);

                textElement = (TextView) findViewById(R.id.txtFOTSAdditional);
                textElement.setText(R.string.FOTIM_Spinner_additional_EnniskillenCastleMuseums);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_FOTIM);
                imageElement.setImageResource(R.drawable.struleartscentre);

                textElement = (TextView) findViewById(R.id.txtFOTSDescription);
                textElement.setText(R.string.FOTIM_Spinner_description_StruleArtsCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02882247831"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://struleartscentre.co.uk/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtFOTSContact);
                textElement.setText(R.string.FOTIM_Spinner_contact_StruleArtsCentre);

                textElement = (TextView) findViewById(R.id.txtFOTSAdditional);
                textElement.setText(R.string.FOTIM_Spinner_additional_StruleArtsCentre);
                break;
            case 2:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_FOTIM);
                imageElement.setImageResource(R.drawable.ardhowentheatre);

                textElement = (TextView) findViewById(R.id.txtFOTSDescription);
                textElement.setText(R.string.FOTIM_Spinner_description_TheArdhowen);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02866325440"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://ardhowen.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtFOTSContact);
                textElement.setText(R.string.FOTIM_Spinner_contact_TheArdhowen);

                textElement = (TextView) findViewById(R.id.txtFOTSAdditional);
                textElement.setText(R.string.FOTIM_Spinner_additional_TheArdhowen);
                break;
            case 3:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_FOTIM);
                imageElement.setImageResource(R.drawable.marblearch);

                textElement = (TextView) findViewById(R.id.txtFOTSDescription);
                textElement.setText(R.string.FOTIM_Spinner_description_MarbleArchCavesGlobalGeopark);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02866348855"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.marblearchcavesgeopark.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtFOTSContact);
                textElement.setText(R.string.FOTIM_Spinner_contact_MarbleArchCavesGlobalGeopark);

                textElement = (TextView) findViewById(R.id.txtFOTSAdditional);
                textElement.setText(R.string.FOTIM_Spinner_additional_MarbleArchCavesGlobalGeopark);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        TextView textElement;
        ImageView imageElement;
        Button button;

        imageElement = (ImageView) findViewById(R.id.imgView_FOTIM);
        imageElement.setImageResource(R.drawable.enniskillencastle);

        textElement = (TextView) findViewById(R.id.txtFOTSDescription);
        textElement.setText(R.string.FOTIM_Spinner_description_EnniskillenCastleMuseums);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02866325000"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button_web);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.enniskillencastle.co.uk/"));
                startActivity(myWebLink);
            }
        });

        textElement = (TextView) findViewById(R.id.txtFOTSContact);
        textElement.setText(R.string.FOTIM_Spinner_contact_EnniskillenCastleMuseums);

        textElement = (TextView) findViewById(R.id.txtFOTSAdditional);
        textElement.setText(R.string.FOTIM_Spinner_additional_EnniskillenCastleMuseums);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
}
