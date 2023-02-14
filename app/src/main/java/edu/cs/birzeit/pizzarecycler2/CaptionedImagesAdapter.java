package edu.cs.birzeit.pizzarecycler2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CaptionedImagesAdapter
        extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>{

    private String[] name;
    private String[] phones;
    private String[] items;
    private String[] totals;

    public CaptionedImagesAdapter(String[] name, String[] phones,String[] items, String[] totals){

        this.name = name;
        this.phones = phones;
        this.items = items;
        this.totals = totals;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView txt = (TextView)cardView.findViewById(R.id.txtName);
        txt.setText(name[position]);

        TextView txt1 = (TextView)cardView.findViewById(R.id.txtPhone);
        txt1.setText(phones[position]);

        TextView txt2 = (TextView)cardView.findViewById(R.id.txtItems);
        txt2.setText(items[position]);

        TextView txt3 = (TextView)cardView.findViewById(R.id.txtTotal);
        txt3.setText(totals[position]);


        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("test","Hello");
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
