package com.example.covidreg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView email = findViewById(R.id.emailcim);
        TextView taj = findViewById(R.id.tajszam);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            email.setText(extras.getString("atadottemail"));
            taj.setText(extras.getString("atadotttaj"));
        }
    }
}