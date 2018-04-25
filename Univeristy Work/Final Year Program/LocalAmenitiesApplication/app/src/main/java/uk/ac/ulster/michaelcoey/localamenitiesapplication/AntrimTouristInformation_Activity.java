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

public class AntrimTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    /*Setting up string array, spinner object and google map object*/
    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrim_tourist_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_AntrimTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ANTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    /*Preparing Google Map and adding markers to the map*/
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng antrimcastlegardensclotworthyhouse = new LatLng(54.7176967, -6.2286809);
        LatLng ballyrobertcottagegarden = new LatLng(54.7245489, -6.0090493);
        LatLng ramsisland = new LatLng(54.5888435, -6.3062382);
        LatLng shanescastle = new LatLng(54.7285777, -6.2792028);

        mMap.addMarker(new MarkerOptions().position(antrimcastlegardensclotworthyhouse).title("Antrim Castle Gardens Clotworthy House"));
        mMap.addMarker(new MarkerOptions().position(ballyrobertcottagegarden).title("Ballyrobert Cottage Garden"));
        mMap.addMarker(new MarkerOptions().position(ramsisland).title("Rams Island"));
        mMap.addMarker(new MarkerOptions().position(shanescastle).title("Shanes Castle"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(antrimcastlegardensclotworthyhouse));
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
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.antrimcastlegardensclotworthyhouse);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_AntrimCastleGardensClotworthyHouse);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02894481338"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.antrimandnewtownabbey.gov.uk/Things-To-Do/Places-to-Visit/Antrim-Castle-Gardens-Clotworthy-House"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_AntrimCastleGardensClotworthyHouse);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_AntrimCastleGardensClotworthyHouse);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.ballyrobertcottagegarden);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_BallyrobertGardens);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02893322952"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.ballyrobertgardens.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_BallyrobertGardens);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_BallyrobertGardens);
                break;
            case 2:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.ramsisland);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_RamsIsland);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:07715368050"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://www.ramsisland.org/"));
                        startActivity(intent);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_RamsIsland);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_RamsIsland);
                break;
            case 3:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.shanescastle);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_ShanesCastle);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02894428216"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://www.shanescastle.com/"));
                        startActivity(intent);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_ShanesCastle);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_ShanesCastle);
                break;
        }

    }
    
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        TextView textElement;
        ImageView imageElement;
        Button button;

        //Image from Discover NI
        //Content from Discover NI & Council Website
        imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
        imageElement.setImageResource(R.drawable.antrimcastlegardensclotworthyhouse);

        textElement = (TextView) findViewById(R.id.txtANTSDescription);
        textElement.setText(R.string.ANTIM_Spinner_description_AntrimCastleGardensClotworthyHouse);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02894481338"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button_web);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.antrimandnewtownabbey.gov.uk/Things-To-Do/Places-to-Visit/Antrim-Castle-Gardens-Clotworthy-House"));
                startActivity(myWebLink);
            }
        });

        textElement = (TextView) findViewById(R.id.txtANTSContact);
        textElement.setText(R.string.ANTIM_Spinner_contact_AntrimCastleGardensClotworthyHouse);

        textElement = (TextView) findViewById(R.id.txtANTSAdditional);
        textElement.setText(R.string.ANTIM_Spinner_additional_AntrimCastleGardensClotworthyHouse);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }
}
