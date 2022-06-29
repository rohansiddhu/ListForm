package com.example.listform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mListView = findViewById(R.id.list_view);

        Intent intent = getIntent();

        ArrayList<String> listData = new ArrayList<>();

        listData.add(intent.getStringExtra(MainActivity.FIRST_NAME) + " " + intent.getStringExtra(MainActivity.LAST_NAME));
        listData.add(intent.getStringExtra(MainActivity.REG_NO));
        listData.add(intent.getStringExtra(MainActivity.ROLL_NO));
        listData.add(intent.getStringExtra(MainActivity.SECTION));
        listData.add(intent.getStringExtra(MainActivity.MOBILE));
        listData.add(intent.getStringExtra(MainActivity.EMAIL));

        Adapter adapter = new Adapter(this, listData);
        mListView.setAdapter(adapter);
    }
}