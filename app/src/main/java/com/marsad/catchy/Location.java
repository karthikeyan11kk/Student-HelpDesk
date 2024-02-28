package com.marsad.catchy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Location extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        button=(Button) findViewById(R.id.locBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Location.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(Location.this, "YOU ARE IN KCT", Toast.LENGTH_SHORT).show();
            }
        });
    }
}