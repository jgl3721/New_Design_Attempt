package com.example.android.newdesignattempt;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jasonlloyd on 1/31/17.
 */

public class ShipAdapter extends RecyclerView.Adapter<ShipAdapter.ViewHolder>{

   private ArrayList<ShipData> ships;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView shipName;
        public ImageView shipId;
        public TextView shipCost;

        public ViewHolder(View view) {
            super(view);
            shipName = (TextView)view.findViewById(R.id.ship_name);
            shipId = (ImageView)view.findViewById(R.id.ship_avatar);
            shipCost = (TextView) view.findViewById(R.id.ship_cost);

        }
    }


    public ShipAdapter(ArrayList<ShipData> ships) {
        this.ships = ships;
    }

    @Override
    public ShipAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ShipAdapter.ViewHolder holder, int position) {
        ShipData shipData = ships.get(position);
        holder.shipName.setText(String.valueOf(shipData.getShipName()));
        holder.shipCost.setText(String.valueOf(shipData.getShipCost()));
        holder.shipId.setImageResource(shipData.getShipId());
    }


    @Override
    public int getItemCount() {
        return ships.size();
    }

}

