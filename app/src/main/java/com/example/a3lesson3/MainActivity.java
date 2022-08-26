package com.example.a3lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        names.add("Джек Воробей");
        names.add("Санта Клаус");
        names.add("Супермен");
        names.add("Железный Человек");
        names.add("Бетмен");
        names.add("Гарри Поттер");
        names.add("Скрудж Макдак");
        names.add("Алладин");
        names.add("Пумба");
        names.add("Золушка");
        names.add("Молния Маквин");
        names.add("Белоснежка");
        NameAdapter nameAdapter = new NameAdapter(names);
        recyclerView.setAdapter(nameAdapter);
    }
}