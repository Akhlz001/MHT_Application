package com.example.mhtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button; //Get Stated button variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button); //Allows variable allocation to physical button inside activity
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquestions();
            }
        }); //Once Get Started button is clicked open questions method is called
    }

    public void openquestions() { //Intent is called and allows next activity to be launched
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }
}
