package com.example.scouting_app_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText scoutName, matchNumber, teamNumber;
    RadioButton red1, red2, red3, pos1, pos2, pos3, pos4;
    RadioButton[] positions;
    int checkedPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoutName = findViewById(R.id.scoutNameEditText);
        matchNumber = findViewById(R.id.matchNumberEditText);
        teamNumber = findViewById(R.id.teamNumberEditText);
        red1 = findViewById(R.id.redOneRadioButton);
        red2 = findViewById(R.id.redTwoRadioButton);
        red3 = findViewById(R.id.redThreeRadioButton);
        pos1 = findViewById(R.id.fieldPositionOne);
        pos2 = findViewById(R.id.fieldPositionTwo);
        pos3 = findViewById(R.id.fieldPositionThree);
        pos4 = findViewById(R.id.fieldPositionFour);
        positions = new RadioButton[]{pos1,pos2,pos3,pos4};
        scoutName.setText(RecordsActivity.Info.scoutName);
        matchNumber.setText(RecordsActivity.Info.matchNumber);
        teamNumber.setText(RecordsActivity.Info.teamNumber);
        switch (RecordsActivity.Info.driverStation) {
            case 1:
                red1.setChecked(true);
            case 2:
                red2.setChecked(true);
            case 3:
                red3.setChecked(true);
            default:
                red1.setChecked(false);
                red2.setChecked(false);
                red3.setChecked(false);
        }
        switch (RecordsActivity.Info.fieldPosition){
            case 1:
                pos1.setChecked(true);
            case 2:
                pos2.setChecked(true);
            case 3:
                pos3.setChecked(true);
            case 4:
                pos4.setChecked(true);
            default:
                pos1.setChecked(false);
                pos2.setChecked(false);
                pos3.setChecked(false);
                pos4.setChecked(false);
        }
    }
    public void toAuto(View view){
        Intent next = new Intent(this, AutoActivity.class);
        startActivity(next);
        saveData();
    }
    private void clearPositions(){
        pos1.setChecked(false);
        pos2.setChecked(false);
        pos3.setChecked(false);
        pos4.setChecked(false);
    }
    public void clicked(View view) {
        for(int i = 0; i < positions.length;i++) {
            if(positions[i].isChecked()) {
                if(checkedPosition != i) {
                    checkedPosition = i;
                    break;
                }
            }
        }
        clearPositions();
        positions[checkedPosition].setChecked(true);
    }
    public void saveData(){
        RecordsActivity.Info.scoutName = scoutName.getText().toString();
        RecordsActivity.Info.matchNumber = matchNumber.getText().toString();
        RecordsActivity.Info.teamNumber = teamNumber.getText().toString();
        if(red1.isChecked()){
            RecordsActivity.Info.driverStation = 1;
        } else if (red2.isChecked()){
            RecordsActivity.Info.driverStation = 2;
        } else if (red3.isChecked()){
            RecordsActivity.Info.driverStation = 3;
        }
        if (pos1.isChecked()){
            RecordsActivity.Info.fieldPosition = 1;
        } else if (pos2.isChecked()){
            RecordsActivity.Info.fieldPosition = 2;
        } else if (pos3.isChecked()){
            RecordsActivity.Info.fieldPosition = 3;
        } else if (pos4.isChecked()){
            RecordsActivity.Info.fieldPosition = 4;
        }
    }
}