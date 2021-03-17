package com.example.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nameText;
    EditText nameEditText, mailIdEditText, stateEditText;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        nameText = findViewById(R.id.nameText);

        submit.setOnClickListener(view -> {
            nameEditText = findViewById(R.id.nameEditText);
            mailIdEditText = findViewById(R.id.mailEditText);
            stateEditText = findViewById(R.id.stateEditText);

            nameText.setText("Name: " + nameEditText.getText().toString()
                    + "\n"
                    + "Mail id: " + mailIdEditText.getText().toString()
                    + "\n"
                    + "State: " + stateEditText.getText().toString());
        });


    }
}