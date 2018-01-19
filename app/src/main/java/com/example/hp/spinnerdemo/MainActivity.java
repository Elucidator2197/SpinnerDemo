package com.example.hp.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spin;
    TextView tv1;
    String courses[]={"B.TECH.","BCA","MCA","M.TECH.","B.Pharma","M.Pharma"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin=(Spinner)findViewById(R.id.spin);
        tv1=(TextView)findViewById(R.id.tv1);
        ArrayAdapter a1=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,courses);
        spin.setAdapter(a1);
    }
    public void show(View v)
    {
        String a=spin.getSelectedItem().toString();
        tv1.setText(a);
    }
}
