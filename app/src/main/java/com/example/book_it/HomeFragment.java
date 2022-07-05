package com.example.book_it;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btn2;
        btn2=(Button) view.findViewById(R.id.button6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), MovieActivity.class);
                startActivity(in);
            }
        });

        Button btn3;
        btn3=(Button) view.findViewById(R.id.button7);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), TrainActivity.class);
                startActivity(in);
            }
        });

        Button btn4;
        btn4=(Button) view.findViewById(R.id.button9);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), BusActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt1;
        imgbt1=(ImageButton) view.findViewById(R.id.imageButton4);
        imgbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), MovieActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt2;
        imgbt2=(ImageButton) view.findViewById(R.id.imageButton8);
        imgbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), MovieActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt3;
        imgbt3=(ImageButton) view.findViewById(R.id.imageButton9);
        imgbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), TrainActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt4;
        imgbt4=(ImageButton) view.findViewById(R.id.imageButton10);
        imgbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), TrainActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt5;
        imgbt5=(ImageButton) view.findViewById(R.id.imageButton11);
        imgbt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), BusActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt6;
        imgbt6=(ImageButton) view.findViewById(R.id.imageButton12);
        imgbt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), BusActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}