package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BelfastCityMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belfastcity_menu);
    }

    public void NavigationBelfastCityCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                BelfastCityCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationBelfastCityTouristServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                BelfastCityTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}
