package com.example.objectstest;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Test extends AppCompatActivity {
    int shape,turncounter,rightcounter,wrongcounter;
    boolean diameter;
    Intent recieve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_test);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initcomp();
        turncounter=0;
        rightcounter=0;
        wrongcounter=0;
        while (turncounter!=10)
        {
            turncounter++;
        }

    }
    public void initcomp()
    {
        recieve=getIntent();
        diameter=recieve.getExtras().getBoolean("diam");
        shape=recieve.getExtras().getInt("chosen");
    }
}