package com.aas.calculator_bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Class Variables are also called 'fields'
    private TextView resultText;
    private Button calculateButton;
    private RadioButton radioButtonMale;
    private RadioButton radioButtonFemale;
    private EditText editTextHeightFeet;
    private EditText editTextHeightInches;
    private EditText editTextWeight;
    private EditText editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonListener();
    }
    
    private void findViews(){
        resultText = findViewById(R.id.text_view_result);
        radioButtonMale = findViewById(R.id.radio_button_male);
        radioButtonFemale = findViewById(R.id.radio_button_female);
        editTextHeightFeet = findViewById(R.id.edit_text_height_feet);
        editTextHeightInches = findViewById(R.id.edit_text_height_inches);
        editTextWeight = findViewById(R.id.edit_text_weight);
        editTextAge = findViewById(R.id.edit_text_age);
        calculateButton = findViewById(R.id.button_calculate);

    }
    private void setupButtonListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBmi();
            }
        });
    }

    private void calculateBmi() {
        String TextHeightFeet = editTextHeightFeet.getText().toString();
        String TextHeightInches = editTextHeightInches.getText().toString();
        String TextWeight = editTextWeight.getText().toString();
        String TextAge = editTextAge.getText().toString();

        resultText.setText("Age: "+TextAge + " | Feet: " + TextHeightFeet + " | Inches: " + TextHeightInches+" | Weight: " + TextWeight);
    }

}