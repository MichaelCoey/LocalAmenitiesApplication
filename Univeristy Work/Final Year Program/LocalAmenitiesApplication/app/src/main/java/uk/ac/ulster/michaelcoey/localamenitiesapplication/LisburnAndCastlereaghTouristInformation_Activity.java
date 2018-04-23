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

public class LisburnAndCastlereaghTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisburn_and_castlereagh_tourist_information);

        spinner = (Spinner) findViewById(R.id.spn_LisburnCastlereaghTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.LCTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng dundonaldicebowl = new LatLng(54.5870439, -5.8203721);
        LatLng islandartscentre = new LatLng(54.5117025, -6.0373306);
        LatLng irishlinencentrelisburnmuseum = new LatLng(54.5111258, -6.0455648);
        LatLng laganvalleyislandconferencecentre = new LatLng(54.5116391, -6.0373866);

        mMap.addMarker(new MarkerOptions().position(dundonaldicebowl).title("Dundonald Ice Bowl"));
        mMap.addMarker(new MarkerOptions().position(islandartscentre).title("Island Arts Centre"));
        mMap.addMarker(new MarkerOptions().position(irishlinencentrelisburnmuseum).title("Irish Linen Centre Lisburn Museum"));
        mMap.addMarker(new MarkerOptions().position(laganvalleyislandconferencecentre).title("Lagan Valley Island Conference Centre"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dundonaldicebowl));
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
                imageElement = (ImageView) findViewById(R.id.imgView_LCTIM);
                imageElement.setImageResource(R.drawable.dundonaldicebowl);

                textElement = (TextView) findViewById(R.id.txtLCTSDescription);
                textElement.setText(R.string.LCTIM_Spinner_description_DundonaldIceBowl);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02890809100"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.theicebowl.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtLCTSContact);
                textElement.setText(R.string.LCTIM_Spinner_contact_DundonaldIceBowl);

                textElement = (TextView) findViewById(R.id.txtLCTSAdditional);
                textElement.setText(R.string.LCTIM_Spinner_additional_DundonaldIceBowl);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_LCTIM);
                imageElement.setImageResource(R.drawable.islandartscentre);

                textElement = (TextView) findViewById(R.id.txtLCTSDescription);
                textElement.setText(R.string.LCTIM_Spinner_description_IslandArtsCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02892509509"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.islandartscentre.com/whatson/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtLCTSContact);
                textElement.setText(R.string.LCTIM_Spinner_contact_IslandArtsCentre);

                textElement = (TextView) findViewById(R.id.txtLCTSAdditional);
                textElement.setText(R.string.LCTIM_Spinner_additional_IslandArtsCentre);
                break;
            case 2:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_LCTIM);
                imageElement.setImageResource(R.drawable.irishlinencentrelisburnmuseum);

                textElement = (TextView) findViewById(R.id.txtLCTSDescription);
                textElement.setText(R.string.LCTIM_Spinner_description_IrishLinenCentreandLisburnMuseum);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02892663377"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.lisburnmuseum.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtLCTSContact);
                textElement.setText(R.string.LCTIM_Spinner_contact_IrishLinenCentreandLisburnMuseum);

                textElement = (TextView) findViewById(R.id.txtLCTSAdditional);
                textElement.setText(R.string.LCTIM_Spinner_additional_IrishLinenCentreandLisburnMuseum);
                break;
            case 3:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_LCTIM);
                imageElement.setImageResource(R.drawable.laganvalleyislandconferencecentre);

                textElement = (TextView) findViewById(R.id.txtLCTSDescription);
                textElement.setText(R.string.LCTIM_Spinner_description_LaganValleyIsland);


                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02892509292"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.laganvalleyisland.co.uk/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtLCTSContact);
                textElement.setText(R.string.LCTIM_Spinner_contact_LaganValleyIsland);

                textElement = (TextView) findViewById(R.id.txtLCTSAdditional);
                textElement.setText(R.string.LCTIM_Spinner_additional_LaganValleyIsland);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
