package com.example.proj1905;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity extends AppCompatActivity {
    EditText editText;
    ListView listView;
    Button add, clear;
    ArrayAdapter adapter;
    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getSupportActionBar().hide();

        editText = findViewById(R.id.editText);
        listView = findViewById(R.id.list);
        add = findViewById(R.id.button_add);
        clear = findViewById(R.id.button_clear);

        items = new ArrayList<>();
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().length() > 0){
                    for (int i = 1; i <= Integer.parseInt(editText.getText().toString()); i++) {
                        items.add(i + "");
                    }
                    adapter.notifyDataSetChanged();
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.clear();
                adapter.notifyDataSetChanged();
            }
        });

    }
}