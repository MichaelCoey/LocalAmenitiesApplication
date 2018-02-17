package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Area_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }

    public void NavigationAntrimNewtownabbey(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                AntrimMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationArdsAndNorthDown(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                ArdsAndNorthDownMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationArmaghBanbridgeCraigavon(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                ArmaghBanbridgeCraigavonMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationBelfastCity(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                BelfastCityMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationCausewayCoastGlens(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                CausewayCoastGlensMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationDerryStrabane(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                DerryStrabaneMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationFermanaghAndOmagh(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                FermanaghAndOmaghMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationLisburnAndCastlereagh(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                LisburnAndCastlereaghMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationMidEastAntrim(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                MidEastAntrimMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationMidUlster(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                MidUlsterMenu_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationNewryMourneDown(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                NewryMourneDownMenu_Activity.class);
        startActivity(nextScreen);
    }



}
