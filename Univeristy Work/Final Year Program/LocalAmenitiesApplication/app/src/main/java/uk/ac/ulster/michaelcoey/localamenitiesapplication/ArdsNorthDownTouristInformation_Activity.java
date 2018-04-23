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

public class ArdsNorthDownTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnMapReadyCallback {

    private static final String[] paths = {};
    private Spinner spinner;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ards_north_down_tourist_information);

        spinner = (Spinner) findViewById(R.id.spn_ArdsNorthDownTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ANDTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng SommeHeritageCentre = new LatLng(54.6143557, -5.6845879);
        LatLng UlsterFolkTransport = new LatLng(54.6523323, -5.8000234);
        LatLng IslandHill = new LatLng(54.5462036, -5.6920375);
        LatLng Exploris = new LatLng(54.3817227, -5.5516362);

        mMap.addMarker(new MarkerOptions().position(SommeHeritageCentre).title("Somme Heritage Centre"));
        mMap.addMarker(new MarkerOptions().position(UlsterFolkTransport).title("Ulster Folk & Transport"));
        mMap.addMarker(new MarkerOptions().position(IslandHill).title("Island Hill"));
        mMap.addMarker(new MarkerOptions().position(Exploris).title("Exploris"));

        mMap.moveCamera(CameraUpdateFactory.zoomTo( 8.0f ));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SommeHeritageCentre));
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
                imageElement = (ImageView) findViewById(R.id.imgView_ArdsNorthDown);
                imageElement.setImageResource(R.drawable.sommeheritage);

                textElement = (TextView) findViewById(R.id.txtANDTSDescription);
                textElement.setText(R.string.ANDTIM_Spinner_description_SommeMuseum);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02891823202"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.sommeassociation.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANDTSContact);
                textElement.setText(R.string.ANDTIM_Spinner_contact_SommeMuseum);

                textElement = (TextView) findViewById(R.id.txtANDTSAdditional);
                textElement.setText(R.string.ANDTIM_Spinner_additional_SommeMuseum);

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);
                mapFragment.getMapAsync(this);
                break;
            case 1:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_ArdsNorthDown);
                imageElement.setImageResource(R.drawable.uftm);

                textElement = (TextView) findViewById(R.id.txtANDTSDescription);
                textElement.setText(R.string.ANDTIM_Spinner_description_UlsterFolkandTransportMuseum);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02890428428"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("https://www.nmni.com/our-museums/ulster-folk-and-transport-museum/Home.aspx"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANDTSContact);
                textElement.setText(R.string.ANDTIM_Spinner_contact_UlsterFolkandTransportMuseum);

                textElement = (TextView) findViewById(R.id.txtANDTSAdditional);
                textElement.setText(R.string.ANDTIM_Spinner_additional_UlsterFolkandTransportMuseum);
                break;
            case 2:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_ArdsNorthDown);
                imageElement.setImageResource(R.drawable.islandhill);

                textElement = (TextView) findViewById(R.id.txtANDTSDescription);
                textElement.setText(R.string.ANDTIM_Spinner_description_IslandHill);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02891823202"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://www.walkni.com/walks/193/island-hill-north-strangford-nature-reserve/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANDTSContact);
                textElement.setText(R.string.ANDTIM_Spinner_contact_IslandHill);

                textElement = (TextView) findViewById(R.id.txtANDTSAdditional);
                textElement.setText(R.string.ANDTIM_Spinner_additional_IslandHill);
                break;
            case 3:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_ArdsNorthDown);
                imageElement.setImageResource(R.drawable.exploris);

                textElement = (TextView) findViewById(R.id.txtANDTSDescription);
                textElement.setText(R.string.ANDTIM_Spinner_description_ExplorisAquarium);

                button = (Button) findViewById(R.id.button);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:02842728062"));
                        startActivity(intent);
                    }
                });

                button = (Button) findViewById(R.id.button_web);
                button.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                        myWebLink.setData(Uri.parse("http://explorisni.com/"));
                        startActivity(myWebLink);
                    }
                });

                textElement = (TextView) findViewById(R.id.txtANDTSContact);
                textElement.setText(R.string.ANDTIM_Spinner_contact_ExplorisAquarium);

                textElement = (TextView) findViewById(R.id.txtANDTSAdditional);
                textElement.setText(R.string.ANDTIM_Spinner_additional_ExplorisAquarium);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
