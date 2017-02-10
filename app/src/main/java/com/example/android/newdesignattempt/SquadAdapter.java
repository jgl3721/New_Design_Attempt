package com.example.android.newdesignattempt;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jasonlloyd on 2/9/17.
 */


 public class SquadAdapter extends RecyclerView.Adapter<SquadAdapter.ViewHolder>{

        private ArrayList<SquadronData> squads;

        public static class ViewHolder extends RecyclerView.ViewHolder {
            public TextView squadronName;
            public TextView uniqueSquad;
            public ImageView squadronId;
            public TextView squadronCost;

            public ViewHolder(View view) {
                super(view);
                squadronName = (TextView)view.findViewById(R.id.squad_name);
                uniqueSquad = (TextView) view.findViewById(R.id.unique_squad);
                squadronId = (ImageView)view.findViewById(R.id.squad_avatar);
                squadronCost = (TextView) view.findViewById(R.id.squad_cost);

            }
        }


        public SquadAdapter(ArrayList<SquadronData> squads) {
            this.squads = squads;
        }

        @Override
        public SquadAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.squad_card_layout, parent, false);

            SquadAdapter.ViewHolder viewHolder = new SquadAdapter.ViewHolder(view);
            return viewHolder;
        }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SquadronData squadronData = squads.get(position);
        holder.squadronName.setText(String.valueOf(squadronData.getSquadronName()));
        holder.uniqueSquad.setText(String.valueOf(squadronData.getUniqueSquad()));
        holder.squadronCost.setText(String.valueOf(squadronData.getSquadronCost()));
        holder.squadronId.setImageResource(squadronData.getSquadronId());
    }

        @Override
        public int getItemCount() {
            return squads.size();
        }

    }


