package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Model> list;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        populateList();
        myAdapter = new MyAdapter(this, list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

    }

    private void populateList() {
        list = new ArrayList<>();
        list.add(new Model("Menu_icon", R.drawable.menu_icon));
        list.add(new Model("Online_icon", R.drawable.online_icon));
        list.add(new Model("Order_icon", R.drawable.order_icon));
        list.add(new Model("Ptcl_icon", R.drawable.ptcl_icon));
        list.add(new Model("Service_icon", R.drawable.service_icon));
        list.add(new Model("Status_icon", R.drawable.status_icon));
        list.add(new Model("Wish_icon", R.drawable.wish_icon));
        list.add(new Model("Menu_icon", R.drawable.menu_icon));
        list.add(new Model("Online_icon", R.drawable.online_icon));
        list.add(new Model("Order_icon", R.drawable.order_icon));
        list.add(new Model("Ptcl_icon", R.drawable.ptcl_icon));
        list.add(new Model("Service_icon", R.drawable.service_icon));
        list.add(new Model("Status_icon", R.drawable.status_icon));
        list.add(new Model("Wish_icon", R.drawable.wish_icon));
        list.add(new Model("Menu_icon", R.drawable.menu_icon));
        list.add(new Model("Online_icon", R.drawable.online_icon));
        list.add(new Model("Order_icon", R.drawable.order_icon));
        list.add(new Model("Ptcl_icon", R.drawable.ptcl_icon));
        list.add(new Model("Service_icon", R.drawable.service_icon));
        list.add(new Model("Status_icon", R.drawable.status_icon));
        list.add(new Model("Wish_icon", R.drawable.wish_icon));
    }
}