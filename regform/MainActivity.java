package com.example.regform;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText lname,fname,gender,email,phno,Password,dob;

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
    }

    public void register(View view) {

            String user=email.getText().toString();
            String pass=password.getText().toString();
            if (user.isEmpty())
                email.setError();
            else if (pass.isEmpty())
                password.setError("password is empty ");
            else if (user.equals("admin") && pass.equals("admin")) {
                Toast.makeText(this, "login successfully", Toast.LENGTH_SHORT).show();
                Intent home = new Intent(MainActivity.this, res.class);
                //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")));
                startActivity(home);
            }
            else
                Toast.makeText(this,"Login un-successful",Toast.LENGTH_SHORT).show();

        }
    }
