package com.example.book_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class TrainActivity extends AppCompatActivity {

    EditText txtname, txtphone, txtdep, txtarr, txtseats, txttiming, txtdate;
    ImageButton print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        txtname=findViewById(R.id.textInputEditText42);
        txtphone=findViewById(R.id.textInputEditText41);
        txtdep=findViewById(R.id.textInputEditText43);
        txtarr=findViewById(R.id.textInputEditText44);
        txtseats=findViewById(R.id.textInputEditText45);
        txttiming=findViewById(R.id.textInputEditText46);
        txtdate=findViewById(R.id.textInputEditText47);
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

                Intent intent = new Intent(TrainActivity.this, TrainticketActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}