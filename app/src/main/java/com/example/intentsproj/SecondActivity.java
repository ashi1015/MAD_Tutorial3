package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView Num_11 = findViewById(R.id.textView4);
        TextView Num_22 = findViewById(R.id.textView6);

        Button plus = findViewById(R.id.button_plus);
        Button minus = findViewById(R.id.button_minus);
        Button multiply = findViewById(R.id.button_multiply);
        Button division = findViewById(R.id.button_division);


        Intent i = getIntent();
        final int num_01 = i.getIntExtra("val1",0);
        final int num_02 = i.getIntExtra("val2",0);

        Num_11.setText(String.valueOf(num_01));
        Num_22.setText(String.valueOf(num_02));

        //Adding 2 numbers
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.result_txtbox);


                int final_1 = num_01 + num_02;
                answer.setText(String.valueOf(num_01 +" + "+ num_02 +"= " +final_1));


            }
        });


        //Substracting 2 numbers
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.result_txtbox);


                int final_1 = num_01 - num_02;
                answer.setText(String.valueOf(num_01 +" - "+ num_02 +"= " +final_1));
            }
        });

        //multiplying 2 numbers
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.result_txtbox);


                int final_1 = num_01 * num_02;
                answer.setText(String.valueOf(num_01 +" * "+ num_02 +"= " +final_1));
            }
        });


        //dividing 2 numbers
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView answer = findViewById(R.id.result_txtbox);


                int final_1 = num_01 / num_02;
                answer.setText(String.valueOf(num_01 +" / "+ num_02 +"= " +final_1));
            }
        });

    }
}