package com.ijul.widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btn;


    private static final String[] CITIES = new String[]{
            "2166", "2167", "2168", "2169", "2170"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView editText = findViewById(R.id.auto);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CITIES);
        editText.setAdapter(adapter);




    ListView list = (ListView) findViewById(R.id.listviu);
    String[] namaHewan = {"77", "150", "233", "144", "249", "530", "550", "606", "808", "999", "1000", "11000", "1212", "2333", "3478", "3699", "4000"};
    ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namaHewan);
        list.setAdapter(myAdapter);


    btn = findViewById(R.id.buton);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
        }
    });

    }
}
