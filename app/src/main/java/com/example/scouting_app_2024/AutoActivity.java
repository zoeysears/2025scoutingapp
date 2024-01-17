package com.example.scouting_app_2024;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AutoActivity extends AppCompatActivity {
    //assign all primitive variables to RecordsActivity.Info counterparts
    CheckBox leaveCheck;
    boolean leave;
    TextView autoNotesCountText, autoAmpNotesCountText, autoSpeakerNotesCountText;
    int autoNotesCount, autoAmpNotesCount, autoSpeakerNotesCount;
    EditText comments;
    String autoComments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        autoNotesCountText = findViewById(R.id.autoNotesCountTextView);
        autoAmpNotesCountText = findViewById(R.id.autoAmpNotesCountTextView);
        autoSpeakerNotesCountText = findViewById(R.id.autoSpeakerNotesCountTextView);
        leaveCheck = findViewById(R.id.leaveCheckBox);

    }

    public void autoIncrementNotes(View view){
        autoNotesCount++;
        autoNotesCountText.setText(String.valueOf(autoNotesCount));
    }
    public void autoDecrementNotes(View view){
        autoNotesCount--;
        autoNotesCountText.setText(String.valueOf(autoNotesCount));
    }
    public void autoIncrementAmpNotes(View view){
        autoAmpNotesCount++;
        autoAmpNotesCountText.setText(String.valueOf(autoAmpNotesCount));
    }
    public void autoDecrementAmpNotes(View view){
        autoAmpNotesCount--;
        autoAmpNotesCountText.setText(String.valueOf(autoAmpNotesCount));
    }
    public void autoIncrementSpeakerNotes(View view){
        autoSpeakerNotesCount++;
        autoSpeakerNotesCountText.setText(String.valueOf(autoSpeakerNotesCount));
    }
    public void autoDecrementSpeakerNotes(View view){
        autoSpeakerNotesCount--;
        autoSpeakerNotesCountText.setText(String.valueOf(autoSpeakerNotesCount));
    }
    public void backMain(View view){
        Intent next = new Intent(this, MainActivity.class);
        startActivity(next);
        saveData();
    }
    public void toTele(View view){
        Intent next = new Intent(this, TeleActivity.class);
        startActivity(next);
        saveData();
    }
    public void saveData(){

    }
}
