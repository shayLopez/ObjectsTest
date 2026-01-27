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
    int shape, turncounter, rightcounter, wrongcounter, ranB;
    boolean diameter;
    Intent recieve;
    TextView info,Tvshape;
    Button b1, b2, b3;
    String rightAns = "";

;
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
        turncounter = 0;
        rightcounter = 0;
        wrongcounter = 0;
        if (shape == 1)
        {
            firstOpt();
            if (diameter)
            Tvshape.setText("Diameter of a square");
            else
                Tvshape.setText("Area of a Square");
        }
        else if (shape==2)
        {
            secOpt();
            if (diameter)
                Tvshape.setText("Diameter of a Triangular");
            else
                Tvshape.setText("Area of a Triangular");
        }
        else if (shape==3)
        {
            thiOpt();
            if (diameter)
                Tvshape.setText("Diameter of  acircle");
            else
                Tvshape.setText("Area of a circle");
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals(rightAns))
                    rightcounter++;
                else
                    wrongcounter++;
                if (shape == 1)
                    firstOpt();
                else if (shape==2)
                secOpt();
                else if (shape==3)
                    thiOpt();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals(rightAns))
                    rightcounter++;
                else
                    wrongcounter++;
                //if (wrongcounter+rightcounter==10)
                if (shape == 1)
                    firstOpt();
                else if (shape==2)
                    secOpt();
                else if (shape==3)
                    thiOpt();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals(rightAns))
                    rightcounter++;
                else
                    wrongcounter++;
                //if (wrongcounter+rightcounter==10)

                if (shape == 1)
                    firstOpt();
                else if (shape==2)
                    secOpt();
                else if (shape==3)
                    thiOpt();
            }
        });


    }

    public void firstOpt() {
        int base, hight, areaOrDiam, fakeanswear1, fakeanswear2;

        rightAns = "";
        base = (int) (Math.random() * 10) + 1;
        hight = (int) (Math.random() * 10) + 1;
        if (!diameter) {
            areaOrDiam = hight * base;
            fakeanswear1 = (int) (Math.random() * 100) + 1;
            while (fakeanswear1 == areaOrDiam)
                fakeanswear1 = (int) (Math.random() * 100) + 1;
            fakeanswear2 = (int) (Math.random() * 100) + 1;
            while (fakeanswear2 == fakeanswear1 || fakeanswear2 == areaOrDiam)
                fakeanswear2 = (int) (Math.random() * 100) + 1;
        } else {
            areaOrDiam = hight * 2 + base * 2;
            fakeanswear1 = ((int) (Math.random() * 10) + 1) * 2 + ((int) (Math.random() * 10) + 1) * 2;
            while (fakeanswear1 == areaOrDiam)
                fakeanswear1 = ((int) (Math.random() * 10) + 1) * 2 + ((int) (Math.random() * 10) + 1) * 2;
            fakeanswear2 = ((int) (Math.random() * 10) + 1) * 2 + ((int) (Math.random() * 10) + 1) * 2;
            while (fakeanswear2 == fakeanswear1 || fakeanswear2 == areaOrDiam)
                fakeanswear2 = ((int) (Math.random() * 10) + 1) * 2 + ((int) (Math.random() * 10) + 1) * 2;
        }
        rightAns = "" + areaOrDiam;
        ranB = (int) (Math.random() * 3);
        info.setText("hight: " + hight + "  base: " + base);
        if (ranB == 0) {
            b1.setText(String.valueOf(areaOrDiam));
            b2.setText(String.valueOf(fakeanswear1));
            b3.setText(String.valueOf(fakeanswear2));
        } else if (ranB == 1) {
            b1.setText(String.valueOf(fakeanswear1));
            b2.setText(String.valueOf(areaOrDiam));
            b3.setText(String.valueOf(fakeanswear2));
        } else {
            b1.setText(String.valueOf(fakeanswear1));
            b2.setText(String.valueOf(fakeanswear2));
            b3.setText(String.valueOf(areaOrDiam));
        }
    }

    public void secOpt()
    {   int ranB;
        String rightans="";
        double areaordiam;
        double base=(int)(Math.random() * 10) + 1;
        double hight=(int)(Math.random() * 10) + 1;
        double fakeanswer1,fakeasnwer2;
        if (diameter)
        {

            areaordiam=(hight*2+base);
            rightans=String.valueOf(areaordiam);
            fakeanswer1=(int)(Math.random() * 28) + 3;
            fakeasnwer2=(int) (Math.random() * 28) + 3;
            while (fakeanswer1==areaordiam)
                fakeanswer1=(int)(Math.random() * 28) + 3;
            while (fakeasnwer2==areaordiam||fakeasnwer2==fakeanswer1)
                fakeasnwer2=(int)(Math.random() * 28) + 3;

        }
        else
        {
            areaordiam=(hight*base)/2;
            rightans = String.valueOf(areaordiam);
            fakeanswer1=(int)(Math.random() * 50) + 1;
            fakeasnwer2=(int)(Math.random() * 50) + 1;
            while (fakeanswer1==areaordiam)
                fakeanswer1=(int)(Math.random() * 50) + 1;
            while (fakeasnwer2==areaordiam)
                fakeasnwer2=(int)(Math.random() * 50) + 1;
        }

        if (diameter)
            info.setText("base: "+base+" rib: "+hight);
        else
            info.setText("base: "+base+" hight: "+hight);
        ranB=(int) (Math.random()*3);
       if (ranB==0)
       {
           b1.setText(String.valueOf(areaordiam));
           b2.setText(String.valueOf(fakeanswer1));
           b3.setText(String.valueOf(fakeasnwer2));
       }
       else if (ranB==1)
       {
       b1.setText(String.valueOf(fakeanswer1));
       b2.setText(String.valueOf(areaordiam));
       b3.setText(String.valueOf(fakeasnwer2));
       }
       else
       {
           b1.setText(String.valueOf(fakeanswer1));
           b2.setText(String.valueOf(fakeasnwer2));
           b3.setText(String.valueOf(areaordiam));
       }
    }
    public void thiOpt()
    {
        int ranB;
        String rightAns="";
        double areaOrDiam;
        int radius=(int) (Math.random()*10)+1;
        double fakeAns1,fakeAns2;
        if (diameter)
        {
            areaOrDiam=Math.round((2*radius*3.14)*100.0)/100.0;
            fakeAns1=Math.round((((int)(Math.random()*20)+1)*3.14)*100.0)/100.0;
            fakeAns2=Math.round((((int)(Math.random()*20)+1)*3.14)*100.0)/100.0;
            while (fakeAns1==areaOrDiam)
                fakeAns1=Math.round((((int)(Math.random()*20)+1)*3.14)*100.0)/100.0;
            while (fakeAns2==fakeAns1||fakeAns2==areaOrDiam)
                fakeAns2=Math.round((((int)(Math.random()*20)+1)*3.14)*100.0)/100.0;

        }
        else
        {
            areaOrDiam=(radius*radius)*3.14;
            fakeAns1=(Math.pow((int)(Math.random()*10)+1,2))*3.14;
            fakeAns2=(Math.pow((int)(Math.random()*10)+1,2))*3.14;
            while (fakeAns1==areaOrDiam)
                fakeAns1=(Math.pow((int)(Math.random()*10)+1,2))*3.14;
            while (fakeAns2==areaOrDiam||fakeAns2==fakeAns1)
                fakeAns2=(Math.pow((int)(Math.random()*10)+1,2))*3.14;
        }
        ranB=(int) (Math.random()*3);
        if (ranB==0)
        {
            b1.setText(String.valueOf(areaOrDiam));
            b2.setText(String.valueOf(fakeAns1));
            b3.setText(String.valueOf(fakeAns2));
        }
        else if (ranB==1)
        {
            b1.setText(String.valueOf(fakeAns1));
            b2.setText(String.valueOf(areaOrDiam));
            b3.setText(String.valueOf(fakeAns2));
        }
        else if (ranB==2)
        {
            b1.setText(String.valueOf(fakeAns1));
            b2.setText(String.valueOf(fakeAns2));
            b3.setText(String.valueOf(areaOrDiam));
        }
        info.setText("Radius: "+radius);
    }

    public void initcomp()
    {
        recieve=getIntent();
        diameter=recieve.getExtras().getBoolean("diam");
        shape=recieve.getExtras().getInt("chosen");
        info=findViewById(R.id.infoOfShape);
        Tvshape=findViewById(R.id.Shape);
        b1=findViewById(R.id.option1);
        b2=findViewById(R.id.option2);
        b3=findViewById(R.id.option3);

    }
}