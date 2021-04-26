

package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button milesToKilometer= (Button) findViewById(R.id.milesToKilometer);
        milesToKilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextMiles= (EditText) findViewById(R.id.editTextMiles);
                EditText editTextKM= (EditText) findViewById(R.id.editTextKM);
                double vMiles= Double.valueOf(editTextMiles.getText().toString());
                double vKM= vMiles/0.62137;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                editTextKM.setText(formatVal.format(vKM));
            }
        });
        Button kmToMiles= (Button) findViewById(R.id.kmToMiles);
        milesToKilometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextMiles= (EditText) findViewById(R.id.editTextMiles);
                EditText editTextKM= (EditText) findViewById(R.id.editTextKM);
                double vKM= Double.valueOf(editTextKM.getText().toString());
                double vMiles= vKM*0.62137;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                editTextMiles.setText(formatVal.format(vMiles));
            }
        });
    }
}