package com.savannahostrowski.cricketchirpstemperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText etNumberOfChirps;
    TextView tvResult;
    DecimalFormat formatter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        etNumberOfChirps = findViewById(R.id.etNumberOfChirps);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setVisibility(View.INVISIBLE);

        formatter = new DecimalFormat("#0.0");

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNumberOfChirps.getText().toString().isEmpty()) {
                    tvResult.setVisibility(View.INVISIBLE);
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    int numChirps = Integer.parseInt(etNumberOfChirps.getText().toString().trim());

                    double temperature = (numChirps / 3.0) + 4;
                    String text = "The approximate temperature is: " + temperature;
                    tvResult.setText(text);
                    tvResult.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
