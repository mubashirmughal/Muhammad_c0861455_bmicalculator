package com.example.muhammad_c0861455_bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight , height;
    TextView resultText;
    String calculation , bmiResult;

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

        double weightValue = Double.parseDouble(S1);
        double heightValue = Double.parseDouble(S2) / 100;

        double bmi = weightValue / (heightValue * heightValue);

        calculation = "Result\n\n" + bmi + "\n" + bmiResult;
        resultText.setText(calculation);
    }
}