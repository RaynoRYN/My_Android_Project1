package com.example.truly_myfirst_application;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class ChoosingLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.choosing_layout);


        Button button1 = (Button) findViewById(R.id.level1);
        button1.setOnClickListener(v -> {
            Intent intent_to_level1 = new Intent(ChoosingLayoutActivity.this, Level1_Activity.class);
            intent_to_level1.putExtra("level_label", 1);
            startActivity(intent_to_level1);
        });

        Button button2 = (Button) findViewById(R.id.level2);
        button2.setOnClickListener(v -> {
            Intent intent_to_level1 = new Intent(ChoosingLayoutActivity.this, Level1_Activity.class);
            intent_to_level1.putExtra("level_label", 2);
            startActivity(intent_to_level1);
        });

        Button button3 = (Button) findViewById(R.id.level3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_level1 = new Intent(ChoosingLayoutActivity.this, Level1_Activity.class);
                intent_to_level1.putExtra("level_label", 3);
                startActivity(intent_to_level1);
            }
        });

        Button button4 = (Button) findViewById(R.id.level4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_level1 = new Intent(ChoosingLayoutActivity.this, Level1_Activity.class);
                intent_to_level1.putExtra("level_label", 4);
                startActivity(intent_to_level1);
            }
        });

        Button button5 = (Button) findViewById(R.id.level5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_level1 = new Intent(ChoosingLayoutActivity.this, Level1_Activity.class);
                intent_to_level1.putExtra("level_label", 5);
                startActivity(intent_to_level1);
            }
        });

        Button button6 = (Button) findViewById(R.id.level6);
        button6.setOnClickListener(v -> {
            Toast.makeText(ChoosingLayoutActivity.this, "别点了，没做呢", Toast.LENGTH_SHORT).show();
            button6.setBackgroundColor(Color.GRAY);
            button6.setEnabled(false);
        });

        Button button7 = (Button) findViewById(R.id.level7);
        button7.setOnClickListener(v -> {
            button7.setBackgroundColor(Color.GRAY);
            button7.setEnabled(false);
        });

        Button button8 = (Button) findViewById(R.id.level8);
        button8.setOnClickListener(v -> {
            button8.setBackgroundColor(Color.GRAY);
            button8.setEnabled(false);
        });

        Button button9 = (Button) findViewById(R.id.level9);
        button9.setOnClickListener(v -> {
            button9.setBackgroundColor(Color.GRAY);
            button9.setEnabled(false);
        });
    }
}