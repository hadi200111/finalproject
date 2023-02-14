package edu.cs.birzeit.pizzarecycler2;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView name,price;
    EditText username;
    final RelativeLayout relativeLayout;
    public static String Name = "";
    public static int Price = 0;
    public viewholder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageveiw);
        name=itemView.findViewById(R.id.name);
        price=itemView.findViewById(R.id.price);
        relativeLayout = itemView.findViewById(R.id.v);


        itemView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                name =  itemView.findViewById(R.id.name);
                Name = Name + name.getText().toString() + "\n";
                price = itemView.findViewById(R.id.price);
                Price = Price + Integer.parseInt(price.getText().toString());
                relativeLayout.setBackgroundResource(R.color.teal_200);

            }
        });
    }

}
