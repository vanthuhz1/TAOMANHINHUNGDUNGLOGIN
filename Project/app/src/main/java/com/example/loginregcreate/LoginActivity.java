package com.example.loginregcreate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin;
    TextView tvForgot, tvSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.editTextTextEmailAddress);
        etPassword = findViewById(R.id.editTextTextPassword);
        btnLogin = findViewById(R.id.button);
        tvForgot = findViewById(R.id.textView7);
        tvSignup = findViewById(R.id.textView8);

        btnLogin.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String pass = etPassword.getText().toString().trim();

            if (email.equals("test@gmail.com") && pass.equals("123456")) {
                Toast.makeText(this, "✅ Login success", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "❌ Email or password wrong", Toast.LENGTH_SHORT).show();
            }
        });

        tvForgot.setOnClickListener(v ->
                Toast.makeText(this, "👉 Forgot password clicked", Toast.LENGTH_SHORT).show()
        );

        tvSignup.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}

