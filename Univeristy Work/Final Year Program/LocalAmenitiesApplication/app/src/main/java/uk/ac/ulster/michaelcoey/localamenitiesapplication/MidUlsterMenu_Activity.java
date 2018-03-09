package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MidUlsterMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midulster_menu);
    }

    public void NavigationMidUlsterCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                MidUlsterCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

//    public void NavigationArdsAndNorthDown(View view) {
//        // Starting a new Intent
//        Intent nextScreen = new Intent(getApplicationContext(),
//                ArdsAndNorthDownMenu_Activity.class);
//        startActivity(nextScreen);
//    }
}
