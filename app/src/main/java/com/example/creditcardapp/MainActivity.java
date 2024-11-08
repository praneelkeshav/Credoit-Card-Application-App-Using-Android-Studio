package com.example.creditcardapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextMobile, editTextEmail, editTextSalary, editTextCibil;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextMobile = findViewById(R.id.editTextMobile);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSalary = findViewById(R.id.editTextSalary);
        editTextCibil = findViewById(R.id.editTextCibil);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String mobile = editTextMobile.getText().toString();
                String email = editTextEmail.getText().toString();
                String salaryStr = editTextSalary.getText().toString();
                String cibilStr = editTextCibil.getText().toString();

                if (name.isEmpty() || mobile.isEmpty() || email.isEmpty() || salaryStr.isEmpty() || cibilStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                double salary = Double.parseDouble(salaryStr);
                int cibil = Integer.parseInt(cibilStr);

                if (salary > 600 && cibil > 300) {
                    Toast.makeText(MainActivity.this, "Credit Card Application Accepted", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Credit Card Application Rejected", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
