package com.example.scouting_app_2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class QrActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        String json = RecordsActivity.Info.CreateJSON();
    }

    /**
     * Moves the xml/page to main
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toMain(View view){
        Intent next = new Intent(this, MainActivity.class);
        startActivity(next);
        RecordsActivity.Info.clear();
    }
}
