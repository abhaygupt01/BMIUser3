package com.example.bmiuser;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtresult;
    EditText edtwight, edtHightFt,edthightIn;
    Button btnCalculate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtresult = (TextView) findViewById(R.id.textResult);

        edtwight = findViewById(R.id.edtweight);
        edtHightFt = findViewById(R.id.edthightFt);
        edthightIn = findViewById(R.id.edthightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtresult = findViewById(R.id.textResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt = Integer.parseInt(edtwight.getText().toString());
             int ft = Integer.parseInt(edtHightFt.getText().toString());
              int in = Integer.parseInt(edthightIn.getText().toString());

              int totalIn = ft*12 +in;

              double totalCm = totalIn*2.53;
              double totalm = totalCm/100;

              double bmi = wt/(totalm*totalm);
              if (bmi>25){
                 txtresult.setText("You Are OverWeight");
              }else if (bmi<18){
                  txtresult.setText("You Are UnderWeight");
              }else {
                  txtresult.setText("You Are Healthy");
              }



            }
        });


    }
}