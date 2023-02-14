package edu.cs.birzeit.pizzarecycler2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        RecyclerView recyclerView=findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item("puck","30",R.drawable.a));
        items.add(new item("hotdog","30",R.drawable.b));
        items.add(new item("burger","30",R.drawable.c));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter(getApplicationContext(),items));
    }

    public void Buy_Click(View view) {
        String name = viewholder.Name;
        String price = String.valueOf(viewholder.Price)+"$";
        String phone = AcitivityLogin.hisphone;
        String hisname = AcitivityLogin.hisname;
        Order.orders[1].setItems(name);
        Order.orders[1].setName(hisname);
        Order.orders[1].setPhone(phone);
        Order.orders[1].setTotal(price);

    }

    public void Logout2_Click(View view) {
        startActivity(new Intent(MainMenu.this, AcitivityLogin.class));
    }
}