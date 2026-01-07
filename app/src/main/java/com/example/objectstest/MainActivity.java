package com.example.objectstest;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nextB;
    ImageView rotating;
    CountDownTimer cdt;
    Intent gotonext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initcomp();
       cdt=new CountDownTimer(5000,1000) {
           @Override
           public void onFinish() {
               startActivity(gotonext);
           }

           @Override
           public void onTick(long millisUntilFinished) {
               rotating.animate().rotation(720f).setDuration(millisUntilFinished);

           }
       }.start();
        nextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cdt.cancel();
                startActivity(gotonext);
            }
        });
    }
    public  void initcomp()
    {
        rotating=findViewById(R.id.rotateIv);
        nextB=findViewById(R.id.button);
        gotonext=new Intent(MainActivity.this,Intake.class);
    }
}