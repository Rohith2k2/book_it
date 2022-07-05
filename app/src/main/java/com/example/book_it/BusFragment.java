package com.example.book_it;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class BusFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bus, container, false);
        Button btn6;
        btn6 = (Button) view.findViewById(R.id.button);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), BusActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt8;
        imgbt8=(ImageButton) view.findViewById(R.id.imageButton8);
        imgbt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), MovieActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}