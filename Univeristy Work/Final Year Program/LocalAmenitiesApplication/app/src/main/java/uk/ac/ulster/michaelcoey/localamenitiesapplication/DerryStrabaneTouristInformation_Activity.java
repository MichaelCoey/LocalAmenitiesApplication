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

public class DerryStrabaneTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    /*Setting up string array, spinner object and google map object*/
    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derry_strabane_tourist_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_DerryStrabaneTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.DSTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    /*Google Map Setup*/
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng alleyartsandconferencecentre = new LatLng(54.8276698, -7.466448);
        LatLng guildhallfountains = new LatLng(54.9976005, -7.32135);
        LatLng towermuseum = new LatLng(54.9973774, -7.3229683);
        LatLng thefoylemaritimefestival = new LatLng(54.9365978, -7.4377655);

        mMap.addMarker(new MarkerOptions().position(alleyartsandconferencecentre).title("Alley Arts and Conference Centre"));
        mMap.addMarker(new MarkerOptions().position(guildhallfountains).title("Guildhall Fountains"));
        mMap.addMarker(new MarkerOptions().position(towermuseum).title("Tower Museum"));
        mMap.addMarker(new MarkerOptions().position(thefoylemaritimefestival).title("The Foyle Maritime Festival"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alleyartsandconferencecentre));
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
                imageElement = (ImageView) findViewById(R.id.imgView_DSTIM);
                imageElement.setImageResource(R.drawable.alleyartsandconferencecentre);

                textElement = (TextView) findViewById(R.id.txtDSTSDescription);
                textElement.setText(R.string.DSTIM_Spinner_description_AlleyArtsandConferenceCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02871384444"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.alley-theatre.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtDSTSContact);
                textElement.setText(R.string.DSTIM_Spinner_contact_AlleyArtsandConferenceCentre);

                textElement = (TextView) findViewById(R.id.txtDSTSAdditional);
                textElement.setText(R.string.DSTIM_Spinner_additional_AlleyArtsandConferenceCentre);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_DSTIM);
                imageElement.setImageResource(R.drawable.guildhallfountains);

                textElement = (TextView) findViewById(R.id.txtDSTSDescription);
                textElement.setText(R.string.DSTIM_Spinner_description_Guildhall);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02871376510"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://discovernorthernireland.com/The-Guildhall-Londonderry-Derry-P3062/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtDSTSContact);
                textElement.setText(R.string.DSTIM_Spinner_contact_Guildhall);

                textElement = (TextView) findViewById(R.id.txtDSTSAdditional);
                textElement.setText(R.string.DSTIM_Spinner_additional_Guildhall);
                break;
            case 2:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_DSTIM);
                imageElement.setImageResource(R.drawable.towermuseum);

                textElement = (TextView) findViewById(R.id.txtDSTSDescription);
                textElement.setText(R.string.DSTIM_Spinner_description_TowerMuseum);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02871372411"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.derrystrabane.com/towermuseum"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtDSTSContact);
                textElement.setText(R.string.DSTIM_Spinner_contact_TowerMuseum);

                textElement = (TextView) findViewById(R.id.txtDSTSAdditional);
                textElement.setText(R.string.DSTIM_Spinner_additional_TowerMuseum);
                break;
            case 3:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_DSTIM);
                imageElement.setImageResource(R.drawable.thefoylemaritimefestival);

                textElement = (TextView) findViewById(R.id.txtDSTSDescription);
                textElement.setText(R.string.DSTIM_Spinner_description_TheFoyleMaritimeFestival);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02871253253"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.foylemaritimefestival.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtDSTSContact);
                textElement.setText(R.string.DSTIM_Spinner_contact_TheFoyleMaritimeFestival);

                textElement = (TextView) findViewById(R.id.txtDSTSAdditional);
                textElement.setText(R.string.DSTIM_Spinner_additional_TheFoyleMaritimeFestival);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        TextView textElement;
        ImageView imageElement;
        Button button;

        imageElement = (ImageView) findViewById(R.id.imgView_DSTIM);
        imageElement.setImageResource(R.drawable.alleyartsandconferencecentre);

        textElement = (TextView) findViewById(R.id.txtDSTSDescription);
        textElement.setText(R.string.DSTIM_Spinner_description_AlleyArtsandConferenceCentre);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02871384444"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button_web);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.alley-theatre.com/"));
                startActivity(myWebLink);
            }
        });

        textElement = (TextView) findViewById(R.id.txtDSTSContact);
        textElement.setText(R.string.DSTIM_Spinner_contact_AlleyArtsandConferenceCentre);

        textElement = (TextView) findViewById(R.id.txtDSTSAdditional);
        textElement.setText(R.string.DSTIM_Spinner_additional_AlleyArtsandConferenceCentre);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }
}
