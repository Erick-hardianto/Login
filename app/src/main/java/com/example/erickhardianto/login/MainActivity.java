package com.example.erickhardianto.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edE,edP;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edE = findViewById(R.id.edEmail);
        edP = findViewById(R.id.edPassword);
        btn = findViewById(R.id.btSignin);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check();

            }
        });
    }

    public void check() {
        if (edE.getText().toString().equals("admin@email.com") &&
                edP.getText().toString().equals("erick"))
        {
            Toast.makeText(this, "Login Sukse", Toast.LENGTH_LONG).show();
        }
        else if (edE.getText().toString().equals("admin@email.com"))
        {
            Toast.makeText(this, "Password Salah", Toast.LENGTH_SHORT).show();
        }
        else if (edP.getText().toString().equals("erick"))
        {
            Toast.makeText(this, "Email Salah", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Email dan Password Salah", Toast.LENGTH_SHORT).show();
        }
    }
}