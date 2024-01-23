package com.example.serviceexample;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.start);
        Button stop = findViewById(R.id.stop);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startService(new Intent(getApplicationContext(),myService.class));
                    Toast.makeText(getApplicationContext(),"service started",Toast.LENGTH_LONG).show();
                }
            });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getApplicationContext(),myService.class));
                Toast.makeText(getApplicationContext(),"service stoped",Toast.LENGTH_LONG).show();
            }
        });
    }
}