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

public class BelfastCityTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    /*Setting up string array, spinner object and google map object*/
    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belfast_city_tourist_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_BelfastCityTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.BCTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    /*Preparing Google Map and adding markers to the map*/
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng malonehouse = new LatLng(54.5530092, -5.9601749);
        LatLng belfastcastle = new LatLng(54.634501, -5.9486987);
        LatLng belfastzoo = new LatLng(54.657823, -5.9458187);
        LatLng stgeorgesmarket = new LatLng(54.6578179, -5.9786491);

        mMap.addMarker(new MarkerOptions().position(malonehouse).title("Malone House"));
        mMap.addMarker(new MarkerOptions().position(belfastcastle).title("Belfast Castle"));
        mMap.addMarker(new MarkerOptions().position(belfastzoo).title("Belfast Zoo"));
        mMap.addMarker(new MarkerOptions().position(stgeorgesmarket).title("St Georges Market"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(malonehouse));
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
                imageElement = (ImageView) findViewById(R.id.imgView_BCTIM);
                imageElement.setImageResource(R.drawable.malonehouse);

                textElement = (TextView) findViewById(R.id.txtBCTSDescription);
                textElement.setText(R.string.BCTIM_Spinner_description_MaloneHouse);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02890681246"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.belfastcity.gov.uk/tourism-venues/malonehouse/mhabout.aspx"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtBCTSContact);
                textElement.setText(R.string.BCTIM_Spinner_contact_MaloneHouse);

                textElement = (TextView) findViewById(R.id.txtBCTSAdditional);
                textElement.setText(R.string.BCTIM_Spinner_additional_MaloneHouse);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_BCTIM);
                imageElement.setImageResource(R.drawable.belfastcastle);

                textElement = (TextView) findViewById(R.id.txtBCTSDescription);
                textElement.setText(R.string.BCTIM_Spinner_description_BelfastCastle);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02890776925"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.belfastcity.gov.uk/tourism-venues/belfastcastle/bcabout.aspx"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtBCTSContact);
                textElement.setText(R.string.BCTIM_Spinner_contact_BelfastCastle);

                textElement = (TextView) findViewById(R.id.txtBCTSAdditional);
                textElement.setText(R.string.BCTIM_Spinner_additional_BelfastCastle);
                break;
            case 2:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_BCTIM);
                imageElement.setImageResource(R.drawable.belfastzoo);

                textElement = (TextView) findViewById(R.id.txtBCTSDescription);
                textElement.setText(R.string.BCTIM_Spinner_description_BelfastZoo);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02890776277"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.belfastzoo.co.uk/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtBCTSContact);
                textElement.setText(R.string.BCTIM_Spinner_contact_BelfastZoo);

                textElement = (TextView) findViewById(R.id.txtBCTSAdditional);
                textElement.setText(R.string.BCTIM_Spinner_additional_BelfastZoo);
                break;
            case 3:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_BCTIM);
                imageElement.setImageResource(R.drawable.stgeorgesmarket);

                textElement = (TextView) findViewById(R.id.txtBCTSDescription);
                textElement.setText(R.string.BCTIM_Spinner_description_StGeorgesMarket);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02890435704"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.belfastcity.gov.uk/tourism-venues/markets/markets.aspx"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtBCTSContact);
                textElement.setText(R.string.BCTIM_Spinner_contact_StGeorgesMarket);

                textElement = (TextView) findViewById(R.id.txtBCTSAdditional);
                textElement.setText(R.string.BCTIM_Spinner_additional_StGeorgesMarket);
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
        imageElement = (ImageView) findViewById(R.id.imgView_BCTIM);
        imageElement.setImageResource(R.drawable.malonehouse);

        textElement = (TextView) findViewById(R.id.txtBCTSDescription);
        textElement.setText(R.string.BCTIM_Spinner_description_MaloneHouse);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02890681246"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button_web);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.belfastcity.gov.uk/tourism-venues/malonehouse/mhabout.aspx"));
                startActivity(myWebLink);
            }
        });

        textElement = (TextView) findViewById(R.id.txtBCTSContact);
        textElement.setText(R.string.BCTIM_Spinner_contact_MaloneHouse);

        textElement = (TextView) findViewById(R.id.txtBCTSAdditional);
        textElement.setText(R.string.BCTIM_Spinner_additional_MaloneHouse);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
}
