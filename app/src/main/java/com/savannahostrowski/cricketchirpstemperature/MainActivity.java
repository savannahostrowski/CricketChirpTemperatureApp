package com.savannahostrowski.cricketchirpstemperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText etNumberOfChirps;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        etNumberOfChirps = findViewById(R.id.etNumberOfChirps);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setVisibility(View.INVISIBLE);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numChirps = Integer.parseInt(etNumberOfChirps.getText().toString().trim());

                float temperature = (numChirps / 3) + 4;
                String text = "The temperature is: " + temperature;
                tvResult.setText(text);
                tvResult.setVisibility(View.VISIBLE);
            }
        });



    }
}
