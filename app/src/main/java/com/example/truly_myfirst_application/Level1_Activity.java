package com.example.truly_myfirst_application;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Level1_Activity extends AppCompatActivity {

    public TextView[][] two_dim_views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_level1);

        two_dim_views = new TextView[4][4];
        two_dim_views[0][0] = findViewById(R.id.button1_1);
        two_dim_views[0][1] = findViewById(R.id.button1_2);
        two_dim_views[0][2] = findViewById(R.id.button1_3);
        two_dim_views[0][3] = findViewById(R.id.button1_4);

        two_dim_views[1][0] = findViewById(R.id.button2_1);
        two_dim_views[1][1] = findViewById(R.id.button2_2);
        two_dim_views[1][2] = findViewById(R.id.button2_3);
        two_dim_views[1][3] = findViewById(R.id.button2_4);

        two_dim_views[2][0] = findViewById(R.id.button3_1);
        two_dim_views[2][1] = findViewById(R.id.button3_2);
        two_dim_views[2][2] = findViewById(R.id.button3_3);
        two_dim_views[2][3] = findViewById(R.id.button3_4);

        two_dim_views[3][0] = findViewById(R.id.button4_1);
        two_dim_views[3][1] = findViewById(R.id.button4_2);
        two_dim_views[3][2] = findViewById(R.id.button4_3);
        two_dim_views[3][3] = findViewById(R.id.button4_4);

        boolean[][] views_value = new boolean[4][4];
        final boolean[] flag = {false};

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int finalI = i;
                int finalJ = j;
                two_dim_views[i][j].setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("ResourceAsColor")
                    @Override
                    public void onClick(View v) {
                        if(!views_value[finalI][finalJ]) two_dim_views[finalI][finalJ].setBackgroundColor(Color.RED);
                        else two_dim_views[finalI][finalJ].setBackgroundColor(Color.GRAY );
                        views_value[finalI][finalJ] = !views_value[finalI][finalJ];

                        if(finalI == 0){

                            if(!views_value[finalI +1][finalJ]) two_dim_views[finalI +1][finalJ].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI +1][finalJ].setBackgroundColor(Color.GRAY);
                            views_value[finalI +1][finalJ] = !views_value[finalI +1][finalJ];

                        } else if (finalI == 3){

                            if(!views_value[finalI -1][finalJ]) two_dim_views[finalI -1][finalJ].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI -1][finalJ].setBackgroundColor(Color.GRAY);
                            views_value[finalI -1][finalJ] = !views_value[finalI -1][finalJ];

                        } else {

                            if(!views_value[finalI +1][finalJ]) two_dim_views[finalI +1][finalJ].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI +1][finalJ].setBackgroundColor(Color.GRAY);
                            views_value[finalI +1][finalJ] = !views_value[finalI +1][finalJ];

                            if(!views_value[finalI -1][finalJ]) two_dim_views[finalI-1][finalJ].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI-1][finalJ].setBackgroundColor(Color.GRAY);
                            views_value[finalI-1][finalJ] = !views_value[finalI-1][finalJ];

                        }

                        if(finalJ == 0) {

                            if(!views_value[finalI][finalJ+1]) two_dim_views[finalI][finalJ+1].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI][finalJ+1].setBackgroundColor(Color.GRAY);
                            views_value[finalI][finalJ+1] = !views_value[finalI][finalJ+1];
                        } else if (finalJ == 3) {

                            if(!views_value[finalI][finalJ-1]) two_dim_views[finalI][finalJ-1].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI][finalJ-1].setBackgroundColor(Color.GRAY);
                            views_value[finalI][finalJ-1] = !views_value[finalI][finalJ-1];
                        } else {

                            if(!views_value[finalI][finalJ-1]) two_dim_views[finalI][finalJ-1].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI][finalJ-1].setBackgroundColor(Color.GRAY);
                            views_value[finalI][finalJ-1] = !views_value[finalI][finalJ-1];

                            if(!views_value[finalI][finalJ+1]) two_dim_views[finalI][finalJ+1].setBackgroundColor(Color.RED);
                            else two_dim_views[finalI][finalJ+1].setBackgroundColor(Color.GRAY);
                            views_value[finalI][finalJ+1] = !views_value[finalI][finalJ+1];
                        }

                        flag[0] = true;
                        for (int i = 0; i < 4; i++){
                            for (int j = 0; j < 4; j++){
                                if(!views_value[i][j]) flag[0] = false;
                            }
                        }
                        if(flag[0]) {
                            setContentView(R.layout.victory);
                        }

                    }
                });


            }
        }

    }
}