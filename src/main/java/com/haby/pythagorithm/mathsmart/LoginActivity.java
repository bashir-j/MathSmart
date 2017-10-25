package com.haby.pythagorithm.mathsmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private ViewGroup containerLayout;
    private ImageView logoView;
    private EditText username;
    private EditText password;
    private TextView userWarning;
    private TextView passWarning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logoView = (ImageView) findViewById(R.id.LogoImageView);
        containerLayout = (ViewGroup) findViewById(R.id.containerLayout);
        username = (EditText) findViewById(R.id.UsernameEditText);
        password = (EditText) findViewById(R.id.PasswordEditText);
        userWarning = (TextView) findViewById(R.id.warningUserTextView);
        passWarning = (TextView) findViewById(R.id.warningPassTextView);

    }

    public void onBtnClick(View v){
        if(username.getText().toString().trim().equals("")){
            userWarning.setVisibility(View.VISIBLE);
        }
        else{
            userWarning.setVisibility(View.GONE);
        }
        if(password.getText().toString().trim().equals("")){
            passWarning.setVisibility(View.VISIBLE);
        }
        else{
            passWarning.setVisibility(View.GONE);

        }

        //Intent intent = new Intent(this, AssignmentsActivity.class);
        //startActivity(intent);


    }

}
