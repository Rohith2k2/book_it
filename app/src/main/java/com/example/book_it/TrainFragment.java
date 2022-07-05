package com.example.book_it;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class TrainFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_train, container, false);
        Button btn9;
        btn9 = (Button) view.findViewById(R.id.button3);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), TrainActivity.class);
                startActivity(in);
            }
        });

        ImageButton imgbt9;
        imgbt9=(ImageButton) view.findViewById(R.id.imagebutton22);
        imgbt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), TrainActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}