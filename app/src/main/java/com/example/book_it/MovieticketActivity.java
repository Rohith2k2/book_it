package com.example.book_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MovieticketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movieticket);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String phone = bundle.getString("phone");
        String movie = bundle.getString("movie");
        String theatre = bundle.getString("theatre");
        String seats = bundle.getString("seats");
        String timing = bundle.getString("timing");
        String date = bundle.getString("date");

        TextView Name = findViewById(R.id.textView2);
        TextView Movie = findViewById(R.id.textView9);
        TextView Theatre = findViewById(R.id.textView11);
        TextView Seats = findViewById(R.id.textView13);
        TextView Timing = findViewById(R.id.textView15);
        TextView Date = findViewById(R.id.textView17);

        Name.setText(name);
        Movie.setText(movie);
        Theatre.setText(theatre);
        Seats.setText(seats);
        Timing.setText(timing);
        Date.setText(date);
    }
}