package com.example.loginregcreate;


import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText edtUsername, edtEmail, edtPassword, edtConfirmPassword;
    private Button btnRegister;
    private TextView tvGoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtUsername = findViewById(R.id.edtUsername);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        tvGoLogin = findViewById(R.id.tvGoLogin);

        btnRegister.setOnClickListener(v -> {
            String username = edtUsername.getText().toString().trim();
            String email = edtEmail.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();
            String confirmPassword = edtConfirmPassword.getText().toString().trim();

            if (TextUtils.isEmpty(username)) {
                edtUsername.setError("Please enter username");
                return;
            }
            if (TextUtils.isEmpty(email)) {
                edtEmail.setError("Please enter email");
                return;
            }
            if (TextUtils.isEmpty(password)) {
                edtPassword.setError("Please enter password");
                return;
            }
            if (!password.equals(confirmPassword)) {
                edtConfirmPassword.setError("Passwords do not match");
                return;
            }

            Toast.makeText(RegisterActivity.this, "Register success!", Toast.LENGTH_SHORT).show();
        });

        tvGoLogin.setOnClickListener(v -> {
            Toast.makeText(RegisterActivity.this, "Go to Login screen", Toast.LENGTH_SHORT).show();
        });
    }
}
