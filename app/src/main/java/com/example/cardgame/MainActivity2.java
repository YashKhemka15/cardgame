package com.example.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t7;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        b1 = findViewById(R.id.b1);
        Intent intent=getIntent();
        int i1=intent.getIntExtra("i1",0);
        int i2=intent.getIntExtra("i2",0);
        int i3=intent.getIntExtra("i3",0);
        int i4=intent.getIntExtra("i4",0);
        int i5=intent.getIntExtra("i5",0);
        int[] A=new int[]{i1,i2,i3,i4,i5};
        Arrays.sort(A);
        t1.setText(""+A[0]);
        t2.setText(""+A[1]);
        t3.setText(""+A[2]);
        t4.setText(""+A[3]);
        t5.setText(""+A[4]);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent(MainActivity2.this,MainActivity.class);
                int sum=A[0]+A[1]+A[2]+A[3]+A[4];
                resultIntent.putExtra("v1", A[0]);
                resultIntent.putExtra("v2", A[1]);
                resultIntent.putExtra("v3", A[2]);
                resultIntent.putExtra("v4", A[3]);
                resultIntent.putExtra("v5", A[4]);
                resultIntent.putExtra("sum", sum);
                startActivity(resultIntent);
            }
            });
    }
}