package com.example.scouting_app_2025;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qrgenearator.QRGEncoder;
import com.example.qrgenearator.QRGContents;

public class QrActivity extends AppCompatActivity {
    QRGEncoder qrgEncoder;
    Bitmap bitmap;
    ImageView qrImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        String json = RecordsActivity.Info.CreateJSON();
        qrImage = findViewById(R.id.qrImageView);
        qrgEncoder = new QRGEncoder(json, null, QRGContents.Type.TEXT, 200);
        try {
            // Getting QR-Code as Bitmap
            qrgEncoder.setColorBlack(this.getResources().getColor(R.color.darkGrey));
            qrgEncoder.setColorWhite(this.getResources().getColor(R.color.yellow));
            bitmap = qrgEncoder.getBitmap();
            qrImage.setImageBitmap(bitmap);
            // Setting Bitmap to ImageView
            qrImage.setImageBitmap(bitmap);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
