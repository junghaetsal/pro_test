package com.example.project1;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button ROA_button;
    private Button GPS_button;
    private Button Friend_button;
    private Button Setting_button;

    private Button test_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        test_button = findViewById(R.id.test_button);
        test_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                LoginText LT = (LoginText) getApplicationContext();
                AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
                builder.setTitle("제목");
                builder.setMessage(LT.getID());
                builder.setNeutralButton("취소", null);
                builder.create().show();
            }
        });


        ROA_button = findViewById(R.id.ROA_button); //ROA 버튼
        ROA_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ROAhomeActivity.class);
                startActivity(intent);
            }
        });

        GPS_button = findViewById(R.id.GPS_button); //GPS 버튼
        GPS_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GPShomeActivity.class);
                startActivity(intent);
            }
        });

        Friend_button = findViewById(R.id.Friend_button); //친구 버튼
        Friend_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FriendhomeActivity.class);
                startActivity(intent);
            }
        });

        Setting_button = findViewById(R.id.Setting_button); //설정 버튼
        Setting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}
