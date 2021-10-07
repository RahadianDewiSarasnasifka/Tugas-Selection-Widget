package com.example.minggu4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private static final String [] Data = new String [] {
            "Golongan", "Jurusan", "Angkatan", "Prodi"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView editText = findViewById(R.id.auto);
        ArrayAdapter<String> adapter= new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,Data);
        editText.setAdapter(adapter);
    }
}