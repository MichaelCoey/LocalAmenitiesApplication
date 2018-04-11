package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MidEastAntrimMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mideastantrim_menu);
    }

    public void NavigationMidEastAntrimCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                MidEastAntrimCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationMidEastAntrimTouristServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                MidEastAntrimTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}
