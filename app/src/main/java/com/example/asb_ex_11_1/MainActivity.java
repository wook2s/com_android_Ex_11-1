package com.example.asb_ex_11_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("list view test");

        String[] mid = {"히어로즈", "24시", "로스트", "스몰빌", "탐정몽크", "빅뱅이론","프렌즈","덱스터", "글리","가십걸","테이큰","테이큰2","테이큰3"};

        ListView listView1 = (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, mid);

        //--------------체크박스 --------------------------------
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_multiple_choice, mid);
        listView1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        //listView1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        //------------------------------------------------------

        listView1.setAdapter(adapter2);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, mid[i]+"", Toast.LENGTH_SHORT).show();
            }
        });

    }
}