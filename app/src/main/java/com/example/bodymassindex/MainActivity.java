package com.example.bodymassindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name, weight, height;
    TextView result;
    String bmiresult, cresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }

    public void checkresult(View view) {
        String user = name.getText().toString();
        String kg = weight.getText().toString();
        String meter = height.getText().toString();

        float weightvalue = Float.parseFloat(kg);
        float heightvalue = Float.parseFloat(meter) / 100;

        float bmi = weightvalue / (heightvalue * heightvalue);

        if(bmi<16){
            cresult = "Severly Under Weight";
        }
        else if(bmi<18.5){
            cresult = "Under Weight";
        }
        else if(bmi>=18.5 && bmi <=24.9){
            cresult = "Normal Weight";
        }
        else if(bmi>=25 && bmi <=29.9){
            cresult = "OverWeight";
        }else{
            cresult = "Obese";
        }

        bmiresult = "Hi!,   "+user+"\nYour BMI Result is:   "+cresult;

        result.setText(bmiresult);
    }
}