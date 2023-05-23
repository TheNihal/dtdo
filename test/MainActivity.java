package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
    Spinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner=findViewById(R.id.mySpinnerID);
        ArrayAdapter <CharSequence> myAdapter= ArrayAdapter.createFromResource(this,R.array.spinnerArray, android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i==1){
            //load BMI Fragment at frameLayoutID
            replaceFragment(new bmiFragment());
        }
        else if(i==2){
            //load BMI Fragment at frameLayoutID
            replaceFragment(new converterFragment());
        }
        else {
            Toast.makeText(this, "Select First", Toast.LENGTH_SHORT).show();
        }

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frameLayoutID,fragment);
        ft.commit();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}