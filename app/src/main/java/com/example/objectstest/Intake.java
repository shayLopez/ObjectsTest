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
    int button;
    Button next;
    Intent go;
    RadioGroup group;
    boolean diam=false;

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
                if (group.getCheckedRadioButtonId()==B1.getId())
                    button=1;
                else if (group.getCheckedRadioButtonId()==B2.getId())
                    button=2;
                else if (group.getCheckedRadioButtonId()==B3.getId())
                    button=3;
                else if (group.getCheckedRadioButtonId()==B4.getId())
                    button=4;




go.putExtra("chosen",button);
go.putExtra("diam",diam);
startActivity(go);
            }
        });
        areaordiam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (areaordiam.isChecked())
                    diam=true;
                else
                    diam=false;


            }
        });
    }

    public  void intitcomp()
    {
        group=findViewById(R.id.group);
        B1=findViewById(R.id.radioButton);
        B2=findViewById(R.id.radioButton2);
        B3=findViewById(R.id.radioButton3);
        B4=findViewById(R.id.radioButton4);
        areaordiam=findViewById(R.id.switch1);
        next=findViewById(R.id.button2);
        go=new Intent(Intake.this,Test.class);
    }
}