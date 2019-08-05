package com.example.macroadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dash extends AppCompatActivity {

    ImageView propic;
    CardView employee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);



        propic = findViewById(R.id.propicd);

        propic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dash.this, profile.class);
                startActivity(intent);
            }
        });

        employee = findViewById(R.id.employee);

        propic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dash.this, profile.class);
                startActivity(intent);
            }
        });
    }
}
