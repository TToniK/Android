package com.example.helloworld1;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button bestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
        bestButton = findViewById(R.id.bestButton);
        bestButton.setOnClickListener(new View.OnClickListener(){
            boolean visible;
            @Override
            public void onClick(View view) {
                visible = !visible;
                txt.setVisibility(visible ? View.VISIBLE: View.GONE);
                
            }


        });

    }






}