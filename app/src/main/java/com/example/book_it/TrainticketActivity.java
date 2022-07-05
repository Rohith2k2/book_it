package com.example.book_it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TrainticketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainticket);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String phone = bundle.getString("phone");
        String dep = bundle.getString("dep");
        String arr = bundle.getString("arr");
        String seats = bundle.getString("seats");
        String timing = bundle.getString("timing");
        String date = bundle.getString("date");

        TextView Name = findViewById(R.id.textView82);
        TextView Dep = findViewById(R.id.textView89);
        TextView Arr = findViewById(R.id.textView91);
        TextView Seats = findViewById(R.id.textView93);
        TextView Timing = findViewById(R.id.textView95);
        TextView Date = findViewById(R.id.textView97);

        Name.setText(name);
        Dep.setText(dep);
        Arr.setText(arr);
        Seats.setText(seats);
        Timing.setText(timing);
        Date.setText(date);
    }
}