package com.example.android.newdesignattempt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonlloyd on 2/6/17.
 */

public class ShipData {

    private List<ShipData> ships;

    String shipName;
    int shipCost;
    int shipId;


    ShipData(String shipName, int shipCost, int shipId) {
        this.shipName = shipName;
        this.shipCost = shipCost;
        this.shipId = shipId;

    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getShipCost() {
        return shipCost;
    }

    public void setShipCost(int shipCost) {
        this.shipCost = shipCost;
    }

    public int getShipId() {
        return shipId;
    }
    public void setShipId(int shipId) {
        this.shipId = shipId;
    }


    public static ArrayList<ShipData> getTempShips() {
        ArrayList<ShipData> ships = new ArrayList<>();
        ships.add(new ShipData("Assault Frigate Mark II A", 81, R.drawable.tn_ship_r_assault_frigate_mark_ii_a));
        ships.add(new ShipData("Assault Frigate Mark II B", 72, R.drawable.tn_ship_r_assault_frigate_mark_ii_b));
        ships.add(new ShipData("CR90 Corvette A", 44, R.drawable.tn_ship_r_cr90_corvette_a));
        ships.add(new ShipData("CR90 Corvette B", 44, R.drawable.tn_ship_r_cr90_corvette_b));
        ships.add(new ShipData("GR-75 Combat RetroFits", 44, R.drawable.tn_ship_r_gr_75_combat_retrofits));
        ships.add(new ShipData("GR-75 Medium Transports", 44, R.drawable.tn_ship_r_gr_75_medium_transports));
        ships.add(new ShipData("MC30c Scout Frigate", 44, R.drawable.tn_ship_r_mc30c_scout_frigate));
        ships.add(new ShipData("MC30c Torpedo Frigate", 44, R.drawable.tn_ship_r_mc30c_torpedo_frigate));
        ships.add(new ShipData("MC80 Assault Cruiser", 44, R.drawable.tn_ship_r_mc80_assault_cruiser));
        ships.add(new ShipData("MC80 Battle Cruiser", 44, R.drawable.tn_ship_r_mc80_battle_cruiser));
        ships.add(new ShipData("MC80 Command Cruiser", 44, R.drawable.tn_ship_r_mc80_command_cruiser));
        ships.add(new ShipData("MC80 Star Cruiser", 44, R.drawable.tn_ship_r_mc80_star_cruiser));
        ships.add(new ShipData("Modified Pelta-Class Assault Ship", 44, R.drawable.tn_ship_r_modified_pelta_class_assault_ship));
        ships.add(new ShipData("Modified Pelta-Class Command Ship", 44, R.drawable.tn_ship_r_modified_pelta_class_command_ship));
        ships.add(new ShipData("Nebulon-b Escort Frigate", 44, R.drawable.tn_ship_r_nebulon_b_escort_frigate));
        ships.add(new ShipData("Nebulon-b Support Refit", 44, R.drawable.tn_ship_r_nebulon_b_support_refit));

        return ships;

    }

}

