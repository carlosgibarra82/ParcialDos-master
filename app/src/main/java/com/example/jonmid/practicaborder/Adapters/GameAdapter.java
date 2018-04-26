package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.practicaborder.Models.Game;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder>{
    List<Game> postList = new ArrayList<>();
    Context context;

    public GameAdapter(List<Game> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    // ******************************************************************************

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false);

        GameAdapter.ViewHolder viewHolder = new GameAdapter.ViewHolder(item2);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.Name.setText(postList.get(position).getName());
        holder.Character.setText(postList.get(position).getCharacter());
        holder.GameSeries.setText(postList.get(position).getGameseries());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    // ******************************************************************************

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        TextView GameSeries;
        TextView Character;

        public ViewHolder(View item) {
            super(item);

            Name = (TextView) item.findViewById(R.id.id_txv_game_name);
            GameSeries = (TextView) item.findViewById(R.id.id_txv_game_gameseries);
            Character = (TextView) item.findViewById(R.id.id_txv_game_character);

        }
    }
}
