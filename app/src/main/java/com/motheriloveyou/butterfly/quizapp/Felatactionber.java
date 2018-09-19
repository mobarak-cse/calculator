package com.motheriloveyou.butterfly.quizapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Felatactionber extends AppCompatActivity {
    private TextView txtScreen;
    private int[] numericButtons = {R.id.btnZero, R.id.btnOne, R.id.btnTwo, R.id.btnThree, R.id.btnFour, R.id.btnFive, R.id.btnSix, R.id.btnSeven, R.id.btnEight, R.id.btnNine};
    private int[] operatorButtons = {R.id.btnAdd, R.id.btnSubtract, R.id.btnMultiply, R.id.btnDivide};
    private boolean lastNumeric;
    private boolean stateError;
    private boolean lastDot;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felatactionber);






        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View view) {


                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Felatactionber.this);
                View mView = getLayoutInflater().inflate(R.layout.layout_calculator, null);

                txtScreen = (TextView) findViewById(R.id.txtScreen);
                // Find and set OnClickListener to numeric buttons
                setNumericOnClickListener();
                // Find and set OnClickListener to operator buttons, equal button and decimal point button



                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

            }




        });


    }






    private void setNumericOnClickListener() {
        // Create a common OnClickListener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Just append/set the text of clicked button
                Button button = (Button) v;
                if (stateError) {
                    // If current state is Error, replace the error message
                    txtScreen.setText(button.getText());
                    stateError = false;
                } else {
                    // If not, already there is a valid expression so append to it
                    txtScreen.append(button.getText());
                }
                // Set the flag
                lastNumeric = true;
            }
        };
        // Assign the listener to all the numeric buttons
        for (int id : numericButtons) {
            findViewById(id).setOnClickListener(listener);
        }
    }





}
