package com.example.truly_myfirst_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChoosingLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.choosing_layout);


        Button button = (Button) findViewById(R.id.level1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_to_level1 = new Intent(ChoosingLayoutActivity.this, Level1_Activity.class);
                startActivity(intent_to_level1);
            }
        });

//        Button button2 = (Button) findViewById(R.id.level2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent_to_level2 = new Intent(ChoosingLayoutActivity.this, Level1_Activity.class);
//                startActivity(intent_to_level2);
//            }
//        });

    }
}