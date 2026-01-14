package com.example.objectstest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Test extends AppCompatActivity {
    int shape,turncounter,rightcounter,wrongcounter,ranB;
    boolean diameter;
    Intent recieve;
    TextView info;
    Button b1,b2,b3;
    String rightAns="";



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
    public void firstOpt()
    { int base,hight,areaOrDiam,fakeanswear1,fakeanswear2;



            rightAns="";
            base = (int) (Math.random() * 10) + 1;
            hight = (int) (Math.random() * 10) + 1;
            if (!diameter)
            {
                areaOrDiam = hight * base;
                fakeanswear1 = (int) (Math.random() * 100) + 1;
                while (fakeanswear1 == areaOrDiam)
                    fakeanswear1 = (int) (Math.random() * 100) + 1;
                fakeanswear2 = (int) (Math.random() * 100) + 1;
                while (fakeanswear2 == fakeanswear1 || fakeanswear2 == areaOrDiam)
                    fakeanswear2 = (int) (Math.random() * 100) + 1;
            }
            else
            {
                areaOrDiam=hight*2+base*2;
                fakeanswear1=((int) (Math.random()*10)+1)*2+((int) (Math.random()*10)+1)*2;
                while (fakeanswear1==areaOrDiam)
                    fakeanswear1=((int) (Math.random()*10)+1)*2+((int) (Math.random()*10)+1)*2;
                fakeanswear2=((int) (Math.random()*10)+1)*2+((int) (Math.random()*10)+1)*2;
                while (fakeanswear2==fakeanswear1||fakeanswear2==areaOrDiam)
                    fakeanswear2=((int) (Math.random()*10)+1)*2+((int) (Math.random()*10)+1)*2;
            }
            rightAns=""+areaOrDiam;
            ranB=(int) (Math.random()*3);
            info.setText("hight: "+hight+"  base: "+base);
            if (ranB==0)
                {
                    b1.setText(areaOrDiam);
                    b2.setText(fakeanswear1);
                    b3.setText(fakeanswear2);


                }
            else if (ranB==1)
            {
                    b1.setText(fakeanswear1);
                    b2.setText(areaOrDiam);
                    b3.setText(fakeanswear2);

            }
            else
            {
                b1.setText(fakeanswear1);
                b2.setText(fakeanswear2);
                b3.setText(areaOrDiam);
            }
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (b1.toString().equals(rightAns))
                        rightcounter++;
                    else
                        wrongcounter++;


                }
            });



    }
    public void initcomp()
    {
        recieve=getIntent();
        diameter=recieve.getExtras().getBoolean("diam");
        shape=recieve.getExtras().getInt("chosen");
        info=findViewById(R.id.infoOfShape);
        b1=findViewById(R.id.option1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.option3);

    }
}