package com.example.book_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class BusActivity extends AppCompatActivity {

    EditText txtname, txtphone, txtdep, txtarr, txtseats, txttiming, txtdate;
    ImageButton print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        txtname=findViewById(R.id.textInputEditText22);
        txtphone=findViewById(R.id.textInputEditText21);
        txtdep=findViewById(R.id.textInputEditText23);
        txtarr=findViewById(R.id.textInputEditText24);
        txtseats=findViewById(R.id.textInputEditText25);
        txttiming=findViewById(R.id.textInputEditText26);
        txtdate=findViewById(R.id.textInputEditText27);
        print=findViewById(R.id.imageButton3);

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

                Intent intent = new Intent(BusActivity.this, BusticketActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}