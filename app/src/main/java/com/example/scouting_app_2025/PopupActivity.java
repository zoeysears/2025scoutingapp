package com.example.scouting_app_2025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PopupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
    }

    /**
     * Moves the xml/page back to stage
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void backStage(View view){
        Intent next = new Intent(this, StageActivity.class);
        startActivity(next);
    }

    /**
     * Moves the xml/page to qr
     *
     * @param view Makes the method viewable to the xml and allows you to assign the method to a button
     */
    public void toQr(View view){
        Intent next = new Intent(this, QrActivity.class);
        startActivity(next);
    }
}
