package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class converterFragment extends Fragment {
View view;
EditText usdEditeTExt;
TextView BDTTExtView;
Button converterBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_converter, container, false);
        usdEditeTExt = view.findViewById(R.id.USDEditTextID);
        BDTTExtView = view.findViewById(R.id.bdtoutputTextVIewID);
        converterBtn=view.findViewById(R.id.bdtConverterBtnid);

       converterBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Double usd,bdt;
               usd=Double.parseDouble(usdEditeTExt.getText().toString());

               bdt=usd*106;
               BDTTExtView.setText("BDT= "+ usd);
           }
       });
        return view;
    }
}