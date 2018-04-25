package uk.ac.ulster.michaelcoey.localamenitiesapplication;

/*Needed Imports for widgets*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ArdsAndNorthDownMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ardsandnorthdown);
    }

    public void NavigationArdsNorthDownCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                ArdsNorthdownCouncilInformation_Activity.class);
        startActivity(nextScreen);
    }

    public void NavigationArdsNorthDownTouristInformation(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                ArdsNorthDownTouristInformation_Activity.class);
        startActivity(nextScreen);
    }
}
