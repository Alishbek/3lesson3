package com.example.a3lesson3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.text_view_name);
    }

    public void bind(String name){
        textViewName.setText(name);
    }
}
