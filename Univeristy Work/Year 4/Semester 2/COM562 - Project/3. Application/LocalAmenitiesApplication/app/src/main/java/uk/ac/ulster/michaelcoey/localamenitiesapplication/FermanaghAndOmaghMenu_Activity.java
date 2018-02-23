package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FermanaghAndOmaghMenu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fermanaghandomagh_menu);
    }

    public void NavigationFermanaghOmaghCouncilServices(View view) {
        // Starting a new Intent
        Intent nextScreen = new Intent(getApplicationContext(),
                FermanaghOmaghCounciInformation_Activity.class);
        startActivity(nextScreen);
    }

//    public void NavigationArdsAndNorthDown(View view) {
//        // Starting a new Intent
//        Intent nextScreen = new Intent(getApplicationContext(),
//                ArdsAndNorthDownMenu_Activity.class);
//        startActivity(nextScreen);
//    }
}
