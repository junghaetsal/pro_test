package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GPShomeActivity extends AppCompatActivity {


    private Button now_lo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps_home);

        now_lo=findViewById(R.id.now_lo);
        now_lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(GPShomeActivity.this,GPSnowActivity.class);
                startActivity(intent);//액티비티 이동

            }
        });
    }
}
