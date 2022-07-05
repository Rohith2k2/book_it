package com.example.book_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class FlightActivity extends AppCompatActivity {

    EditText txtname, txtphone, txtdep, txtarr, txtseats, txttiming, txtdate;
    ImageButton print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);

        txtname=findViewById(R.id.textInputEditText32);
        txtphone=findViewById(R.id.textInputEditText31);
        txtdep=findViewById(R.id.textInputEditText33);
        txtarr=findViewById(R.id.textInputEditText34);
        txtseats=findViewById(R.id.textInputEditText35);
        txttiming=findViewById(R.id.textInputEditText36);
        txtdate=findViewById(R.id.textInputEditText37);
        print=findViewById(R.id.imageButton4);

        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txtname.getText().toString().trim();
                String phone = txtphone.getText().toString().trim();
                String dep = txtdep.getText().toString().trim();
                String arr = txtarr.getText().toString().trim();
                String seats = txtseats.getText().toString().trim();
                String timing = txttiming.getText().toString().trim();
                String date = txtdate.getText().toString().trim();

                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putString("phone", phone);
                bundle.putString("dep", dep);
                bundle.putString("arr", arr);
                bundle.putString("seats", seats);
                bundle.putString("timing", timing);
                bundle.putString("date", date);

                Intent intent = new Intent(FlightActivity.this, FlightticketActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}