package com.example.user.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DebateAdapter extends ArrayAdapter<Debate> {

    public DebateAdapter(Context context, List<Debate> debates) {
        super(context, 0, debates);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.debate_list_item, parent, false);


        }

        Debate currentDebate = getItem(position);


        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section);

        sectionTextView.setText(currentDebate.getSection());

        TextView articleTextView = (TextView) listItemView.findViewById(R.id.article_name);

        articleTextView.setText(currentDebate.getArticle());

        String separate[] = currentDebate.getTime().split("T");

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_published);
        String formattedDate = formatDate(separate[0]);

        dateTextView.setText(formattedDate);

        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_name);

        if (currentDebate.getAuthor() == null)
            authorTextView.setText("");
        else
            authorTextView.setText(currentDebate.getAuthor());

        return listItemView;

    }


    private String formatDate(String date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date testDate = null;
        try {
            testDate = sdf.parse(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SimpleDateFormat formatter = new SimpleDateFormat("LLL dd, yyyy");
        String newFormat = formatter.format(testDate);


        return newFormat;


    }
}
