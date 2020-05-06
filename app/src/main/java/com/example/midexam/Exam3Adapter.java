package com.example.midexam;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Exam3Adapter extends RecyclerView.Adapter<Exam3Adapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        TextView textView1;


        public ViewHolder(View view) {
            super(view);
            textView1 = view.findViewById(R.id.textView2);


            textView1.setOnClickListener(this);

        }

        public void setData() {
            memo memo = arrayList.get(getAdapterPosition());
            textView1.setText(memo.getTitle());

        }

        @Override
        public void onClick(View view) {
            memo memo = arrayList.get(super.getAdapterPosition());
            String s = String.format("index: %d,  title: %s", super.getAdapterPosition(), memo.getTitle());
            Toast.makeText(view.getContext(), s, Toast.LENGTH_SHORT).show();
        }


    }

    LayoutInflater layoutInflater;
    ArrayList<memo> arrayList;


    public Exam3Adapter(Context context, ArrayList<memo> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.item1, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int index) {
        viewHolder.setData();
    }
}
