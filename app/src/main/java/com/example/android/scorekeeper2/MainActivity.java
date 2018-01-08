package com.example.android.scorekeeper2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int setsTeamA = 0;
    int setsTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayForTeamASets(0);
        displayForTeamBSets(0);
    }

    /**
     * Increase score by 1 points for team A.
     */
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Increase sets by 1 for team A.
     */

    public void addSetForTeamA(View view) {
        setsTeamA = setsTeamA + 1;
        displayForTeamASets(setsTeamA);
    }

    /**
     * Increase score by 1 points for team B.
     */
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase sets by 1 for team B.
     */

    public void addSetForTeamB(View view) {
        setsTeamB = setsTeamB + 1;
        displayForTeamBSets(setsTeamB);
    }


    /**
     * Change sets number after team wins the set
     */
    public void resetPoints(View view) {
        if (setsTeamA >= 3 || setsTeamB >= 3) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            setsTeamA = 0;
            setsTeamB = 0;
            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);
            displayForTeamASets(setsTeamA);
            displayForTeamBSets(setsTeamB);
        } else {
            scoreTeamA = 0;
            scoreTeamB = 0;
            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);

        }

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given sets for Team A.
     */
    public void displayForTeamASets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_sets);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given sets for Team B.
     */
    public void displayForTeamBSets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_sets);
        scoreView.setText(String.valueOf(score));
    }


}
