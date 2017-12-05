package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  // TODO: Steps 4 & 8 - Declare member variables here:

  int mStoryIndex = 1;
  TextView tv_storyText;
  Button bt_option_one;
  Button bt_option_two;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
    tv_storyText = findViewById(R.id.storyTextView);
    bt_option_one = findViewById(R.id.buttonTop);
    bt_option_two = findViewById(R.id.buttonBottom);


    // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
    bt_option_one.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        switch (mStoryIndex) {
          case 1:
            mStoryIndex = 3;
            tv_storyText.setText(R.string.T3_Story);
            bt_option_one.setText(R.string.T3_Ans1);
            bt_option_two.setText(R.string.T3_Ans2);
            break;
          case 2:
            mStoryIndex = 3;
            tv_storyText.setText(R.string.T3_Story);
            bt_option_one.setText(R.string.T3_Ans1);
            bt_option_two.setText(R.string.T3_Ans2);
            break;
          case 3:
            tv_storyText.setText(R.string.T6_End);
            bt_option_one.setVisibility(View.INVISIBLE);
            bt_option_two.setVisibility(View.INVISIBLE);
            break;
          default:
            break;
        }
      }
    });


    // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    bt_option_two.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        switch (mStoryIndex) {
          case 1:
            mStoryIndex = 2;
            tv_storyText.setText(R.string.T2_Story);
            bt_option_one.setText(R.string.T2_Ans1);
            bt_option_two.setText(R.string.T2_Ans2);
            break;
          case 2:
            tv_storyText.setText(R.string.T4_End);
            bt_option_one.setVisibility(View.INVISIBLE);
            bt_option_two.setVisibility(View.INVISIBLE);
            break;
          case 3:
            tv_storyText.setText(R.string.T5_End);
            bt_option_one.setVisibility(View.INVISIBLE);
            bt_option_two.setVisibility(View.INVISIBLE);
            break;
          default:
            break;
        }
      }
    });

  }

}
