package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AntrimMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrim_menu);
    }


    public void NavigationAntrimNewtownabbeyCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                AntrimCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationAntrimNewtownabbeyTouristServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                AntrimTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}
