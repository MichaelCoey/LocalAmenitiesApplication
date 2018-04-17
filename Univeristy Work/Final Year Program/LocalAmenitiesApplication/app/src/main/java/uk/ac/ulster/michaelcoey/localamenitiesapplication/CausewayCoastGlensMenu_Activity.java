package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CausewayCoastGlensMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causewaycoastglens_menu);
    }

    public void NavigationCausewayCoastGlensCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                CausewayCoastGlensCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationCausewayCoastGlensTouristServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                CausewayCoastGlensTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}