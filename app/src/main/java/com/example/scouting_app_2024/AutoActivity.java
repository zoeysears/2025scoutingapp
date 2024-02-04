package com.example.scouting_app_2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AutoActivity extends AppCompatActivity {
    CheckBox leaveCheck;
    TextView autoNotesCountText, autoAmpNotesCountText, autoSpeakerNotesCountText;
    byte autoNotesCount, autoAmpNotesCount, autoSpeakerNotesCount;
    EditText autoComments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        leaveCheck = findViewById(R.id.leaveCheckBox);
        autoNotesCountText = findViewById(R.id.autoNotesCountTextView);
        autoAmpNotesCountText = findViewById(R.id.autoAmpNotesCountTextView);
        autoSpeakerNotesCountText = findViewById(R.id.autoSpeakerNotesCountTextView);
        autoComments = findViewById(R.id.autoCommentsEditText);
        setPrevious();
    }

    /**
     * Increments the notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void autoIncrementNotes(View view){
        autoNotesCount++;
        autoNotesCountText.setText(String.valueOf(autoNotesCount));
    }

    /**
     * Decrements the notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void autoDecrementNotes(View view){
        if (autoNotesCount != 0 && autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCount){
            autoNotesCount--;
            autoNotesCountText.setText(String.valueOf(autoNotesCount));
        }
    }

    /**
     * Increments the amp notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void autoIncrementAmpNotes(View view){
        if (autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCount+1){
            autoAmpNotesCount++;
            autoAmpNotesCountText.setText(String.valueOf(autoAmpNotesCount));
        }
    }

    /**
     * Decrements the amp notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void autoDecrementAmpNotes(View view){
        if (autoAmpNotesCount != 0) {
            autoAmpNotesCount--;
            autoAmpNotesCountText.setText(String.valueOf(autoAmpNotesCount));
        }
    }

    /**
     * Increments the speaker notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void autoIncrementSpeakerNotes(View view){
        if (autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCount+1) {
            autoSpeakerNotesCount++;
            autoSpeakerNotesCountText.setText(String.valueOf(autoSpeakerNotesCount));
        }
    }

    /**
     * Decrements the speaker notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void autoDecrementSpeakerNotes(View view){
        if (autoSpeakerNotesCount != 0) {
            autoSpeakerNotesCount--;
            autoSpeakerNotesCountText.setText(String.valueOf(autoSpeakerNotesCount));
        }
    }

    /**
     * Moves the xml/page back to main
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void backMain(View view){
        Intent next = new Intent(this, MainActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Moves the xml/page to tele
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toTele(View view){
        Intent next = new Intent(this, TeleActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Sets all values to the ones in RecordsActivity so pages don't change whenever you switch between them
     */
    public void setPrevious(){
        leaveCheck.setChecked(RecordsActivity.Info.leave);
        autoNotesCount = RecordsActivity.Info.autoNotes;
        autoNotesCountText.setText(String.valueOf(autoNotesCount));
        autoAmpNotesCount = RecordsActivity.Info.autoAmpNotes;
        autoAmpNotesCountText.setText(String.valueOf(autoAmpNotesCount));
        autoSpeakerNotesCount = RecordsActivity.Info.autoSpeakerNotes;
        autoSpeakerNotesCountText.setText(String.valueOf(autoSpeakerNotesCount));
        autoComments.setText(RecordsActivity.Info.autoComments);
    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData(){
        RecordsActivity.Info.leave = leaveCheck.isChecked();
        RecordsActivity.Info.autoNotes = autoNotesCount;
        RecordsActivity.Info.autoAmpNotes = autoAmpNotesCount;
        RecordsActivity.Info.autoSpeakerNotes = autoSpeakerNotesCount;
        RecordsActivity.Info.autoComments = autoComments.getText().toString();
    }
}
