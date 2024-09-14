package com.example.addtwovalues;

import android.annotation.SuppressLint;
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

    Button btnCompute, btnClear;
    TextView txtTotal;
    EditText v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Code Start Here.

        v1 = findViewById(R.id.EditTextText);
        v2 = findViewById(R.id.EditTextText1);
        btnCompute = findViewById(R.id.button1);
        btnClear = findViewById(R.id.button2);

        btnCompute.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI1n")
            @Override
            public void onClick(View view) {
                Double num1, num2, total;
                num1 = Double.parseDouble(v1.getText().toString());
                num2 = Double.parseDouble(v2.getText().toString());
                total = num1 + num2;

                txtTotal = findViewById(R.id.TextView2);
                txtTotal.setText(total.toString());
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1.setText("");
                v2.setText("");
                txtTotal.setText("");
            }
        });
    }
}
