package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1_clicked(View button1){
        Intent intent = new Intent(this, Exam1Activity.class);
        startActivity(intent);


    }
    public void button2_clicked(View button2){
        Intent intent = new Intent(this, Exam2Activity.class);
        startActivity(intent);


    }
    public void button5_clicked(View button5){
        Intent intent = new Intent(this, Exam3Activity.class);
        startActivity(intent);


    }
    public void button6_clicked(View button6){
        Intent intent = new Intent(this, Exam4Activity.class);
        startActivity(intent);


    }
}
