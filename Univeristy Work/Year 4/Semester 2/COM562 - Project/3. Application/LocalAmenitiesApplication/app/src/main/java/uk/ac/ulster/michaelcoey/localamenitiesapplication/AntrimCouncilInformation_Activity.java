package uk.ac.ulster.michaelcoey.localamenitiesapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class AntrimCouncilInformation_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String[] paths = {};
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrim_council_information);

        spinner = (Spinner) findViewById(R.id.spn_AntrimCouncilInfo);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ANCIM_Spinner_Array_Titles,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        TextView textElement;

        switch (position)
        {
            case 0:
                textElement = (TextView) findViewById(R.id.txtANCSAreaTitle);
                textElement.setText(R.string.ANCIM_Spinner_description_BirthsDeathsMarriages);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View v, int position,
//                               long id) {
//        TextView textElement;
//
//        switch (position) {
//            case 0:
//                textElement = (TextView) findViewById(R.id.txtEducationDescription);
//                textElement
//                        .setText(R.string.Education_Spinner_description_PlayGroups);
//
//                textElement = (TextView) findViewById(R.id.txtEducationContact);
//                textElement.setText(R.string.Education_Spinner_contact_PlayGroups);
//
//                textElement = (TextView) findViewById(R.id.txtEducationAdditional);
//                textElement.setText(R.string.Education_Spinner_additional_PlayGroups);
//
//                break;
//            case 1:
//                textElement = (TextView) findViewById(R.id.txtEducationDescription);
//                textElement
//                        .setText(R.string.Education_Spinner_description_Primary);
//
//                textElement = (TextView) findViewById(R.id.txtEducationContact);
//                textElement
//                        .setText(R.string.Education_Spinner_contact_Primary);
//
//                textElement = (TextView) findViewById(R.id.txtEducationAdditional);
//                textElement.setText(R.string.Education_Spinner_additional_Primary);
//                break;
//            case 2:
//                textElement = (TextView) findViewById(R.id.txtEducationDescription);
//                textElement
//                        .setText(R.string.Education_Spinner_description_Secondary);
//
//                textElement = (TextView) findViewById(R.id.txtEducationContact);
//                textElement
//                        .setText(R.string.Education_Spinner_contact_Secondary);
//
//                textElement = (TextView) findViewById(R.id.txtEducationAdditional);
//                textElement.setText(R.string.Education_Spinner_additional_Secondary);
//                break;
//            case 3:
//                textElement = (TextView) findViewById(R.id.txtEducationDescription);
//                textElement
//                        .setText(R.string.Education_Spinner_description_HigherEducation);
//                textElement = (TextView) findViewById(R.id.txtEducationContact);
//                textElement
//                        .setText(R.string.Education_Spinner_contact_HigherEducation);
//
//                textElement = (TextView) findViewById(R.id.txtEducationAdditional);
//                textElement.setText(R.string.Education_Spinner_additional_HigherEducation);
//                break;
//            case 4:
//                textElement = (TextView) findViewById(R.id.txtEducationDescription);
//                textElement
//                        .setText(R.string.Education_Spinner_description_ESQL);
//
//                textElement = (TextView) findViewById(R.id.txtEducationContact);
//                textElement
//                        .setText(R.string.Education_Spinner_contact_ESQL);
//
//                textElement = (TextView) findViewById(R.id.txtEducationAdditional);
//                textElement
//                        .setText(R.string.Education_Spinner_additional_ESQL);
//
//                break;
//
//        }
//
//    }

}
