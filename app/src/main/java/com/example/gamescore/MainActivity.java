package com.example.gamescore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private int score1 = 0;
    private int score2 = 0;


    private TextView textViewScore1;
    private TextView textViewScore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewScore1 = findViewById(R.id.ScoreTeam1);
        textViewScore2 = findViewById(R.id.ScoreTeam2);

        if(savedInstanceState != null) {
            score1 = savedInstanceState.getInt("score1");
            score2 = savedInstanceState.getInt("score2");
        }

        updateScore1();
        updateScore2();



        textViewScore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score1++;
                updateScore1();
            }
        });


        textViewScore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score2++;
                updateScore2();
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void updateScore1(){
        textViewScore1.setText(String.valueOf(score1));

    }
    private void updateScore2(){
        textViewScore2.setText(String.valueOf(score2));

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("score1", score1);
        outState.putInt("score2", score2);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



}