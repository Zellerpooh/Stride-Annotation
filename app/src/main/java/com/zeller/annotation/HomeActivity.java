package com.zeller.annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.MyAnnotation;

public class HomeActivity extends AppCompatActivity {

    @MyAnnotation("onCreate")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @MyAnnotation("print method")
    private String print(){
        return "print!";
    }
}
