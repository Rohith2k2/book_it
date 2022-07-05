package com.example.book_it;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class MovieFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        Button btn5;
        btn5 = (Button) view.findViewById(R.id.button13);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), MovieActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt7;
        imgbt7=(ImageButton) view.findViewById(R.id.imageButton7);
        imgbt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), MovieActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}