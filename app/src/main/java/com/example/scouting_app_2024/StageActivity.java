package com.example.scouting_app_2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class StageActivity extends AppCompatActivity {
    CheckBox harmonyCheck, trapCheck;
    RadioButton park, shallow, deep, none;
    EditText comments;
    //Cannot deselect parking options in endgame
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);

        park = findViewById(R.id.parkRadioButton);
        shallow = findViewById(R.id.shallowRadioButton);
        deep = findViewById(R.id.deepRadioButton);
        none = findViewById(R.id.noneRadioButton);

        comments = findViewById(R.id.commentsEditText);
        setPrevious();
    }

    /**
     * Moves the xml/page back to tele
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void backTele(View view){
        Intent next = new Intent(this, TeleActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Moves the xml/page to popup
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toPopup(View view){
        Intent next = new Intent(this, PopupActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Sets all values to the ones in RecordsActivity so pages don't change whenever you switch between them
     */
    public void setPrevious(){

        switch (RecordsActivity.Info.climbLevel) {
            case "Park":
                park.setChecked(true);
                break;
            case "Shallow (high)":
                shallow.setChecked(true);
                break;
            case "Deep (low)":
                deep.setChecked(true);
                break;
            case "None":
                none.setChecked(true);
                break;
            default:
                park.setChecked(false);
                shallow.setChecked(false);
                deep.setChecked(false);
                none.setChecked(false);
                break;
        }
        comments.setText(RecordsActivity.Info.comments);
    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData(){

        if(park.isChecked()){
            RecordsActivity.Info.climbLevel = "Park";
        } else if (shallow.isChecked()){
            RecordsActivity.Info.climbLevel = "Shallow (high)";
        } else if (deep.isChecked()){
            RecordsActivity.Info.climbLevel = "Deep (low)";
        } else if (none.isChecked()){
            RecordsActivity.Info.climbLevel = "None";
        }
        RecordsActivity.Info.comments = comments.getText().toString();
    }
}
