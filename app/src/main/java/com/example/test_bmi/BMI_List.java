package com.example.test_bmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BMI_List extends AppCompatActivity {

    private RecyclerView bmi_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi__list);

        Bundle bundle = getIntent().getExtras();

        String h = bundle.getString("height");
        String w = bundle.getString("weight");
        String bmi = bundle.getString("bmi");

        ArrayList<item_list>list = new ArrayList<>();
        bmi_list = (RecyclerView) findViewById(R.id.bmi_list);
        BMIAdapter adapter = new BMIAdapter(list);
        bmi_list.setAdapter(adapter);
        bmi_list.setLayoutManager(new LinearLayoutManager(this));

        item_list a = new item_list();
        a.setBmi(bmi);
        a.setBmi(h);
        a.setBmi(w);
        list.add(a);

    }
}
