package com.example.scouting_app_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText scoutName, matchNumber, teamNumber;
    RadioButton red1 , red2, red3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        matchNumber = findViewById(R.id.matchNumberEditText);
        scoutName = findViewById(R.id.scoutNameEditText);
        teamNumber = findViewById(R.id.teamNumberEditText);
    }
    public void toAuto(View view){
        Intent next = new Intent(this, AutoActivity.class);
        startActivity(next);
        saveData();
    }
    public void saveData(){
        EditText editTeamNumberText = findViewById(R.id.teamNumberEditText);
        EditText editMatchNumberText = findViewById(R.id.matchNumberEditText);
        EditText editScoutNameText = findViewById(R.id.scoutNameEditText);
    }
}