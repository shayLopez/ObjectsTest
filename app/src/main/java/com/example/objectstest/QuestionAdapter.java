package com.example.objectstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionAdapter extends ArrayAdapter<Question> {
    public QuestionAdapter (Context context, ArrayList<Question> list)
    {
        super(context,0,list);
    }

    public View getView(int pos, View convertView, ViewGroup parent) {

        // 1. את מי מציגים עכשיו? (השם החדש)
        Question q = getItem(pos);

        // 2. האם יש לנו לוח למחזור?
        if (convertView == null) {
            // לא? אז קונים לוח חדש (Inflation)
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_question, parent, false);
        }

        // 3. מוצאים את המקום לכתוב בו
        TextView question = convertView.findViewById(R.id.question);
        TextView yAnswear= convertView.findViewById(R.id.yanswear);
        TextView rAnswear= convertView.findViewById(R.id.ranswear);
        ImageView img = convertView.findViewById(R.id.imageView3);

        // 4. מוחקים וכותבים חדש (setText)
        question.setText("Question: "+q.getText());
        yAnswear.setText("You answer: "+q.getYourAnswer());
        rAnswear.setText("Right answer: "+q.getRightAnswer());
        if (q.isRight())
        img.setImageResource(R.drawable.right);
        else
            img.setImageResource(R.drawable.wrong);

        // 5. מגישים את הלוח המוכן
        return convertView;
    }
}
