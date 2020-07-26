package com.example.shilpika.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class IconsActivity extends AppCompatActivity {

    private ImageButton tomato, potato, cotton, grape, orange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icons);

        tomato = findViewById(R.id.imageButton2);
        potato = findViewById(R.id.imageButton3);
        cotton = findViewById(R.id.imageButton4);
        grape= findViewById(R.id.imageButton5);
        orange = findViewById(R.id.imageButton6);

        tomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IconsActivity.this, CalcActivity.class);
                intent.putExtra("intVariableName", view.getId()); //where v is button that is cliked, you will find it as a parameter to onClick method
                startActivity(intent);
            }
        });

        potato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IconsActivity.this, CalcActivity.class);
                intent.putExtra("intVariableName", view.getId()); //where v is button that is cliked, you will find it as a parameter to onClick method
                startActivity(intent);
            }
        });


        cotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IconsActivity.this, CalcActivity.class);
                intent.putExtra("intVariableName", view.getId()); //where v is button that is cliked, you will find it as a parameter to onClick method
                startActivity(intent);
            }
        });


        grape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IconsActivity.this, CalcActivity.class);
                intent.putExtra("intVariableName", view.getId()); //where v is button that is cliked, you will find it as a parameter to onClick method
                startActivity(intent);
            }
        });


        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IconsActivity.this, CalcActivity.class);
                intent.putExtra("intVariableName", view.getId()); //where v is button that is cliked, you will find it as a parameter to onClick method
                startActivity(intent);
            }
        });


    }
}
