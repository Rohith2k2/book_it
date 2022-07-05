package com.example.book_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import org.w3c.dom.Document;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MovieActivity extends AppCompatActivity {

    EditText txtname, txtphone, txtmovie, txttheatre, txtseats, txttiming, txtdate;
    ImageButton print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        txtname=findViewById(R.id.textInputEditText6);
        txtphone=findViewById(R.id.textInputEditText5);
        txtmovie=findViewById(R.id.textInputEditText7);
        txttheatre=findViewById(R.id.textInputEditText8);
        txtseats=findViewById(R.id.textInputEditText9);
        txttiming=findViewById(R.id.textInputEditText10);
        txtdate=findViewById(R.id.textInputEditText11);
        print=findViewById(R.id.imageButton2);

        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txtname.getText().toString().trim();
                String phone = txtphone.getText().toString().trim();
                String movie = txtmovie.getText().toString().trim();
                String theatre = txttheatre.getText().toString().trim();
                String seats = txtseats.getText().toString().trim();
                String timing = txttiming.getText().toString().trim();
                String date = txtdate.getText().toString().trim();

                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putString("phone", phone);
                bundle.putString("movie", movie);
                bundle.putString("theatre", theatre);
                bundle.putString("seats", seats);
                bundle.putString("timing", timing);
                bundle.putString("date", date);

                Intent intent = new Intent(MovieActivity.this, MovieticketActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    }