package com.zeller.annotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zeller.annotation.viewinject.ContentView;
import com.zeller.annotation.viewinject.InjectUtils;
import com.zeller.annotation.viewinject.OnClick;
import com.zeller.annotation.viewinject.ViewInject;

@ContentView(value = R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.btn_change)
    private Button btn_change;
    @ViewInject(R.id.tv_change)
    private TextView tv_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectUtils.inject(this);

    }

    @OnClick({R.id.btn_change,R.id.tv_change})
    public void dooo(View v) {
        tv_change.setText("change");
    }
}
