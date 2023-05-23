package com.example.greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    }
}