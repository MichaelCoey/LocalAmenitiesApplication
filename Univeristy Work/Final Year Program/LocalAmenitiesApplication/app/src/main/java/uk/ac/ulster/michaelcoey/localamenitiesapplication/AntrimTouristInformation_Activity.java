package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class AntrimTouristInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String[] paths = {};
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrim_tourist_information);

        spinner = (Spinner) findViewById(R.id.spn_AntrimTouristInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ANTIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView textElement;
        ImageView imageElement;

        switch (position)
        {
            case 0:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.antrimcastlegardensclotworthyhouse);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_AntrimCastleGardensClotworthyHouse);

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_AntrimCastleGardensClotworthyHouse);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_AntrimCastleGardensClotworthyHouse);
                break;
            case 1:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.ballyrobertcottagegarden);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_BallyrobertGardens);

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_BallyrobertGardens);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_BallyrobertGardens);
                break;
            case 2:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.ramsisland);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_RamsIsland);

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_RamsIsland);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_RamsIsland);


                break;
            case 3:
                //Image from Discover NI
                imageElement = (ImageView) findViewById(R.id.imgView_ANTIM);
                imageElement.setImageResource(R.drawable.shanescastle);

                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANTIM_Spinner_description_ShanesCastle);

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANTIM_Spinner_contact_ShanesCastle);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANTIM_Spinner_additional_ShanesCastle);
                break;
            case 4:
                textElement = (TextView) findViewById(R.id.txtANTSDescription);
                textElement.setText(R.string.ANCIM_Spinner_description_WasteRecycling);

                textElement = (TextView) findViewById(R.id.txtANTSContact);
                textElement.setText(R.string.ANCIM_Spinner_contact_WasteRecycling);

                textElement = (TextView) findViewById(R.id.txtANTSAdditional);
                textElement.setText(R.string.ANCIM_Spinner_additional_WasteRecycling);
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
