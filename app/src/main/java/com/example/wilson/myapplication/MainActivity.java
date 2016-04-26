package com.example.wilson.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int wins = 0;
    int losses = 0;
    int ties = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rock = (Button) findViewById(R.id.rock);
        Button paper = (Button) findViewById(R.id.paper);
        Button scissors = (Button) findViewById(R.id.button);

        final TextView userchoice = (TextView) findViewById(R.id.textView);
        final TextView comchoice = (TextView) findViewById(R.id.textView2);
        final TextView status = (TextView) findViewById(R.id.textView3);

        final TextView winsText = (TextView) findViewById(R.id.wins);
        final TextView lossesText = (TextView) findViewById(R.id.losses);
        final TextView tiesText = (TextView) findViewById(R.id.ties);

            rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    userchoice.setText("You Chose: Rock");

                    int rand = (int) (Math.random() * 3) + 1;
                    if (rand == 1) {
                        comchoice.setText("Computer Chose: Rock");
                        status.setText("TIE");
                        ties++;
                        tiesText.setText("T: " + ties);
                    } else if (rand == 2) {
                        comchoice.setText("Computer Chose: Paper");
                        status.setText("YOU LOSE! :(");
                        losses++;
                        lossesText.setText("L: " + losses);
                    } else {
                        comchoice.setText("Computer Chose: Scissors");
                        status.setText("YOU WIN! :)");
                        wins++;
                        winsText.setText("W: " + wins);
                    }
                }
            });
            paper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    userchoice.setText("You Chose: Paper");

                    int rand = (int) (Math.random() * 3) + 1;
                    if (rand == 1) {
                        comchoice.setText("Computer Chose: Rock");
                        status.setText("YOU WIN! :)");
                        wins++;
                        winsText.setText("W: " + wins);
                    } else if (rand == 2) {
                        comchoice.setText("Computer Chose: Paper");
                        status.setText("TIE");
                        ties++;
                        tiesText.setText("T: " + ties);
                    } else {
                        comchoice.setText("Computer Chose: Scissors");
                        status.setText("YOU LOSE! :(");
                        losses++;
                        lossesText.setText("L: " + losses);
                    }
                }
            });
            scissors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    userchoice.setText("You Chose: Scissors");

                    int rand = (int) (Math.random() * 3) + 1;
                    if (rand == 1) {
                        comchoice.setText("Computer Chose: Rock");
                        status.setText("YOU LOSE! :(");
                        losses++;
                        lossesText.setText("L: " + losses);
                    } else if (rand == 2) {
                        comchoice.setText("Computer Chose: Paper");
                        status.setText("YOU WIN! :)");
                        wins++;
                        winsText.setText("W: " + wins);
                    } else {
                        comchoice.setText("Computer Chose: Scissors");
                        status.setText("TIE");
                        ties++;
                        tiesText.setText("T: " + ties);
                    }
                }
            });
        }
}
