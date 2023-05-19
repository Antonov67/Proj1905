package com.example.proj1905;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class MyAdapter extends BaseAdapter {

    String[] items;

    public MyAdapter(String[] items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list, viewGroup, false);
        }
        TextView textView = view.findViewById(R.id.textView2);
        textView.setText(items[i]);
        if (i % 2 == 0){
            textView.setBackgroundColor(ContextCompat.getColor(context, R.color.fon));
        }else {
            textView.setBackgroundColor(ContextCompat.getColor(context, R.color.button));
        }


        return view;
    }
}
