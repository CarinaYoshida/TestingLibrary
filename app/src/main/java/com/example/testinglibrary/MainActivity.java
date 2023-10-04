package com.example.testinglibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.readmorelibrary.LogClass;
import com.example.testinglibrary.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogClass.printlog("estou escrevendo um pouco aqui");
    }
}