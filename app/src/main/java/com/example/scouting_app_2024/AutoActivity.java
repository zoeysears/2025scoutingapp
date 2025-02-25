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
    TextView autoLevel4CountText, autoLevel3CountText, autoLevel2CountText, autoTroughCountText;

    byte autoLevel4Count, autoLevel3Count, autoLevel2Count, autoTroughCount;
    TextView autoNetCountText, autoProcessorCountText, autoTORCountText;
    byte autoNotesCount, autoAmpNotesCount, autoSpeakerNotesCount;

    byte autoNetCount, autoProcessorCount, autoTORCount;
    EditText autoComments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        autoLevel4CountText = findViewById(R.id.autoLevel4CountText);
        autoLevel3CountText = findViewById(R.id.autoLevel3CountText);
        autoLevel2CountText = findViewById(R.id.autoLevel2CountText);
        autoTroughCountText = findViewById(R.id.autoTroughCountText);

        leaveCheck = findViewById(R.id.leaveCheckBox);

        autoTORCountText = findViewById(R.id.autoTORCountText);
        autoNetCountText = findViewById(R.id.autoNetCountText);
        autoProcessorCountText = findViewById(R.id.autoProcessorCountText);

//        autoNotesCountText = findViewById(R.id.autoTORCountText2);
//        autoAmpNotesCountText = findViewById(R.id.autoProcessorCountText3);
//        autoSpeakerNotesCountText = findViewById(R.id.autoNetCountText2);
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

    public void autoIncrementLevel4(View view) {
        if(autoLevel4Count < 12)
        autoLevel4Count++;
        autoLevel4CountText.setText(String.valueOf((autoLevel4Count)));
    }

    public void autoIncrementLevel3(View view) {
        if(autoLevel3Count < 12)
            autoLevel3Count++;
        autoLevel3CountText.setText(String.valueOf((autoLevel3Count)));
    }

    public void autoIncrementLevel2(View view) {
        if(autoLevel2Count < 12)
            autoLevel2Count++;
        autoLevel2CountText.setText(String.valueOf((autoLevel2Count)));
    }

    public void autoIncrementTrough(View view) {
        autoTroughCount++;
        autoTroughCountText.setText(String.valueOf((autoTroughCount)));
    }

    public void autoIncrementTOR(View view) {
        if(autoTORCount < 6)
            autoTORCount++;
        autoTORCountText.setText(String.valueOf((autoTORCount)));
    }

    public void autoIncrementNet(View view) {
        autoNetCount++;
        autoNetCountText.setText(String.valueOf((autoNetCount)));
    }

    public void autoIncrementProcessor(View view) {
        autoProcessorCount++;
        autoProcessorCountText.setText(String.valueOf((autoProcessorCount)));
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

    public void autoDecrementLevel4(View view) {
        if (autoLevel4Count != 0 ) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            autoLevel4Count--;
            autoLevel4CountText.setText(String.valueOf(autoLevel4Count));
        }
    }

    public void autoDecrementLevel3(View view) {
        if (autoLevel3Count != 0 ) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            autoLevel3Count--;
            autoLevel3CountText.setText(String.valueOf(autoLevel3Count));
        }
    }

    public void autoDecrementLevel2(View view) {
        if (autoLevel2Count != 0 ) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            autoLevel2Count--;
            autoLevel2CountText.setText(String.valueOf(autoLevel2Count));
        }
    }
    public void autoDecrementTrough(View view) {
        if (autoTroughCount != 0 ) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            autoTroughCount--;
            autoTroughCountText.setText(String.valueOf(autoTroughCount));
        }
    }

    public void autoDecrementTOR(View view) {
        if (autoTORCount != 0 ) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            autoTORCount--;
            autoTORCountText.setText(String.valueOf(autoTORCount));
        }
    }
    public void autoDecrementNet(View view) {
        if (autoNetCount != 0 ) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            autoNetCount--;
            autoNetCountText.setText(String.valueOf(autoNetCount));
        }
    }

    public void autoDecrementProcessor(View view) {
        if (autoProcessorCount != 0 ) { //&& autoAmpNotesCount+autoSpeakerNotesCount<autoNotesCoun
            autoProcessorCount--;
            autoProcessorCountText.setText(String.valueOf(autoProcessorCount));
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
        autoLevel4Count = RecordsActivity.Info.autoLevel4;
        autoLevel4CountText.setText(String.valueOf(autoLevel4Count));

        autoLevel3Count = RecordsActivity.Info.autoLevel3;
        autoLevel3CountText.setText(String.valueOf(autoLevel3Count));

        autoLevel2Count = RecordsActivity.Info.autoLevel2;
        autoLevel2CountText.setText(String.valueOf(autoLevel2Count));

        autoTroughCount = RecordsActivity.Info.autoTrough;
        autoTroughCountText.setText(String.valueOf(autoTroughCount));

        autoNetCount = RecordsActivity.Info.autoNet;
        autoNetCountText.setText(String.valueOf(autoNetCount));

        autoProcessorCount = RecordsActivity.Info.autoProcessor;
        autoProcessorCountText.setText(String.valueOf(autoProcessorCount));

        autoTORCount = RecordsActivity.Info.autoTOR;
        autoTORCountText.setText(String.valueOf(autoTORCount));


//        autoNotesCountText.setText(String.valueOf(autoNotesCount));
//        autoAmpNotesCount = RecordsActivity.Info.autoAmpNotes;
//        autoAmpNotesCountText.setText(String.valueOf(autoAmpNotesCount));
//        autoSpeakerNotesCount = RecordsActivity.Info.autoSpeakerNotes;
//        autoSpeakerNotesCountText.setText(String.valueOf(autoSpeakerNotesCount));
    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData(){

        RecordsActivity.Info.leave = leaveCheck.isChecked();

        RecordsActivity.Info.autoLevel4 = autoLevel4Count;
        RecordsActivity.Info.autoLevel3 = autoLevel3Count;
        RecordsActivity.Info.autoLevel2 = autoLevel2Count;
        RecordsActivity.Info.autoTrough = autoTroughCount;

        RecordsActivity.Info.autoNet = autoNetCount;
        RecordsActivity.Info.autoProcessor = autoProcessorCount;
        RecordsActivity.Info.autoTOR = autoTORCount;

//        RecordsActivity.Info.autoNotes = autoNotesCount;
//        RecordsActivity.Info.autoAmpNotes = autoAmpNotesCount;
//        RecordsActivity.Info.autoSpeakerNotes = autoSpeakerNotesCount;
    }
}
