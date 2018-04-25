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

public class MidEastAntrimTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    /*Setting up string array, spinner object and google map object*/
    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid_east_antrim_tourist_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_MidEastAntrimTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.MEATIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
        /*Google Map Setup*/
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng carrickferguscastle = new LatLng(54.7137146, -5.8085127);
        LatLng larnemuseumartscentre = new LatLng(54.8524854, -5.8235698);
        LatLng gobbinscliffpath = new LatLng(54.8005386, -5.6963273);
        LatLng merrillmorrow = new LatLng(54.9811543, -5.9883659);

        mMap.addMarker(new MarkerOptions().position(carrickferguscastle).title("Carrickfergus Castle"));
        mMap.addMarker(new MarkerOptions().position(larnemuseumartscentre).title("Larne Museum & Arts Centre"));
        mMap.addMarker(new MarkerOptions().position(gobbinscliffpath).title("Gobbins Cliff Path"));
        mMap.addMarker(new MarkerOptions().position(merrillmorrow).title("Merrill Morrow"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(carrickferguscastle));
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
                imageElement = (ImageView) findViewById(R.id.imgView_MEATIM);
                imageElement.setImageResource(R.drawable.carrickferguscastle);

                textElement = (TextView) findViewById(R.id.txtMEATSDescription);
                textElement.setText(R.string.MEATIM_Spinner_description_CarrickfergusCastle);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02893351273"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.midandeastantrim.gov.uk/tourism/things-to-do/carrickfergus-castle"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMEATSContact);
                textElement.setText(R.string.MEATIM_Spinner_contact_CarrickfergusCastle);

                textElement = (TextView) findViewById(R.id.txtMEATSAdditional);
                textElement.setText(R.string.MEATIM_Spinner_additional_CarrickfergusCastle);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_MEATIM);
                imageElement.setImageResource(R.drawable.larnemuseumartscentre);

                textElement = (TextView) findViewById(R.id.txtMEATSDescription);
                textElement.setText(R.string.MEATIM_Spinner_description_LarneMuseumandArtsCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02828262443"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.midandeastantrim.gov.uk/things-to-do/museums-arts/larne-museum-and-arts-centre"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMEATSContact);
                textElement.setText(R.string.MEATIM_Spinner_contact_LarneMuseumandArtsCentre);

                textElement = (TextView) findViewById(R.id.txtMEATSAdditional);
                textElement.setText(R.string.MEATIM_Spinner_additional_LarneMuseumandArtsCentre);
                break;
            case 2:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_MEATIM);
                imageElement.setImageResource(R.drawable.gobbinscliffpath);

                textElement = (TextView) findViewById(R.id.txtMEATSDescription);
                textElement.setText(R.string.MEATIM_Spinner_description_TheGobbins);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02893372318"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.thegobbinscliffpath.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMEATSContact);
                textElement.setText(R.string.MEATIM_Spinner_contact_TheGobbins);

                textElement = (TextView) findViewById(R.id.txtMEATSAdditional);
                textElement.setText(R.string.MEATIM_Spinner_additional_TheGobbins);
                break;
            case 3:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_MEATIM);
                imageElement.setImageResource(R.drawable.merrillmorrow);

                textElement = (TextView) findViewById(R.id.txtMEATSDescription);
                textElement.setText(R.string.MEATIM_Spinner_description_CarnloughBeach);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:03001245000"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.midandeastantrim.gov.uk/tourism/things-to-do/beaches-coastline/carnlough-beach"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtMEATSContact);
                textElement.setText(R.string.MEATIM_Spinner_contact_CarnloughBeach);

                textElement = (TextView) findViewById(R.id.txtMEATSAdditional);
                textElement.setText(R.string.MEATIM_Spinner_additional_CarnloughBeach);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        TextView textElement;
        ImageView imageElement;
        Button button;

        imageElement = (ImageView) findViewById(R.id.imgView_MEATIM);
        imageElement.setImageResource(R.drawable.carrickferguscastle);

        textElement = (TextView) findViewById(R.id.txtMEATSDescription);
        textElement.setText(R.string.MEATIM_Spinner_description_CarrickfergusCastle);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02893351273"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button_web);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.midandeastantrim.gov.uk/tourism/things-to-do/carrickfergus-castle"));
                startActivity(myWebLink);
            }
        });

        textElement = (TextView) findViewById(R.id.txtMEATSContact);
        textElement.setText(R.string.MEATIM_Spinner_contact_CarrickfergusCastle);

        textElement = (TextView) findViewById(R.id.txtMEATSAdditional);
        textElement.setText(R.string.MEATIM_Spinner_additional_CarrickfergusCastle);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
}
