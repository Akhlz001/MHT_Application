package com.example.mhtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class answers extends AppCompatActivity {

    private Button button7; //Re-check symptoms button variable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        //Intent extra made in Questions Class is called here
        Bundle extras = getIntent().getExtras();
        if (extras == null) { //If NO intents are found
            return;
        }

        String value1 = extras.getString("Value1"); //key used to call intent, same for other two

        if (value1 != null) { //If intents ARE found, same for other two

            TextView displayintentextra = findViewById(R.id.textView16); //Diagnosis Page: Symptoms
            displayintentextra.setText(value1);
        }
        String value2 = extras.getString("Value2");
        if (value2 != null) {

            TextView displayintentextra2 = findViewById(R.id.textView17); //Diagnosis Page: Meaning
            displayintentextra2.setText(value2);
        }
        String value3 = extras.getString("Value3");
        if (value3 != null) {

            TextView displayintentextra3 = findViewById(R.id.textView18); //Diagnosis Page: Doctors Approval
            displayintentextra3.setText(value3);
        }
        //reset method called, application starts from the questions activity again
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

    }


    public void reset() {       //This method initiates the Questions activity using an intent
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }

}
