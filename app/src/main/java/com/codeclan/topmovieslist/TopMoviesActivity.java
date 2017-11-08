package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMoviesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movies_list);
        TopMovies topMovies = new TopMovies();
        ArrayList<Movie> movieList = topMovies.getList();

        TopMoviesAdapter movieAdapter = new TopMoviesAdapter(this, movieList);
        ListView listView = (ListView)findViewById(R.id.movie_list);
        listView.setAdapter(movieAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.add_movie){
            Intent intent = new Intent(this, AddMovieActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void getMovie(View listItem){
        Movie movie = (Movie) listItem.getTag();
        Intent i = new Intent(this, MovieActivity.class);
        i.putExtra("title", movie.getTitle());
        i.putExtra("rank", movie.getRanking().toString());
        i.putExtra("year", movie.getYear().toString());
        startActivity(i);

    }
}
