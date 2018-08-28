package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA=0;
    int scoreTeamB=0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addSixForTeamA(View v) {
        scoreTeamA=scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }
    public void addFourForTeamA(View v) {
        scoreTeamA=scoreTeamA+4;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View v) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    public void addSixForTeamB(View v) {
        scoreTeamB=scoreTeamB+6;
        displayForTeamB(scoreTeamB);
    }
    public void addFourForTeamB(View v) {
        scoreTeamB=scoreTeamB+4;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View v) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View v) {
        scoreTeamB=0;
        scoreTeamA=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
