package com.example.scouting_app_2025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TeleActivity extends AppCompatActivity {
    CheckBox diedCheck, brokeCheck, defenseCheck;

    TextView teleNotesCountText, teleAmpNotesCountText, teleSpeakerNotesCountText;
    TextView teleLevel4CountText, teleLevel3CountText, teleLevel2CountText, teleTroughCountText;

    TextView teleNetCountText, teleProcessorCountText, teleTORCountText;
    byte teleNetCount, teleProcessorCount, teleTORCount;

    byte teleLevel4Count, teleLevel3Count, teleLevel2Count, teleTroughCount;

    byte teleNotesCount, teleAmpNotesCount, teleSpeakerNotesCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tele);

        brokeCheck = findViewById(R.id.brokeCheckBox);
        defenseCheck = findViewById(R.id.defenseCheckBox);
        diedCheck = findViewById(R.id.diedCheckBox);

        teleLevel4CountText = findViewById(R.id.teleLevel4CountText);
        teleLevel3CountText = findViewById(R.id.teleLevel3CountText);
        teleLevel2CountText = findViewById(R.id.teleLevel2CountText);
        teleTroughCountText = findViewById(R.id.teleTroughCountText);

        teleNetCountText = findViewById(R.id.teleNetCountText);
        teleProcessorCountText = findViewById(R.id.teleProcessorCountText);
        teleTORCountText = findViewById(R.id.teleTORCountText);
        setPrevious();
    }

    /**
     * Increments the notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleIncrementNotes(View view) {
        teleNotesCount++;
        teleNotesCountText.setText(String.valueOf(teleNotesCount));
    }

    public void teleIncrementLevel4(View view) {
        if (teleLevel4Count < 12)
            teleLevel4Count++;
        teleLevel4CountText.setText(String.valueOf((teleLevel4Count)));
    }

    public void teleIncrementLevel3(View view) {
        if (teleLevel3Count < 12)
            teleLevel3Count++;
        teleLevel3CountText.setText(String.valueOf((teleLevel3Count)));
    }

    public void teleIncrementLevel2(View view) {
        if (teleLevel2Count < 12)
            teleLevel2Count++;
        teleLevel2CountText.setText(String.valueOf((teleLevel2Count)));
    }

    public void teleIncrementTrough(View view) {
        teleTroughCount++;
        teleTroughCountText.setText(String.valueOf((teleTroughCount)));
    }

    public void teleIncrementTOR(View view) {
        if (teleTORCount < 6)
            teleTORCount++;
        teleTORCountText.setText(String.valueOf((teleTORCount)));
    }

    public void teleIncrementNet(View view) {
        teleNetCount++;
        teleNetCountText.setText(String.valueOf((teleNetCount)));
    }

    public void teleIncrementProcessor(View view) {
        teleProcessorCount++;
        teleProcessorCountText.setText(String.valueOf((teleProcessorCount)));
    }


    /**
     * Decrements the notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleDecrementNotes(View view) {
        if (teleNotesCount != 0 && teleSpeakerNotesCount + teleAmpNotesCount < teleNotesCount) {
            teleNotesCount--;
            teleNotesCountText.setText(String.valueOf(teleNotesCount));
        }
    }

    /**
     * Increments the amp notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleIncrementAmpNotes(View view) {
        if (teleAmpNotesCount + teleSpeakerNotesCount < teleNotesCount) {
            teleAmpNotesCount++;
            teleAmpNotesCountText.setText(String.valueOf(teleAmpNotesCount));
        }
    }

    /**
     * Decrements the amp notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleDecrementAmpNotes(View view) {
        if (teleAmpNotesCount != 0) {
            teleAmpNotesCount--;
            teleAmpNotesCountText.setText(String.valueOf(teleAmpNotesCount));
        }
    }


    public void teleDecrementLevel4(View view) {
        if (teleLevel4Count != 0) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            teleLevel4Count--;
            teleLevel4CountText.setText(String.valueOf(teleLevel4Count));
        }
    }

    public void teleDecrementLevel3(View view) {
        if (teleLevel3Count != 0) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            teleLevel3Count--;
            teleLevel3CountText.setText(String.valueOf(teleLevel3Count));
        }
    }

    public void teleDecrementLevel2(View view) {
        if (teleLevel2Count != 0) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            teleLevel2Count--;
            teleLevel2CountText.setText(String.valueOf(teleLevel2Count));
        }
    }

    public void teleDecrementTrough(View view) {
        if (teleTroughCount != 0) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            teleTroughCount--;
            teleTroughCountText.setText(String.valueOf(teleTroughCount));
        }
    }

    public void teleDecrementTOR(View view) {
        if (teleTORCount != 0) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            teleTORCount--;
            teleTORCountText.setText(String.valueOf(teleTORCount));
        }
    }

    public void teleDecrementNet(View view) {
        if (teleNetCount != 0) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            teleNetCount--;
            teleNetCountText.setText(String.valueOf(teleNetCount));
        }
    }

    public void teleDecrementProcessor(View view) {
        if (teleProcessorCount != 0) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            teleProcessorCount--;
            teleProcessorCountText.setText(String.valueOf(teleProcessorCount));
        }
    }


    /**
     * Increments the speaker notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleIncrementSpeakerNotes(View view) {
        if (teleAmpNotesCount + teleSpeakerNotesCount < teleNotesCount) {
            teleSpeakerNotesCount++;
            teleSpeakerNotesCountText.setText(String.valueOf(teleSpeakerNotesCount));
        }
    }

    /**
     * Decrements the speaker notes count and updates the text
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void teleDecrementSpeakerNotes(View view) {
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
    public void backReef(View view) {
        Intent next = new Intent(this, AutoReefActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Moves the xml/page to stage
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toStage(View view) {
        Intent next = new Intent(this, StageActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Sets all values to the ones in RecordsActivity so pages don't change whenever you switch between them
     */
    public void setPrevious() {
        diedCheck.setChecked(RecordsActivity.Info.died);
        defenseCheck.setChecked(RecordsActivity.Info.defense);
        brokeCheck.setChecked(RecordsActivity.Info.broke);

        teleLevel4Count = RecordsActivity.Info.teleLevel4;
        teleLevel4CountText.setText(String.valueOf(teleLevel4Count));

        teleLevel3Count = RecordsActivity.Info.teleLevel3;
        teleLevel3CountText.setText(String.valueOf(teleLevel3Count));

        teleLevel2Count = RecordsActivity.Info.teleLevel2;
        teleLevel2CountText.setText(String.valueOf(teleLevel2Count));

        teleTroughCount = RecordsActivity.Info.teleTrough;
        teleTroughCountText.setText(String.valueOf(teleTroughCount));

        teleNetCount = RecordsActivity.Info.teleNet;
        teleNetCountText.setText(String.valueOf(teleNetCount));

        teleProcessorCount = RecordsActivity.Info.teleProcessor;
        teleProcessorCountText.setText(String.valueOf(teleProcessorCount));

        teleTORCount = RecordsActivity.Info.teleTOR;
        teleTORCountText.setText(String.valueOf(teleTORCount));
    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData() {
        RecordsActivity.Info.teleLevel4 = teleLevel4Count;
        RecordsActivity.Info.teleLevel3 = teleLevel3Count;
        RecordsActivity.Info.teleLevel2 = teleLevel2Count;
        RecordsActivity.Info.teleTrough = teleTroughCount;

        RecordsActivity.Info.teleNet = teleNetCount;
        RecordsActivity.Info.teleProcessor = teleProcessorCount;
        RecordsActivity.Info.teleTOR = teleTORCount;

        RecordsActivity.Info.defense = defenseCheck.isChecked();
        RecordsActivity.Info.died = diedCheck.isChecked();
        RecordsActivity.Info.broke = brokeCheck.isChecked();


    }
}

