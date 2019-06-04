package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button clickButton;
    EditText usernameEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("mytag","MainActivity Created");

        clickButton =findViewById(R.id.buttonClick);
        usernameEditText=findViewById(R.id.Username);
        passwordEditText=findViewById(R.id.password);


        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username=usernameEditText.getText().toString();
                String pw=passwordEditText.getText().toString();

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key",username);
                startActivity(intent);

                /*if(username.equals("Yingxin") && pw.equals("123")){

                    Toast.makeText(MainActivity.this, "The username is"+username+"\nThe password is"+pw, Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "Username or Password wrong!", Toast.LENGTH_SHORT).show();
                }*/
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("mytag","MainActivity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("mytag","MainActivity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("mytag","MainActivity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mytag","MainActivity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("mytag","MainActivity Destroyed");
    }



}
