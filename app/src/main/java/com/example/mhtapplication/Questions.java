package com.example.mhtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Questions extends AppCompatActivity {

    private Button button2;

    private RadioButton radioButton;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private RadioButton radioButton7;
    private RadioButton radioButton8;
    private RadioButton radioButton9;
    private RadioButton radioButton10;
    private RadioButton radioButton11;
    private RadioButton radioButton12;
    private RadioButton radioButton13;
    private RadioButton radioButton14;
    private RadioButton radioButton15;
    private RadioButton radioButton16;
    private RadioButton radioButton17;
    private RadioButton radioButton18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendiagnosis();
            }
        });

        //Question 1
        radioButton = findViewById(R.id.radioButton); //yes
        radioButton2 = findViewById(R.id.radioButton20); //no
        //Question 2
        radioButton3 = findViewById(R.id.radioButton4); //yes
        radioButton4 = findViewById(R.id.radioButton2); //no
        //Question 3
        radioButton5 = findViewById(R.id.radioButton6); //yes
        radioButton6 = findViewById(R.id.radioButton5); //no
        //Question 4
        radioButton7 = findViewById(R.id.radioButton7); //yes
        radioButton8 = findViewById(R.id.radioButton8); //no
        //Question 5
        radioButton9 = findViewById(R.id.radioButton9); //yes
        radioButton10 = findViewById(R.id.radioButton10); //no
        //Question 6
        radioButton11 = findViewById(R.id.radioButton12); //yes
        radioButton12 = findViewById(R.id.radioButton11); //no
        //Question 7
        radioButton13 = findViewById(R.id.radioButton13); //yes
        radioButton14 = findViewById(R.id.radioButton14); //no
        //Question 8
        radioButton15 = findViewById(R.id.radioButton15); //yes
        radioButton16 = findViewById(R.id.radioButton16); //no
        //Question 9
        radioButton17 = findViewById(R.id.radioButton17); //yes
        radioButton18 = findViewById(R.id.radioButton18); //no
    }

    public void opendiagnosis() {

        if (radioButton.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton2.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton3.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton4.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton5.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton6.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton7.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton8.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton9.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton10.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton11.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton12.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton13.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton14.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton15.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton16.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (radioButton17.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else if (radioButton18.isChecked())
        {
            Intent intent = new Intent(this, answers.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getBaseContext(), "Please answer all the questions for an accurate diagnosis",
                    Toast.LENGTH_LONG).show();
            return;
        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);


        savedInstanceState.putBoolean("myOption1", radioButton.isChecked());
        savedInstanceState.putBoolean("myOption2", radioButton2.isChecked());
        savedInstanceState.putBoolean("myOption3", radioButton3.isChecked());
        savedInstanceState.putBoolean("myOption4", radioButton4.isChecked());
        savedInstanceState.putBoolean("myOption5", radioButton5.isChecked());
        savedInstanceState.putBoolean("myOption6", radioButton6.isChecked());
        savedInstanceState.putBoolean("myOption7", radioButton7.isChecked());
        savedInstanceState.putBoolean("myOption8", radioButton8.isChecked());
        savedInstanceState.putBoolean("myOption9", radioButton9.isChecked());
        savedInstanceState.putBoolean("myOption10", radioButton10.isChecked());
        savedInstanceState.putBoolean("myOption11", radioButton11.isChecked());
        savedInstanceState.putBoolean("myOption12", radioButton12.isChecked());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        radioButton.setChecked(savedInstanceState.getBoolean("myOption1"));
        radioButton2.setChecked(savedInstanceState.getBoolean("myOption2"));
        radioButton3.setChecked(savedInstanceState.getBoolean("myOption3"));
        radioButton4.setChecked(savedInstanceState.getBoolean("myOption4"));
        radioButton5.setChecked(savedInstanceState.getBoolean("myOption5"));
        radioButton6.setChecked(savedInstanceState.getBoolean("myOption6"));
        radioButton7.setChecked(savedInstanceState.getBoolean("myOption7"));
        radioButton8.setChecked(savedInstanceState.getBoolean("myOption8"));
        radioButton9.setChecked(savedInstanceState.getBoolean("myOption9"));
        radioButton10.setChecked(savedInstanceState.getBoolean("myOption10"));
        radioButton11.setChecked(savedInstanceState.getBoolean("myOption11"));
        radioButton12.setChecked(savedInstanceState.getBoolean("myOption12"));

    }
}
