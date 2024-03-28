package com.example.truly_myfirst_application;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

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

        Intent intent_to_level1 = getIntent();
        int level_label = intent_to_level1.getIntExtra("level_label", 1);

        switch(level_label) {
            case 2:
                two_dim_views[1][1].setBackgroundColor(Color.RED);
                two_dim_views[1][2].setBackgroundColor(Color.RED);
                two_dim_views[2][1].setBackgroundColor(Color.RED);
                two_dim_views[2][2].setBackgroundColor(Color.RED);
                views_value[1][1] = true;
                views_value[1][2] = true;
                views_value[2][1] = true;
                views_value[2][2] = true;
                break;
            case 3:
                two_dim_views[0][3].setBackgroundColor(Color.RED);
                views_value[0][3] = true;
                two_dim_views[2][1].setBackgroundColor(Color.RED);
                views_value[2][1] = true;
                break;
            case 4:
                two_dim_views[0][0].setBackgroundColor(Color.RED);
                two_dim_views[0][3].setBackgroundColor(Color.RED);
                two_dim_views[3][0].setBackgroundColor(Color.RED);
                two_dim_views[3][3].setBackgroundColor(Color.RED);
                views_value[0][0] = true;
                views_value[0][3] = true;
                views_value[3][0] = true;
                views_value[3][3] = true;
                break;
            case 5:
                Random rand_0or1 = new Random();
                for(int i = 0; i < 4; i++) {
                    for(int j = 0; j < 4; j++) {
                        if(rand_0or1.nextInt(2) == 1){
                            two_dim_views[i][j].setBackgroundColor(Color.RED);
                            views_value[i][j] = true;
                        }
                    }
                }
                break;
            default:
                break;
        }

        final boolean[] flag = {false};

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int finalI = i;
                int finalJ = j;
                two_dim_views[i][j].setOnClickListener(v -> {
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
                    for (int i1 = 0; i1 < 4; i1++){
                        for (int j1 = 0; j1 < 4; j1++){
                            if(!views_value[i1][j1]) flag[0] = false;
                        }
                    }
                    if(flag[0]) {
                        setContentView(R.layout.victory);
                        Button return_button = (Button) findViewById(R.id.return_button);
                        return_button.setOnClickListener(v1 -> {
                            finish();
                        });
                    }

                }); //监听设置完毕

            }
        } //for_end

    } //onCreate_end
} //class_end