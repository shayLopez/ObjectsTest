package com.example.objectstest;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Display_Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_results);

        ListView listView = findViewById(R.id.lvQuestions);

        ArrayList<Question> questions =
                (ArrayList<Question>) getIntent().getSerializableExtra("list");

        if (questions == null) {
            questions = new ArrayList<>();
        }

        ArrayAdapter<Question> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        questions);

        listView.setAdapter(adapter);
    }
}

