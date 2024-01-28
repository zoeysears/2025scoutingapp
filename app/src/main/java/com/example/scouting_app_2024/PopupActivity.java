package com.example.scouting_app_2024;

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
    public void backStage(View view){
        Intent next = new Intent(this, StageActivity.class);
        startActivity(next);
        //saveData();
    }
}
