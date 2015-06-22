package com.bmay.userdetails;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.bmay.userdetails.R;

public class NextActivity extends ActionBarActivity {

    private String mName, mRealName, mGender, mLocation;
    private int mAge;

    private TextView mTextView, mTextView3, mTextView4, mTextView5, mTextView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        mTextView = (TextView) findViewById(R.id.textView);
        mTextView3 = (TextView) findViewById(R.id.textView3);
        mTextView4 = (TextView) findViewById(R.id.textView4);
        mTextView5 = (TextView) findViewById(R.id.textView5);
        mTextView6 = (TextView) findViewById(R.id.textView6);

        Intent intent = getIntent();
        mName = intent.getStringExtra("User Name");
        mRealName = intent.getStringExtra("Real Name");
        mGender = intent.getStringExtra("Gender");
        mLocation = intent.getStringExtra("Location");
        mAge = intent.getIntExtra("Age", 0);
        //Toast.makeText(this, name, Toast.LENGTH_LONG).show();
        Log.d("NextActivity", "The user name is: " + mName);
        mTextView.setText(mName);
        mTextView3.setText(mRealName);
        mTextView4.setText(mGender);
        mTextView5.setText(mLocation);
        mTextView6.setText(Integer.toString(mAge));
    }

}
