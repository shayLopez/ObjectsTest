package com.example.objectstest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Display_Results extends AppCompatActivity {
    double rightcounter,wrongcounter;
    Intent recive;
   ListView listview;
    TextView tVresults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);

       inticomp();

        listview = findViewById(R.id.lvQuestions);
        ArrayList<Question> questions =
                (ArrayList<Question>) getIntent().getSerializableExtra("list");

        if (questions == null) {
            questions = new ArrayList<>();
        }

        ArrayAdapter<Question> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        questions);

        listview.setAdapter(adapter);
        tVresults.setText("Right: "+rightcounter+"        wrong: "+wrongcounter+"\n\n    Score: "+Math.round((rightcounter/(rightcounter+wrongcounter))*10000)/100+"%");
    }
    public void inticomp()
    {
     recive=getIntent();
     rightcounter=recive.getExtras().getDouble("rightcount");
     wrongcounter=recive.getExtras().getDouble("wrongcount");

     tVresults=findViewById(R.id.resultsTv);
    }
}

