package com.zeller.annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.HelloWorld;
import com.example.MyAnnotation;

@JPHelloWorld
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
