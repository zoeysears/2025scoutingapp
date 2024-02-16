package com.example.scouting_app_2024;

import android.content.Intent;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TeleActivity extends AppCompatActivity {
    TextView teleNotesCountText, teleAmpNotesCountText, teleSpeakerNotesCountText;
    byte teleNotesCount, teleAmpNotesCount, teleSpeakerNotesCount;
    EditText teleComments;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);
        teleNotesCountText = findViewById(R.id.teleNotesCountTextView);
        teleAmpNotesCountText = findViewById(R.id.teleAmpNotesCountTextView);
        teleSpeakerNotesCountText = findViewById(R.id.teleSpeakerNotesCountTextView);
        teleComments = findViewById(R.id.teleCommentsEditText);
        setPrevious();
    }

    /**
     * Increments the notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleIncrementNotes(View view){
        teleNotesCount++;
        teleNotesCountText.setText(String.valueOf(teleNotesCount));
    }

    /**
     * Decrements the notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleDecrementNotes(View view){
        if (teleNotesCount != 0 && teleSpeakerNotesCount + teleAmpNotesCount < teleNotesCount){
            teleNotesCount--;
            teleNotesCountText.setText(String.valueOf(teleNotesCount));
        }
    }

    /**
     * Increments the amp notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleIncrementAmpNotes(View view){
        if (teleAmpNotesCount + teleSpeakerNotesCount < teleNotesCount){
            teleAmpNotesCount++;
            teleAmpNotesCountText.setText(String.valueOf(teleAmpNotesCount));  
        }
    }

    /**
     * Decrements the amp notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleDecrementAmpNotes(View view){
        if (teleAmpNotesCount != 0) {
            teleAmpNotesCount--;
            teleAmpNotesCountText.setText(String.valueOf(teleAmpNotesCount));
        }
    }

    /**
     * Increments the speaker notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleIncrementSpeakerNotes(View view){
        if (teleAmpNotesCount + teleSpeakerNotesCount < teleNotesCount){
            teleSpeakerNotesCount++;
            teleSpeakerNotesCountText.setText(String.valueOf(teleSpeakerNotesCount));  
        }
    }

    /**
     * Decrements the speaker notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleDecrementSpeakerNotes(View view){
        if (teleSpeakerNotesCount != 0) {
            teleSpeakerNotesCount--;
            teleSpeakerNotesCountText.setText(String.valueOf(teleSpeakerNotesCount));
        }
    }

    /**
     * Moves the xml/page back to auto
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void backAuto(View view){
        Intent next = new Intent(this, AutoActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Moves the xml/page to stage
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toStage(View view){
        Intent next = new Intent(this, StageActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Sets all values to the ones in RecordsActivity so pages don't change whenever you switch between them
     */
    public void setPrevious(){
        teleNotesCount = RecordsActivity.Info.teleNotes;
        teleNotesCountText.setText(String.valueOf(teleNotesCount));
        teleAmpNotesCount = RecordsActivity.Info.teleAmpNotes;
        teleAmpNotesCountText.setText(String.valueOf(teleAmpNotesCount));
        teleSpeakerNotesCount = RecordsActivity.Info.teleSpeakerNotes;
        teleSpeakerNotesCountText.setText(String.valueOf(teleSpeakerNotesCount));
        teleComments.setText(RecordsActivity.Info.teleComments);
    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData(){
        RecordsActivity.Info.teleNotes = teleNotesCount;
        RecordsActivity.Info.teleAmpNotes = teleAmpNotesCount;
        RecordsActivity.Info.teleSpeakerNotes = teleSpeakerNotesCount;
        RecordsActivity.Info.teleComments = teleComments.getText().toString();
    }
}

