
package com.example.a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnOK = findViewById(R.id.btnOK);

        btnOK.setOnClickListener(v -> {

            String username = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();

            Intent intent = new Intent(
                    MainActivity.this,
                    SecondActivity.class
            );

            intent.putExtra("username", username);
            intent.putExtra("password", password);

            startActivity(intent);
        });
    }
}
