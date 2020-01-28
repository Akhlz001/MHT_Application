package com.example.mhtapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class answers extends AppCompatActivity {

    private Button button7;

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

    private TextView textView;
    private TextView textView2;
    private TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        diagnosistext();

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


        textView = findViewById(R.id.textView16);
        textView2 = findViewById(R.id.textView17);
        textView3 = findViewById(R.id.textView18);
    }

    public void diagnosistext() {

        if (radioButton.isChecked()) {
            textView.setText("testing");
            textView2.setText("more testing");
            textView3.setText("even more testing");
        }
        else {
            textView.setText("test");
            textView2.setText("ing");
            textView3.setText("df");
        }
    }


    public void reset() {
        Intent intent = new Intent(this, Questions.class);
        startActivity(intent);
    }

}
