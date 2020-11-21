package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView cityList; // Reference to listview inside activity_main.xml
    ArrayAdapter<String> cityAdapter; // Bridge between dataList and cityList.
    ArrayList<String> dataList; // Holds the data that will go into the listview

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cityList = findViewById(R.id.city_list);

        dataList = new ArrayList<>();

        String []cities = {"Edmonton", "Vancouver", "Toronto", "Moscow","Sydney", "Beijing", "Osaka", "Tokyo"};

        dataList.addAll(Arrays.asList(cities));

        cityAdapter = new ArrayAdapter<>(this, R.layout.content, dataList);

        cityList.setAdapter(cityAdapter);

    }
}
