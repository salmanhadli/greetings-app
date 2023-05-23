package com.example.greetings;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView heading;
    EditText nameInput;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heading = findViewById(R.id.header);
        nameInput = findViewById(R.id.nameInput);
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString();
                String message;
                System.out.println(name);
                if (name.length() > 0) {
                    message = "Hello " + name;
                } else {
                    message = "Please Enter your name!";
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

    }
}