package com.example.shuvo.autismtherapy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AutismTest extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mTopText;
    private TextView mQuestionNumberText;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private Button mButtonChoiceOK;

    private int mQuestionNumber = 0;
    private static int mPointTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autism_test);
        mPointTracker = 0;

        mTopText = (TextView)findViewById(R.id.question_Text);
        mQuestionNumberText = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        mButtonChoiceOK = (Button)findViewById(R.id.choiceOK);

        mButtonChoiceOK.setVisibility(View.GONE);
        updateQuestion();

        /**
         * Answer buttons
         * */
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  //My logic for Button goes in here
                                                  mPointTracker = mPointTracker + mQuestionLibrary.getPoints((mQuestionNumber-1), 0);
                                                  //mButtonChoice2.setVisibility(View.GONE);
                                                  updateQuestion();
                                              }
                                          }
        );
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  //My logic for Button goes in here
                                                  mPointTracker = mPointTracker + mQuestionLibrary.getPoints((mQuestionNumber-1), 1);
                                                  updateQuestion();
                                              }
                                          }
        );
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  //My logic for Button goes in here
                                                  mPointTracker = mPointTracker + mQuestionLibrary.getPoints((mQuestionNumber-1), 2);
                                                  updateQuestion();
                                              }
                                          }
        );
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  //My logic for Button goes in here
                                                  mPointTracker = mPointTracker + mQuestionLibrary.getPoints((mQuestionNumber-1), 3);
                                                  updateQuestion();
                                              }
                                          }
        );
        /**
         * End of answer buttons
         * */

    }

    /**
     * Self-explanatory: This updates the questions
     */
    private void updateQuestion() {
        if (mQuestionNumber < 15) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(0));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(1));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(2));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(3));
            mQuestionNumberText.setText("" + mQuestionNumber + "/" + 15);
            mQuestionNumber++;

        } else {
            finalResult();
        }

    }

    private void finalResult(){
        double result = mPointTracker;
        result = result/139;
        result = result*100;
        result = Math.ceil(result);

        mTopText.setVisibility(View.INVISIBLE);
        mQuestionNumberText.setVisibility(View.INVISIBLE);
        mButtonChoice1.setVisibility(View.GONE);
        mButtonChoice2.setVisibility(View.GONE);
        mButtonChoice3.setVisibility(View.GONE);
        mButtonChoice4.setVisibility(View.GONE);
        mButtonChoiceOK.setVisibility(View.VISIBLE);
        mQuestionView.setText("Probability of Autism    " + Integer.valueOf((int) result)  + "%");

        mButtonChoiceOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


}
