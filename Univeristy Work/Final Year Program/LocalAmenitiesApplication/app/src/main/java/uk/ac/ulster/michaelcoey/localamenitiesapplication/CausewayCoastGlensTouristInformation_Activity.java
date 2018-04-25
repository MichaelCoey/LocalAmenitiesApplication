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

public class CausewayCoastGlensTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    /*Setting up string array, spinner object and google map object*/
    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causeway_coast_glens_tourist_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_CausewayCoastGlensTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.CCGTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    /*Google Map Setup*/
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng ballycastlemuseum = new LatLng(55.200394, -6.2538969);
        LatLng roevalleylimavadyciviccentre = new LatLng(55.0438893, -6.943451);
        LatLng causewaycoast = new LatLng(55.2406415, -6.5162615);
        LatLng joeydunlopleisurecentre = new LatLng(55.0626765, -6.4970222);

        mMap.addMarker(new MarkerOptions().position(ballycastlemuseum).title("Ballycastle Museum"));
        mMap.addMarker(new MarkerOptions().position(roevalleylimavadyciviccentre).title("Roe Valley Limavady Civic Centre"));
        mMap.addMarker(new MarkerOptions().position(causewaycoast).title("Causeway Coast"));
        mMap.addMarker(new MarkerOptions().position(joeydunlopleisurecentre).title("Joey Dunlop Leisure Centre"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ballycastlemuseum));
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
                imageElement = (ImageView) findViewById(R.id.imgView_CCGTIM);
                imageElement.setImageResource(R.drawable.ballycastlemuseum);

                textElement = (TextView) findViewById(R.id.txtCCGTSDescription);
                textElement.setText(R.string.CCGTIM_Spinner_description_BallycastleMuseum);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02820762024"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.causewaycoastandglens.gov.uk/see-do/cultural-services/museums-services/ballycastle-museum"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtCCGTSContact);
                textElement.setText(R.string.CCGTIM_Spinner_contact_BallycastleMuseum);

                textElement = (TextView) findViewById(R.id.txtCCGTSAdditional);
                textElement.setText(R.string.CCGTIM_Spinner_additional_BallycastleMuseum);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_CCGTIM);
                imageElement.setImageResource(R.drawable.roevalleylimavadyciviccentre);

                textElement = (TextView) findViewById(R.id.txtCCGTSDescription);
                textElement.setText(R.string.CCGTIM_Spinner_description_RoeValleyArtsandCulturalCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02877760650"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.roevalleyarts.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtCCGTSContact);
                textElement.setText(R.string.CCGTIM_Spinner_contact_RoeValleyArtsandCulturalCentre);

                textElement = (TextView) findViewById(R.id.txtCCGTSAdditional);
                textElement.setText(R.string.CCGTIM_Spinner_additional_RoeValleyArtsandCulturalCentre);
                break;
            case 2:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_CCGTIM);
                imageElement.setImageResource(R.drawable.causewaycoast);

                textElement = (TextView) findViewById(R.id.txtCCGTSDescription);
                textElement.setText(R.string.CCGTIM_Spinner_description_CoastandCountryside);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02870347234"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.nationaltrust.org.uk/giants-causeway"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtCCGTSContact);
                textElement.setText(R.string.CCGTIM_Spinner_contact_CoastandCountryside);

                textElement = (TextView) findViewById(R.id.txtCCGTSAdditional);
                textElement.setText(R.string.CCGTIM_Spinner_additional_CoastandCountryside);
                break;
            case 3:
                //Image from Discover NI
                //Content from Discover NI & Council Website
                imageElement = (ImageView) findViewById(R.id.imgView_CCGTIM);
                imageElement.setImageResource(R.drawable.joeydunlopleisurecentre);

                textElement = (TextView) findViewById(R.id.txtCCGTSDescription);
                textElement.setText(R.string.CCGTIM_Spinner_description_JoeyDunlopLeisureCentre);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02827660260"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.causewaycoastandglens.gov.uk/see-do/leisure-centres/joey-dunlop-leisure-centre"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtCCGTSContact);
                textElement.setText(R.string.CCGTIM_Spinner_contact_JoeyDunlopLeisureCentre);

                textElement = (TextView) findViewById(R.id.txtCCGTSAdditional);
                textElement.setText(R.string.CCGTIM_Spinner_additional_JoeyDunlopLeisureCentre);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        TextView textElement;
        ImageView imageElement;
        Button button;

        imageElement = (ImageView) findViewById(R.id.imgView_CCGTIM);
        imageElement.setImageResource(R.drawable.ballycastlemuseum);

        textElement = (TextView) findViewById(R.id.txtCCGTSDescription);
        textElement.setText(R.string.CCGTIM_Spinner_description_BallycastleMuseum);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02820762024"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button_web);
        button.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.causewaycoastandglens.gov.uk/see-do/cultural-services/museums-services/ballycastle-museum"));
                startActivity(myWebLink);
            }
        });

        textElement = (TextView) findViewById(R.id.txtCCGTSContact);
        textElement.setText(R.string.CCGTIM_Spinner_contact_BallycastleMuseum);

        textElement = (TextView) findViewById(R.id.txtCCGTSAdditional);
        textElement.setText(R.string.CCGTIM_Spinner_additional_BallycastleMuseum);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
}
