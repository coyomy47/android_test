package com.example.midexam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exam2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);
    }
    public void openalertDialog_clicked(View button5){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.confirm);
        builder.setMessage("Do you want to delete?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                // 삭제 작업 실행
                Toast.makeText(Exam2Activity.this, "삭제성공", Toast.LENGTH_SHORT).show();
                TextView t = (TextView)findViewById(R.id.textView);
                t.setText("삭제성공");
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                // 삭제 작업 실행
                Toast.makeText(Exam2Activity.this, "삭제실패", Toast.LENGTH_SHORT).show();

                TextView t = (TextView)findViewById(R.id.textView);
                t.setText("삭제실패");

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();




    }
}
