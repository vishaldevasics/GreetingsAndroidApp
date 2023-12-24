package com.maverickallies.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText myET;
    Button myBtn;
    TextView myTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myET = findViewById(R.id.editTextId);
        myBtn = findViewById(R.id.ButtonId);



        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = myET.getText().toString();
                Toast.makeText(MainActivity.this, "Hello and Welcome Mr."+name+"To our Greetings app", Toast.LENGTH_SHORT).show();
            }
        });






    }
}