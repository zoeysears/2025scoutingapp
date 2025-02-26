package com.example.scouting_app_2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;


import androidx.appcompat.app.AppCompatActivity;

public class AutoReefActivity extends AppCompatActivity {
    CheckBox aCheck, bCheck, cCheck, dCheck, eCheck, fCheck, gCheck, hCheck, iCheck, jCheck,kCheck, lCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reef);

        aCheck = findViewById(R.id.aCheckBox);
        bCheck = findViewById(R.id.bCheckBox);
        cCheck = findViewById(R.id.cCheckBox);
        dCheck = findViewById(R.id.dCheckBox);
        eCheck = findViewById(R.id.eCheckBox);
        fCheck = findViewById(R.id.fCheckBox);
        gCheck = findViewById(R.id.gCheckBox);
        hCheck = findViewById(R.id.hCheckBox);
        iCheck = findViewById(R.id.iCheckBox);
        jCheck = findViewById(R.id.jCheckBox);
        kCheck = findViewById(R.id.kCheckBox);
        lCheck = findViewById(R.id.lCheckBox);

        setPrevious();
    }


    /**
     * Moves the xml/page back to main
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void backAuto(View view){
        Intent next = new Intent(this, AutoActivity.class);
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
        aCheck.setChecked(RecordsActivity.Info.aCheck);
        bCheck.setChecked(RecordsActivity.Info.bCheck);
        cCheck.setChecked(RecordsActivity.Info.cCheck);
        dCheck.setChecked(RecordsActivity.Info.dCheck);
        eCheck.setChecked(RecordsActivity.Info.eCheck);
        fCheck.setChecked(RecordsActivity.Info.fCheck);

        gCheck.setChecked(RecordsActivity.Info.gCheck);
        hCheck.setChecked(RecordsActivity.Info.hCheck);
        iCheck.setChecked(RecordsActivity.Info.iCheck);
        jCheck.setChecked(RecordsActivity.Info.jCheck);
        kCheck.setChecked(RecordsActivity.Info.kCheck);
        lCheck.setChecked(RecordsActivity.Info.lCheck);

    }

    /**
     * Stores all current data in RecordsActivity
     */
    public void saveData(){

        RecordsActivity.Info.aCheck = aCheck.isChecked();
        RecordsActivity.Info.bCheck = bCheck.isChecked();
        RecordsActivity.Info.cCheck = cCheck.isChecked();
        RecordsActivity.Info.dCheck = dCheck.isChecked();
        RecordsActivity.Info.eCheck = eCheck.isChecked();
        RecordsActivity.Info.fCheck = fCheck.isChecked();
        RecordsActivity.Info.gCheck = gCheck.isChecked();
        RecordsActivity.Info.hCheck = hCheck.isChecked();
        RecordsActivity.Info.iCheck = iCheck.isChecked();
        RecordsActivity.Info.jCheck = jCheck.isChecked();
        RecordsActivity.Info.kCheck = kCheck.isChecked();
        RecordsActivity.Info.lCheck = lCheck.isChecked();


    }
}
