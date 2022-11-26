package com.example.muhammad_c0861455_bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight, height;
    TextView resultText;
    String calculation, BMIResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resultText = findViewById(R.id.result);
    }

    public void calculateBMI(View view) {
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2) / 100;

        float bmi = weightValue / (heightValue * heightValue);


        if (bmi < 16) {
            BMIResult = "Severely Under Weight";
        } else if (bmi < 18.5) {
            BMIResult = "Under Weight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            BMIResult = "Normal Weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            BMIResult = "Overweight";
        } else {
            BMIResult = "Obesity";
        }

        calculation = "Result:\n" + bmi + "\n" + BMIResult;

        resultText.setText(calculation);
    }

}

