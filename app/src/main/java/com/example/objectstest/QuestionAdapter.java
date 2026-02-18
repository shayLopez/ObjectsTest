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
        TextView tvName = convertView.findViewById(R.id.question);
        ImageView imgHero = convertView.findViewById(R.id.imageView3);

        // 4. מוחקים וכותבים חדש (setText)
        //tvName.setText(.getName());
        //imgHero.setImageResource(hero.getImageId());

        // 5. מגישים את הלוח המוכן
        return convertView;
    }
}
