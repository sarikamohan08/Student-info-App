package com.example.studentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Name = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText Password = (EditText) findViewById(R.id.editTextTextPassword);
        EditText address = (EditText) findViewById(R.id.editTextTextPostalAddress);
        RadioButton Female = (RadioButton) findViewById(R.id.radioButton);
        RadioButton Male = (RadioButton) findViewById(R.id.radioButton2);
        TextView display = (TextView) findViewById(R.id.textView2);
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                display.setText("HI "+ Name.getText().toString()+"\n"+ address.getText().toString()+"\n");

            }
        })

        }

    }
}