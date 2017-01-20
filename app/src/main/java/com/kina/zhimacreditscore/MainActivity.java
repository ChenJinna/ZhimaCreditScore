package com.kina.zhimacreditscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ScoreTrend mScoreTrend;
    private int score[] = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreTrend = (ScoreTrend) findViewById(R.id.scoreTrend);

        int max = 700;
        int min = 650;

        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            score[i] = random.nextInt(max) % (max - min + 1) + min;
        }
        mScoreTrend.setScore(score);
    }
}
