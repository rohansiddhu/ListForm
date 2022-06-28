package com.example.listform;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<String> {
    Context context;
    ArrayList<String> list;

    public Adapter(Context context, ArrayList<String> list) {
        super(context, R.layout.list_item, R.id.list_view_item, list);
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View current = convertView;

        if (current == null) {
            current = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        TextView name = current.findViewById(R.id.list_view_item);
        name.setText(list.get(position));

        return current;
    }
}
