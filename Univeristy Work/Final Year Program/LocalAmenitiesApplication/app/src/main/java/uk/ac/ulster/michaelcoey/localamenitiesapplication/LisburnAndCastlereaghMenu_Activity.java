package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LisburnAndCastlereaghMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lisburnandcastlereagh_menu);
    }

    public void NavigationLisburnCastlereaghCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                LisburnAndCastlereaghCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationLisburnCastlereaghTouristServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                LisburnAndCastlereaghTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}
