package com.example.helloworld1;

import android.Manifest;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;



public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button bestButton;
    Button gameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
        bestButton = findViewById(R.id.bestButton);
        gameButton = findViewById(R.id.gameButton);
        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameActivity();
            }
            public void openGameActivity(){
                Intent intent = new Intent (MainActivity.this, GameActivity.class);
                startActivity(intent);
            }

        });
        bestButton.setOnClickListener(new View.OnClickListener() {
            boolean visible;


            @Override
            public void onClick(View view) {
                visible = !visible;
                txt.setVisibility(visible ? View.VISIBLE : View.GONE);
            }

        });

    }};













