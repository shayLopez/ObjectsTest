package com.example.objectstest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Intake extends AppCompatActivity {
    Switch areaordiam;
    Button next;
    Intent go;

RadioButton B1,B2,B3,B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intake);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        intitcomp();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public  void intitcomp()
    {
        B1=findViewById(R.id.radioButton);
        B2=findViewById(R.id.radioButton2);
        B3=findViewById(R.id.radioButton3);
        B4=findViewById(R.id.radioButton4);
        areaordiam=findViewById(R.id.switch1);
        next=findViewById(R.id.button2);
        go=new Intent(Intake.this,Test.class);
    }
}