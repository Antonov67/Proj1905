package com.example.proj1905;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();

        String[] items = getResources().getStringArray(R.array.items);
        adapter = new MyAdapter(items);
        listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}