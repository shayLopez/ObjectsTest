package com.example.objectstest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Test extends AppCompatActivity {
    ArrayList<Question> alQuestions=new ArrayList<>();
    int  shape ,turncounter, rightcounter, wrongcounter, ranB;
    IntakeInfo infoIntake;
    boolean diameter;
    Intent recieve,finish;
    TextView info,Tvshape;
    Button b1, b2, b3,fB;
    String rightAns = "";
    ImageView shapeIlu;
    Question q;


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
            Tvshape.setText("Perimeter of a square");
            else
                Tvshape.setText("Area of a Square");
        }
        else if (shape==2)
        {
            secOpt();
            if (diameter)
                Tvshape.setText("Perimeter of a Triangular");
            else
                Tvshape.setText("Area of a Triangular");
        }
        else if (shape==3)
        {
            thiOpt();
            if (diameter)
                Tvshape.setText("Perimeter of  a circle");
            else
                Tvshape.setText("Area of a circle");
        }
        else
        {
            foOpt();
        if (diameter)
        {
            Tvshape.setText("Perimeter of trapezium");
        }
        else
        {
            Tvshape.setText("Area of Trapezium");
        }
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q=new Question();
                if (b1.getText().toString().equals(rightAns))
                {
                    //questions.set(rightcounter+wrongcounter,"right");
                    rightcounter++;
                    q.setRight(true);
                }else {
                    //questions.set(rightcounter+wrongcounter,)
                    wrongcounter++;
                    q.setRight(false);

                }
                q.setYourAnswer(Integer.valueOf(b1.getText().toString()));
                q.setRightAnswer(Integer.valueOf(rightAns));

                q.setText(info.getText().toString());

                alQuestions.add(q);

                if (shape == 1)
                    firstOpt();
                else if (shape==2)
                secOpt();
                else if (shape==3)
                    thiOpt();
                else
                    foOpt();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q=new Question();
                if (b2.getText().toString().equals(rightAns))
                {
                    rightcounter++;
                    q.setRight(true);}
                else
                {
                    wrongcounter++;
                q.setRight(false);
                }
                //if (wrongcounter+rightcounter==10)
                q.setYourAnswer(Integer.valueOf(b1.getText().toString()));
                q.setRightAnswer(Integer.valueOf(rightAns));

                q.setText(info.getText().toString());

                alQuestions.add(q);
                if (shape == 1)
                    firstOpt();
                else if (shape==2)
                    secOpt();
                else if (shape==3)
                    thiOpt();
                else
                    foOpt();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q=new Question();
                if (b3.getText().toString().equals(rightAns))
                {
                    q.setRight(true);
                    rightcounter++;
                }
                else
                {
                    q.setRight(false);
                    wrongcounter++;
                }
                //if (wrongcounter+rightcounter==10)
                q.setYourAnswer(Integer.valueOf(b1.getText().toString()));
                q.setRightAnswer(Integer.valueOf(rightAns));

                q.setText(info.getText().toString());
                Toast.makeText(getApplicationContext(), q.toString(), Toast.LENGTH_SHORT).show();
                alQuestions.add(q);
                if (shape == 1)
                    firstOpt();
                else if (shape==2)
                    secOpt();
                else if (shape==3)
                    thiOpt();
                else
                    foOpt();
            }
        });

 fB.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {

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
        if (hight == base)
        {
            shapeIlu.setImageResource(R.drawable.square);
        info.setText("A= " + hight);
    }
        else if (hight>base)
        {
        shapeIlu.setImageResource(R.drawable.rectangle);
            info.setText("A= " + base + "  B= " + hight);
        }
        else
        {
            shapeIlu.setImageResource(R.drawable.rectangle2);
            info.setText("A= " + base + "  B= " + hight);

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

        if (diameter) {
            if (base==hight)
            {
                shapeIlu.setImageResource(R.drawable.triangle1peri);
                info.setText("A= " + base );
            }
            else if (base>hight)
            {
            shapeIlu.setImageResource(R.drawable.longtriangle);
                info.setText("A= " + base + " B= " + hight);
            }
            else {
                shapeIlu.setImageResource(R.drawable.triangle2peri);
                info.setText("A= " + base + " B= " + hight);
            }

        }
        else
        {
            if (base==hight)
                shapeIlu.setImageResource(R.drawable.triangle1);

            else if (base>hight)
            shapeIlu.setImageResource(R.drawable.longtriangle2);

            else
                shapeIlu.setImageResource(R.drawable.triangle2);

            info.setText("A= " + base + " B= " + hight);
        }

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
        info.setText("R = "+radius);
        shapeIlu.setImageResource(R.drawable.circle);
    }
    public void foOpt() {
        int ranB;
        String rightAns = "";
        double baseDown = (int) (Math.random() * 10) + 1;
        double baseUp = (int) (Math.random() * 10) + 1;
        while (baseUp == baseDown)
            baseUp = (int) (Math.random() * 10) + 1;
        double hight = (int) (Math.random() * 10) + 1;
        double areaOrDiam;
        double fakeAns1, fakeAns2;
        if (diameter) {
            areaOrDiam = hight * 2 + baseDown + baseUp;
            fakeAns1 = (int) (Math.random() * 39) + 1;
            fakeAns2 = (int) (Math.random() * 39) + 1;
            while (fakeAns1 == fakeAns2 || fakeAns1 == areaOrDiam || fakeAns2 == areaOrDiam) {
                fakeAns1 = (int) (Math.random() * 39) + 1;
                fakeAns2 = (int) (Math.random() * 39) + 1;
            }
        } else {
            areaOrDiam = ((baseUp + baseDown) * hight) / 2;
            fakeAns1 = ((((int) (Math.random() * 10) + 1) + ((int) (Math.random() * 9) + 1)) * ((int) (Math.random() * 10) + 1)) / 2;
            fakeAns2 = ((((int) (Math.random() * 10) + 1) + ((int) (Math.random() * 9) + 1)) * ((int) (Math.random() * 10) + 1)) / 2;
            while (fakeAns1 == fakeAns2 || fakeAns1 == areaOrDiam || fakeAns2 == areaOrDiam) {
                fakeAns1 = ((((int) (Math.random() * 10) + 1) + ((int) (Math.random() * 9) + 1)) * ((int) (Math.random() * 10) + 1)) / 2;
                fakeAns2 = ((((int) (Math.random() * 10) + 1) + ((int) (Math.random() * 9) + 1)) * ((int) (Math.random() * 10) + 1)) / 2;
            }
        }
        ranB = (int) (Math.random() * 3);
        if (ranB == 0) {
            b1.setText(String.valueOf(areaOrDiam));
            b2.setText(String.valueOf(fakeAns1));
            b3.setText(String.valueOf(fakeAns2));
        } else if (ranB == 1) {
            b1.setText(String.valueOf(fakeAns1));
            b2.setText(String.valueOf(areaOrDiam));
            b3.setText(String.valueOf(fakeAns2));
        } else if (ranB == 2) {
            b1.setText(String.valueOf(fakeAns1));
            b2.setText(String.valueOf(fakeAns2));
            b3.setText(String.valueOf(areaOrDiam));
        }
        if (diameter)
        {
        if (baseDown>baseUp)
            shapeIlu.setImageResource(R.drawable.trapeziumperi);
        else
            shapeIlu.setImageResource(R.drawable.trapezium2per);
        }
        else
        {
            if (baseDown>baseUp)
                shapeIlu.setImageResource(R.drawable.trapezium);
            else
                shapeIlu.setImageResource(R.drawable.trapezium2);
        }
        info.setText("A= " + baseDown + "   B= " + hight + "   C= " + baseUp);

    }


    public void initcomp()
    {
        recieve=getIntent();
        infoIntake= (IntakeInfo) recieve.getSerializableExtra("intakeInfo");
        diameter=recieve.getExtras().getBoolean("intakeInfo");
        shape=recieve.getExtras().getInt("chosen");
        info=findViewById(R.id.infoOfShape);
        Tvshape=findViewById(R.id.Shape);
        b1=findViewById(R.id.option1);
        b2=findViewById(R.id.option2);
        b3=findViewById(R.id.option3);
        fB=findViewById(R.id.button3);
        finish=new Intent(Test.this,Display_Results.class);
        shapeIlu=findViewById(R.id.imageView4);

    }
}