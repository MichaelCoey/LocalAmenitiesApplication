package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ArmaghBanbridgeCraigavonMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armaghbanbridgecraigavon_menu);
    }

    public void NavigationArmaghBanbridgeCraigavonCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                ArmaghBanbridgeCraigavonCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationArmaghBanbridgeCraigavonTouristServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                ArmaghBanbridgeCraigavonTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}
