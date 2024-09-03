package com.example.lesson3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        final EditText number1EditText = findViewById(R.id.number1EditText);
        final EditText number2EditText = findViewById(R.id.number2EditText);
        final TextView resultTextView = findViewById(R.id.resultTextView);
        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(number1EditText.getText().toString());
                double number2 = Double.parseDouble(number2EditText.getText().toString());
                double result = number1 + number2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(number1EditText.getText().toString());
                double number2 = Double.parseDouble(number2EditText.getText().toString());
                double result = number1 - number2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(number1EditText.getText().toString());
                double number2 = Double.parseDouble(number2EditText.getText().toString());
                double result = number1 * number2;
                resultTextView.setText(String.valueOf(result));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(number1EditText.getText().toString());
                double number2 = Double.parseDouble(number2EditText.getText().toString());
                double result = number1 / number2;
                resultTextView.setText(String.valueOf(result));
            }
        });
    }
}