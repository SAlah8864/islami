package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView listofproducts;

ArrayList<list_products>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createlist();
        listofproducts=findViewById(R.id.recycler1);
        listofproducts.setAdapter(new product(list));
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        listofproducts.setLayoutManager(layoutManager);


    }
    public void createlist(){
        list=new ArrayList<list_products>();
        for (int i=1;i<150;i++){
            list.add(new list_products("laptop num:"+i,i*1000+"",R.drawable.ic_launcher_foreground));

        }



    }
}