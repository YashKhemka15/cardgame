package com.example.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t7;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t7 = findViewById(R.id.t7);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        Random randomObj = new Random();
        int i1 = randomObj.nextInt(6)+1;
        int i2=randomObj.nextInt(6)+1;
        int i3 = randomObj.nextInt(6)+1;
        int i4 = randomObj.nextInt(6)+1;
        int i5 = randomObj.nextInt(6)+1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t1.setText(""+i1);
                t2.setText(""+i2);
                t3.setText(""+i3);
                t4.setText(""+i4);
                t5.setText(""+i5);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("i1",i1);
                intent.putExtra("i2",i2);
                intent.putExtra("i3",i3);
                intent.putExtra("i4",i4);
                intent.putExtra("i5",i5);
                startActivity(intent);

            }
        });
        Intent intent1=getIntent();
        int o1=intent1.getIntExtra("v1",0);
        int o2=intent1.getIntExtra("v2",0);
        int o3=intent1.getIntExtra("v3",0);
        int o4=intent1.getIntExtra("v4",0);
        int o5=intent1.getIntExtra("v5",0);
        int o6=intent1.getIntExtra("sum",0);
        t1.setText(""+o1);
        t2.setText(""+o2);
        t3.setText(""+o3);
        t4.setText(""+o4);
        t5.setText(""+o5);
        t7.setText(""+o6);
            }
        }