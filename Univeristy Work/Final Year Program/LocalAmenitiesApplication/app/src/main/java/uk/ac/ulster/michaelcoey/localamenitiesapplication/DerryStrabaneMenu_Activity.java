package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DerryStrabaneMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrystrabane_menu);
    }

    public void NavigationDerryStrabaneCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                DerryStrabaneCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationDerryStrabaneTouristServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                DerryStrabaneTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}
