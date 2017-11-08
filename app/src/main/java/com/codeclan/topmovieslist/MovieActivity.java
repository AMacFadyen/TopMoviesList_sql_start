package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieActivity extends AppCompatActivity {


    TextView titleText;
    TextView rankText;
    TextView yearText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        Bundle extras = getIntent().getExtras();
        String title = extras.getString("title");
        String rank = extras.getString("rank");
        String year = extras.getString("year");
        titleText = (TextView)findViewById(R.id.title_view);
        titleText.setText(title);
        rankText = (TextView)findViewById(R.id.rank_view);
        rankText.setText(rank);
        yearText = (TextView)findViewById(R.id.year_view);
        yearText.setText(year);

    }

    public void deleteMovie(View button){

    }
}
