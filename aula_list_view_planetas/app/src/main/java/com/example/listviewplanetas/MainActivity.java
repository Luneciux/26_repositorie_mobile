package com.example.listviewplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        String[] cidades = {"Quixada", "Quixada1", "Quixada2", "Quixada3", "Quixada4"};

        ListViewCustomAdapter adapter = new ListViewCustomAdapter(this, cidades);

        listView.setAdapter(adapter);
    }
}