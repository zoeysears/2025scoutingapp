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
    RadioButton park, onstage, spotlit;
    EditText stageComments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);
        harmonyCheck = findViewById(R.id.harmonyCheckBox);
        trapCheck = findViewById(R.id.trapCheckBox);
        park = findViewById(R.id.parkRadioButton);
        onstage = findViewById(R.id.onstageRadioButton);
        spotlit = findViewById(R.id.spotlitRadioButton);
        stageComments = findViewById(R.id.stageCommentsEditText);
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
        //saveData();
    }

    /**
     * Moves the xml/page to tele
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toPopup(View view){
        Intent next = new Intent(this, PopupActivity.class);
        startActivity(next);
        //saveData();
    }

    /**
     * Sets all values to the ones in RecordsActivity so pages don't change whenever you switch between them
     */
    public void setPrevious(){
        harmonyCheck.setChecked(RecordsActivity.Info.harmony);
        trapCheck.setChecked(RecordsActivity.Info.trap);
        //leaveCheck.setChecked(RecordsActivity.Info.leave);
        //autoNotesCount = RecordsActivity.Info.autoNotes;
        //autoNotesCountText.setText(String.valueOf(autoNotesCount));
        //autoAmpNotesCount = RecordsActivity.Info.autoAmpNotes;
        //autoAmpNotesCountText.setText(String.valueOf(autoAmpNotesCount));
        //autoSpeakerNotesCount = RecordsActivity.Info.autoSpeakerNotes;
        //autoSpeakerNotesCountText.setText(String.valueOf(autoSpeakerNotesCount));
        //comments.setText(RecordsActivity.Info.autoComments);
    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData(){
        //RecordsActivity.Info.leave = leaveCheck.isChecked();
        //RecordsActivity.Info.autoNotes = autoNotesCount;
        //RecordsActivity.Info.autoAmpNotes = autoAmpNotesCount;
        //RecordsActivity.Info.autoSpeakerNotes = autoSpeakerNotesCount;
        //RecordsActivity.Info.autoComments = comments.getText().toString();
    }
}
