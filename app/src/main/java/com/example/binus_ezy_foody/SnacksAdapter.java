package com.example.binus_ezy_foody;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SnacksAdapter extends RecyclerView.Adapter<SnacksAdapter.ViewHolder> {
    ArrayList<SnacksModel> list;
    Context context;

    public SnacksAdapter(ArrayList<SnacksModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.snacksitems,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final  SnacksModel model = list.get(position);
        holder.snackImage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("price",model.getPrice());
                intent.putExtra("name",model.getName());
                intent.putExtra("type", 1);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //with reference to sample_main_food
        ImageView snackImage;
        TextView mainName, price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            snackImage = itemView.findViewById(R.id.snacksimage);
            mainName = itemView.findViewById(R.id.snacksname);
            price = itemView.findViewById(R.id.snacksprice);
        }
    }
}
