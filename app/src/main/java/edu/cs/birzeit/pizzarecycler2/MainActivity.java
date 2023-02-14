package edu.cs.birzeit.pizzarecycler2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.pizza_recycler);

        String[] names = new String[Order.orders.length];
        String[] phones = new String[Order.orders.length];
        String[] items = new String[Order.orders.length];
        String[] totals = new String[Order.orders.length];

        for(int i = 0; i<names.length;i++){
            names[i] = Order.orders[i].getName();
            phones[i] = Order.orders[i].getPhone();
            items[i] = Order.orders[i].getItems();
            totals[i] = Order.orders[i].getTotal();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names,phones,items,totals);
        recycler.setAdapter(adapter);
    }


    public void Logout_Click(View view) {
        startActivity(new Intent(MainActivity.this, AcitivityLogin.class));
    }
}