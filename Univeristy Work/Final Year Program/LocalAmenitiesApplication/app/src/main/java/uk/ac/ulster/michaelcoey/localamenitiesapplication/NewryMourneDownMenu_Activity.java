package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewryMourneDownMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newrymournedown_menu);
    }

    public void NavigationNewryMourneDownCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                NewryMourneDownCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

//    public void NavigationArdsAndNorthDown(View view) {
//        // Starting a new Intent
//        Intent nextScreen = new Intent(getApplicationContext(),
//                ArdsAndNorthDownMenu_Activity.class);
//        startActivity(nextScreen);
//    }
}
