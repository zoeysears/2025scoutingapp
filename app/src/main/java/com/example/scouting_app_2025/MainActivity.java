package com.example.scouting_app_2025;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
//for some reason when you switch between pages more than once the position resets
public class MainActivity extends AppCompatActivity {
    CheckBox preloadCheck;
    EditText scoutName, matchNumber, teamNumber;
    RadioButton blue1, blue2, blue3, pos1, pos2, pos3, pos4, pos5, pos6;
    RadioButton[] positions;
    int checkedPosition = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoutName = findViewById(R.id.scoutNameEditText);
        matchNumber = findViewById(R.id.matchNumberEditText);
        teamNumber = findViewById(R.id.teamNumberEditText);
        preloadCheck = findViewById(R.id.preloadCheckBox);
        blue1 = findViewById(R.id.blueOneRadioButton);
        blue2 = findViewById(R.id.blueTwoRadioButton);
        blue3 = findViewById(R.id.blueThreeRadioButton);
        pos1 = findViewById(R.id.fieldPositionOne);
        pos2 = findViewById(R.id.fieldPositionTwo);
        pos3 = findViewById(R.id.fieldPositionThree);
        pos4 = findViewById(R.id.fieldPositionFour);
        pos5 = findViewById(R.id.fieldPositionFive);
        pos6 = findViewById(R.id.fieldPositionSix);

        positions = new RadioButton[]{pos1,pos2,pos3,pos4, pos5, pos6};
        setPrevious();
    }

    /**
     * Moves the xml/page to auto
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toAuto(View view){
        Intent next = new Intent(this, AutoActivity.class);
        startActivity(next);
        saveData();
    }

    /**
     * Clears all the field positions
     */
    private void clearPositions(){
        for(RadioButton pos: positions){
            pos.setChecked(false);
        }
    }

    /**
     * Acts as a radio group by only allowing you to select one radio button
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
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

    /**
     * Sets all values to the ones in RecordsActivity so pages don't change whenever you switch between them
     */
    public void setPrevious(){
        scoutName.setText(RecordsActivity.Info.scoutName);
        matchNumber.setText(RecordsActivity.Info.matchNumber);
        teamNumber.setText(RecordsActivity.Info.teamNumber);
        preloadCheck.setChecked(RecordsActivity.Info.preload);
        switch (RecordsActivity.Info.driverStation) {
            case 1:
                blue1.setChecked(true);
                break;
            case 2:
                blue2.setChecked(true);
                break;
            case 3:
                blue3.setChecked(true);
                break;
            default:
                blue1.setChecked(false);
                blue2.setChecked(false);
                blue3.setChecked(false);
                break;
        }

        switch (RecordsActivity.Info.fieldPosition){
            case 1:
                pos1.setChecked(true);
                break;
            case 2:
                pos2.setChecked(true);
                break;
            case 3:
                pos3.setChecked(true);
                break;
            case 4:
                pos4.setChecked(true);
                break;
            case 5:
                pos5.setChecked(true);
                break;
            case 6:
                pos6.setChecked(true);
                break;
            default:
                clearPositions();
                break;
        }
    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData(){
        RecordsActivity.Info.scoutName = scoutName.getText().toString();
        RecordsActivity.Info.matchNumber = matchNumber.getText().toString();
        RecordsActivity.Info.teamNumber = teamNumber.getText().toString();
        RecordsActivity.Info.preload = preloadCheck.isChecked();
        if(blue1.isChecked()){
            RecordsActivity.Info.driverStation = 1;
        } else if (blue2.isChecked()){
            RecordsActivity.Info.driverStation = 2;
        } else if (blue3.isChecked()){
            RecordsActivity.Info.driverStation = 3;
        } else {
            RecordsActivity.Info.driverStation = 0;
        }
        switch (checkedPosition){
            case 0:
                RecordsActivity.Info.fieldPosition = 1;
                break;
            case 1:
                RecordsActivity.Info.fieldPosition = 2;
                break;
            case 2:
                RecordsActivity.Info.fieldPosition = 3;
                break;
            case 3:
                RecordsActivity.Info.fieldPosition = 4;
                break;
            case 4:
                RecordsActivity.Info.fieldPosition = 5;
                break;
            case 5:
                RecordsActivity.Info.fieldPosition = 6;
                break;
            default:
                RecordsActivity.Info.fieldPosition = 0;
                break;

        }
    }
}