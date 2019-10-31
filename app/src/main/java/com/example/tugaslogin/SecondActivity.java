package com.example.tugaslogin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//public class SecondActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);
//
//
//    }
//
//}
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnPindahHalaman = findViewById(R.id.btnPindahHalaman);
        Button btnShare = findViewById(R.id.btnShare);

        btnPindahHalaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
//                startActivity(new Intent(SecondActivity.this, ThreeActivity.class));
                String url = "https://badoystudio.com" ;
                Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
                bukabrowser.setData(Uri. parse(url));
                startActivity(bukabrowser);
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Explicit untuk berpindah ke SecondActivity
                startActivity(new Intent(SecondActivity.this, ThreeActivity.class));
            }
        });
    }
}
