package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Exam3Activity extends AppCompatActivity {


    RecyclerView3Adapter recyclerView3Adapter;
    ArrayList<Memo> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3);

        arrayList = new ArrayList<Memo>();
        arrayList.add(new Memo("one", new Date()));
        arrayList.add(new Memo("two", new Date()));

        recyclerView3Adapter = new RecyclerView3Adapter(this, arrayList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerView3Adapter);

    }
}
