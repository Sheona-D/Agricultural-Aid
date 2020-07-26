package com.example.shilpika.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageButton;
import java.util.Locale;
public class LanguageActivity extends AppCompatActivity {

    ImageButton eng, mar, hin, pun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        eng=findViewById(R.id.imageButtonEng);
        mar=findViewById(R.id.imageButtonMar);
        hin=findViewById(R.id.imageButtonHin);
        pun=findViewById(R.id.imageButtonPun);

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocate("eng");
                recreate();
                final Intent intent =new Intent(LanguageActivity.this, SlideActivity.class);
                startActivity(intent);
            }
        });

        mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocate("mr");
                recreate();
                final Intent intent =new Intent(LanguageActivity.this, SlideActivity.class);
                startActivity(intent);
            }
        });

        hin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setLocate("hi");
                recreate();
                final Intent intent =new Intent(LanguageActivity.this, SlideActivity.class);
                startActivity(intent);
            }
        });

        pun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
                final Intent intent =new Intent(LanguageActivity.this, SlideActivity.class);
                startActivity(intent);
            }
        });
    }

    public void setLocate(String lang)
    {
        Locale locale= new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        //save data to shared preferences
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }
}
