package com.bmay.userdetails;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import model.UserData;



public class MainActivity extends ActionBarActivity {

    private Button mStartButton;
    private UserData mUser;
    private String mUserName, mRealName, mGender, mLocation;
    private int mAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton = (Button) findViewById(R.id.button);

        mUser = new UserData("barryjmay", "Barry May", 36, "Male", "Ashbourne Co. Meath");

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(this, mUser.getUserName(), Toast.LENGTH_LONG).show();
                mUserName = mUser.getUserName();
                mRealName = mUser.getRealName();
                mAge = mUser.getAge();
                mGender = mUser.getGender();
                mLocation = mUser.getLocation();
                startIntent(mUserName, mRealName, mAge, mGender, mLocation);
            }
        });
    }

    private void startIntent(String name, String realName, int age, String gender, String location) {
        Intent intent = new Intent(this, NextActivity.class);
        intent.putExtra("User Name", name);
        intent.putExtra("Real Name", realName);
        intent.putExtra("Age", age);
        intent.putExtra("Gender", gender);
        intent.putExtra("Location", location);
        Log.d("MainActivity", "The user name is: " + name);
        startActivity(intent);
    }
}
