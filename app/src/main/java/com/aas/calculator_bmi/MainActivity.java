package com.aas.calculator_bmi;

import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        TextView resultText = findViewById(R.id.text_view_result);

        RadioButton radioButtonMale = findViewById(R.id.radio_button_male);
        RadioButton radioButtonFemale = findViewById(R.id.radio_button_female);

        EditText editTextHeightFeet = findViewById(R.id.edit_text_height_feet);
        EditText editTextHeightInches = findViewById(R.id.edit_text_height_inches);
        EditText editTextWeight = findViewById(R.id.edit_text_weight);
        EditText editTextAge = findViewById(R.id.edit_text_age);

        Button calculateButton = findViewById(R.id.button_calculate);
    }
}