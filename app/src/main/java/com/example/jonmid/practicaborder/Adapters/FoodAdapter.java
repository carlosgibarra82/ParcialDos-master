package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.practicaborder.Models.Food;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{
    List<Food> postList = new ArrayList<>();
    Context context;

    public FoodAdapter(List<Food> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    // ******************************************************************************

    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

        FoodAdapter.ViewHolder viewHolder = new FoodAdapter.ViewHolder(item2);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.id_txv_food_title.setText(postList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    // ******************************************************************************

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id_txv_food_title;

        public ViewHolder(View item) {
            super(item);

            id_txv_food_title = (TextView) item.findViewById(R.id.id_txv_food_title);

        }
    }
}
