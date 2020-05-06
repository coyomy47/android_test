package com.example.midexam;

import android.icu.text.SimpleDateFormat;

import java.io.Serializable;

public class memo implements Serializable{

    String title;



    public memo(String title) {
        this.title = title;

    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
