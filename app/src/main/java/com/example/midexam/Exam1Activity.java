package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exam1Activity extends AppCompatActivity {
    TextView tv = null;

    int count= 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        tv = (TextView)findViewById(R.id.editText);
    }
    public void button3_clicked(View button3){
        count++;
        tv.setText(""+count);



    }
    public void button4_clicked(View button4){
        count--;
        tv.setText(""+count);
    }


}
