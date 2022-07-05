package com.example.book_it;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class FlightFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_flight, container, false);
        Button btn8;
        btn8 = (Button) view.findViewById(R.id.button14);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), FlightActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt8;
        imgbt8=(ImageButton) view.findViewById(R.id.imageButton20);
        imgbt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), FlightActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}