package com.example.scouting_app_2024;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);
    }
    /**
     * Moves the xml/page back to main
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void backTele(View view){
        Intent next = new Intent(this, TeleActivity.class);
        startActivity(next);
        //saveData();
    }

    /**
     * Moves the xml/page to tele
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toPopup(View view){
        Intent next = new Intent(this, PopupActivity.class);
        startActivity(next);
        //saveData();
    }
}
