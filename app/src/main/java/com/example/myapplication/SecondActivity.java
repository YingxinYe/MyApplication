package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView resultTextView;
    Button pre;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultTextView=findViewById(R.id.textViewResult);
        pre=findViewById(R.id.PrePage);
        next=findViewById(R.id.NextPage);


        String result=getIntent().getExtras().getString("key");
        resultTextView.setText(result);


        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(a);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(b);
            }
        });
    }
}
