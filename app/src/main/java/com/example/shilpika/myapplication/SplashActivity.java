package com.example.shilpika.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.shilpika.myapplication.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    ImageView mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mv=(ImageView)findViewById(R.id.image);
        final Intent intent =new Intent(SplashActivity.this, LanguageActivity.class);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        mv.startAnimation(myanim);
        Thread timer= new Thread()
        {
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
