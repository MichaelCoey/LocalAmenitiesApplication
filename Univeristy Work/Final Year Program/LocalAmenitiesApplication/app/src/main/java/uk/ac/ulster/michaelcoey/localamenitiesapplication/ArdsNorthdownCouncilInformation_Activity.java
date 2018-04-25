package uk.ac.ulster.michaelcoey.localamenitiesapplication;

/*Needed Imports for widgets*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ArdsNorthdownCouncilInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /*Declaring string array and spinner(dropdown)*/
    private static final String[] paths = {};
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ardsnorthdown_council_information);

        /*Populating spinner object with string array from resources and setting listener up*/
        spinner = (Spinner) findViewById(R.id.spn_ArdsNorthdownCouncilInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ANDCIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    /*Setting select events when user makes a choice on the dropdown*/
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        TextView textElement;

        switch (position)
        {
            /*Population of activity elements*/
            /*Content Provided by Ards and North Down Council Website*/
            case 0:
                textElement = (TextView) findViewById(R.id.txtANDCSDescription);
                textElement.setText(R.string.ANDCIM_Spinner_description_BirthsDeathsMarriages);

                textElement = (TextView) findViewById(R.id.txtANDCSContact);
                textElement.setText(R.string.ANDCIM_Spinner_contact_BirthsDeathsMarriages);

                textElement = (TextView) findViewById(R.id.txtANDCSAdditional);
                textElement.setText(R.string.ANDCIM_Spinner_additional_BirthsDeathsMarriages);
                break;
            case 1:
                textElement = (TextView) findViewById(R.id.txtANDCSDescription);
                textElement.setText(R.string.ANDCIM_Spinner_description_BuildingControl);

                textElement = (TextView) findViewById(R.id.txtANDCSContact);
                textElement.setText(R.string.ANDCIM_Spinner_contact_BuildingControl);

                textElement = (TextView) findViewById(R.id.txtANDCSAdditional);
                textElement.setText(R.string.ANDCIM_Spinner_additional_BuildingControl);
                break;
            case 2:
                textElement = (TextView) findViewById(R.id.txtANDCSDescription);
                textElement.setText(R.string.ANDCIM_Spinner_description_Cemeteries);

                textElement = (TextView) findViewById(R.id.txtANDCSContact);
                textElement.setText(R.string.ANDCIM_Spinner_contact_Cemeteries);

                textElement = (TextView) findViewById(R.id.txtANDCSAdditional);
                textElement.setText(R.string.ANDCIM_Spinner_additional_Cemeteries);
                break;
            case 3:
                textElement = (TextView) findViewById(R.id.txtANDCSDescription);
                textElement.setText(R.string.ANDCIM_Spinner_description_Dogs);

                textElement = (TextView) findViewById(R.id.txtANDCSContact);
                textElement.setText(R.string.ANDCIM_Spinner_contact_Dogs);

                textElement = (TextView) findViewById(R.id.txtANDCSAdditional);
                textElement.setText(R.string.ANDCIM_Spinner_additional_Dogs);
                break;
            case 4:
                textElement = (TextView) findViewById(R.id.txtANDCSDescription);
                textElement.setText(R.string.ANDCIM_Spinner_description_WasteRecycling);

                textElement = (TextView) findViewById(R.id.txtANDCSContact);
                textElement.setText(R.string.ANDCIM_Spinner_contact_WasteRecycling);

                textElement = (TextView) findViewById(R.id.txtANDCSAdditional);
                textElement.setText(R.string.ANDCIM_Spinner_additional_WasteRecycling);
                break;
        }
    }

    @Override
    /*Error Handling*/
    public void onNothingSelected(AdapterView<?> parent) {

        TextView textElement;

        textElement = (TextView) findViewById(R.id.txtANDCSDescription);
        textElement.setText(R.string.ANDCIM_Spinner_description_BirthsDeathsMarriages);

        textElement = (TextView) findViewById(R.id.txtANDCSContact);
        textElement.setText(R.string.ANDCIM_Spinner_contact_BirthsDeathsMarriages);

        textElement = (TextView) findViewById(R.id.txtANDCSAdditional);
        textElement.setText(R.string.ANDCIM_Spinner_additional_BirthsDeathsMarriages);

    }
}
