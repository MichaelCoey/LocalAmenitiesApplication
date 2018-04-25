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

public class ArmaghBanbridgeCraigavonTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    /*Setting up string array, spinner object and google map object*/
    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armagh_banbridge_craigavon_tourist_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_ArmaghBanbridgeCraigavonTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ABCTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng ArmaghPlanetarium = new LatLng(54.352094, -6.6507027);
        LatLng FEWilliamsGallery = new LatLng(54.3309365, -6.2878114);
        LatLng ArmaghCountyMuseum = new LatLng(54.34929, -6.6515747);
        LatLng NavanCentre = new LatLng(54.3437024, -6.7043453);

        mMap.addMarker(new MarkerOptions().position(ArmaghPlanetarium).title("Armagh Planetarium"));
        mMap.addMarker(new MarkerOptions().position(FEWilliamsGallery).title("F.E Williams Gallery"));
        mMap.addMarker(new MarkerOptions().position(ArmaghCountyMuseum).title("Armagh County Museum"));
        mMap.addMarker(new MarkerOptions().position(NavanCentre).title("Navan Centre"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ArmaghPlanetarium));
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
                imageElement = (ImageView) findViewById(R.id.imgView_ABCTIM);
                imageElement.setImageResource(R.drawable.armaghplanetarium);

                textElement = (TextView) findViewById(R.id.txtABCTSDescription);
                textElement.setText(R.string.ABCTIM_Spinner_description_ArmaghPlanetariumObservatory);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02837523689"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.armaghplanet.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtABCTSContact);
                textElement.setText(R.string.ABCTIM_Spinner_contact_ArmaghPlanetariumObservatory);

                textElement = (TextView) findViewById(R.id.txtABCTSAdditional);
                textElement.setText(R.string.ABCTIM_Spinner_additional_ArmaghPlanetariumObservatory);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);

                break;
            case 1:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_ABCTIM);
                imageElement.setImageResource(R.drawable.fewilliamsgallery);

                textElement = (TextView) findViewById(R.id.txtABCTSDescription);
                textElement.setText(R.string.ABCTIM_Spinner_description_F_E_McWilliamGallery);

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

                textElement = (TextView) findViewById(R.id.txtABCTSContact);
                textElement.setText(R.string.ABCTIM_Spinner_contact_F_E_McWilliamGallery);

                textElement = (TextView) findViewById(R.id.txtABCTSAdditional);
                textElement.setText(R.string.ABCTIM_Spinner_additional_F_E_McWilliamGallery);
                break;
            case 2:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_ABCTIM);
                imageElement.setImageResource(R.drawable.armaghcountymuseum);

                textElement = (TextView) findViewById(R.id.txtABCTSDescription);
                textElement.setText(R.string.ABCTIM_Spinner_description_ArmaghCountyMuseum);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02837523070"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://discovernorthernireland.com/Armagh-County-Museum-Armagh-P2835/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtABCTSContact);
                textElement.setText(R.string.ABCTIM_Spinner_contact_ArmaghCountyMuseum);

                textElement = (TextView) findViewById(R.id.txtABCTSAdditional);
                textElement.setText(R.string.ABCTIM_Spinner_additional_ArmaghCountyMuseum);
                break;
            case 3:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_ABCTIM);
                imageElement.setImageResource(R.drawable.navancentre);

                textElement = (TextView) findViewById(R.id.txtABCTSDescription);
                textElement.setText(R.string.ABCTIM_Spinner_description_NavanCentreFort);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02837529644"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://visitarmagh.com/places-to-explore/navan-centre-fort/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtABCTSContact);
                textElement.setText(R.string.ABCTIM_Spinner_contact_NavanCentreFort);

                textElement = (TextView) findViewById(R.id.txtABCTSAdditional);
                textElement.setText(R.string.ABCTIM_Spinner_additional_NavanCentreFort);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        TextView textElement;
        ImageView imageElement;
        Button button;

        imageElement = (ImageView) findViewById(R.id.imgView_ABCTIM);
        imageElement.setImageResource(R.drawable.armaghplanetarium);

        textElement = (TextView) findViewById(R.id.txtABCTSDescription);
        textElement.setText(R.string.ABCTIM_Spinner_description_ArmaghPlanetariumObservatory);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02837523689"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button_web);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.armaghplanet.com/"));
                startActivity(myWebLink);
            }
        });

        textElement = (TextView) findViewById(R.id.txtABCTSContact);
        textElement.setText(R.string.ABCTIM_Spinner_contact_ArmaghPlanetariumObservatory);

        textElement = (TextView) findViewById(R.id.txtABCTSAdditional);
        textElement.setText(R.string.ABCTIM_Spinner_additional_ArmaghPlanetariumObservatory);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }
}
