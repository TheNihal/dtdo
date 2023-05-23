package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class bmiFragment extends Fragment {
    View view;
    EditText weightText, heightText;
    TextView outputView;
    Button converBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_bmi, container, false);
        weightText = view.findViewById(R.id.weightEditTextID);
        heightText = view.findViewById(R.id.heightEditTextID);
        outputView = view.findViewById(R.id.outputTextVIewID);
        converBtn=view.findViewById(R.id.bmiBtnid);
        converBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double weight,height,bmi;
                weight=Double.parseDouble(weightText.getText().toString());
                height=Double.parseDouble(heightText.getText().toString());
                bmi=weight/(height*height);
                outputView.setText("BMI"+ bmi);
                Toast.makeText(getActivity(), "Thank you", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}