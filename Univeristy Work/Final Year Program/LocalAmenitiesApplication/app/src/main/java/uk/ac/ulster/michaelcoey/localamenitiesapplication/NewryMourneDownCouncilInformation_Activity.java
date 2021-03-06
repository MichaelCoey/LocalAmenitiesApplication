package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class NewryMourneDownCouncilInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String[] paths = {};
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newry_mourne_down_council_information);

        spinner = (Spinner) findViewById(R.id.spn_NewryMourneDownCouncilInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.NMDCIM_Spinner_Array_Titles, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        TextView textElement;

        switch (position)
        {
            case 0:
                textElement = (TextView) findViewById(R.id.txtNMDCSDescription);
                textElement.setText(R.string.NMDCIM_Spinner_description_BirthsDeathsMarriages);

                textElement = (TextView) findViewById(R.id.txtNMDCSContact);
                textElement.setText(R.string.NMDCIM_Spinner_contact_BirthsDeathsMarriages);

                textElement = (TextView) findViewById(R.id.txtNMDCSAdditional);
                textElement.setText(R.string.NMDCIM_Spinner_additional_BirthsDeathsMarriages);
                break;
            case 1:
                textElement = (TextView) findViewById(R.id.txtNMDCSDescription);
                textElement.setText(R.string.NMDCIM_Spinner_description_BuildingControl);

                textElement = (TextView) findViewById(R.id.txtNMDCSContact);
                textElement.setText(R.string.NMDCIM_Spinner_contact_BuildingControl);

                textElement = (TextView) findViewById(R.id.txtNMDCSAdditional);
                textElement.setText(R.string.NMDCIM_Spinner_additional_BuildingControl);
                break;
            case 2:
                textElement = (TextView) findViewById(R.id.txtNMDCSDescription);
                textElement.setText(R.string.NMDCIM_Spinner_description_Cemeteries);

                textElement = (TextView) findViewById(R.id.txtNMDCSContact);
                textElement.setText(R.string.NMDCIM_Spinner_contact_Cemeteries);

                textElement = (TextView) findViewById(R.id.txtNMDCSAdditional);
                textElement.setText(R.string.NMDCIM_Spinner_additional_Cemeteries);
                break;
            case 3:
                textElement = (TextView) findViewById(R.id.txtNMDCSDescription);
                textElement.setText(R.string.NMDCIM_Spinner_description_Dogs);

                textElement = (TextView) findViewById(R.id.txtNMDCSContact);
                textElement.setText(R.string.NMDCIM_Spinner_contact_Dogs);

                textElement = (TextView) findViewById(R.id.txtNMDCSAdditional);
                textElement.setText(R.string.NMDCIM_Spinner_additional_Dogs);
                break;
            case 4:
                textElement = (TextView) findViewById(R.id.txtNMDCSDescription);
                textElement.setText(R.string.NMDCIM_Spinner_description_WasteRecycling);

                textElement = (TextView) findViewById(R.id.txtNMDCSContact);
                textElement.setText(R.string.NMDCIM_Spinner_contact_WasteRecycling);

                textElement = (TextView) findViewById(R.id.txtNMDCSAdditional);
                textElement.setText(R.string.NMDCIM_Spinner_additional_WasteRecycling);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
