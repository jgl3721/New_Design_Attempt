package com.example.android.newdesignattempt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonlloyd on 2/8/17.
 */

public class SquadronData {

        private List<SquadronData> squadrons;

        private String squadronName;
        private int squadronCost;
        private int squadronId;
        private String uniqueSquad;


        private SquadronData(String uniqueSquad, String squadronName, int squadronCost, int squadronId) {
            this.uniqueSquad = uniqueSquad;
            this.squadronName = squadronName;
            this.squadronCost = squadronCost;
            this.squadronId = squadronId;

        }

    public String getUniqueSquad(){
        return uniqueSquad;
    }

    public void setUniqueSquad(java.lang.String uniqueSquad) {
        this.uniqueSquad = uniqueSquad;
    }

    public String getSquadronName() {
            return squadronName;
        }

        public void setSquadronName(String squadronName) {
            this.squadronName = squadronName;
        }

        public int getSquadronCost() {
            return squadronCost;
        }

        public void setSquadronCost(int squadronCost) {
            this.squadronCost = squadronCost;
        }

        public int getSquadronId() {
            return squadronId;
        }
        public void setSquadronId(int squadronId) {
            this.squadronId = squadronId;
        }


        public static ArrayList<SquadronData> getTempSquads() {
            ArrayList<SquadronData> squads = new ArrayList<>();
            squads.add(new SquadronData("", "A-Wing Squadron", 11, R.drawable.squadron_r_a_wing_squadron));
            squads.add(new SquadronData("Tycho Chelchu", "A-Wing Squadron", 16, R.drawable.squadron_r_tycho_celchu));
            squads.add(new SquadronData("", "B-wing Squadron", 14, R.drawable.squadron_r_b_wing_squadron));
            squads.add(new SquadronData("Keyan Farlander", "B-Wing Squadron", 20, R.drawable.squadron_r_keyan_farlander));
            squads.add(new SquadronData("", "E-Wing Squadron", 15, R.drawable.squadron_r_e_wing_squadron));
            squads.add(new SquadronData("Corran Horn", "E-Wing Squadron", 22, R.drawable.squadron_r_corran_horn_e_wing_squadron));
            squads.add(new SquadronData("", "HWK-290", 12, R.drawable.squadron_r_hwk_290));
            squads.add(new SquadronData("Jan Ors", "HWK-290", 19, R.drawable.squadron_r_jan_ors));
            squads.add(new SquadronData("", "Lancer-Class Pursuit Craft", 15, R.drawable.squadron_r_lancer_class_pursuit_craft));
            squads.add(new SquadronData("Ketsu Onyo", "Lancer-Class Pursuit Craft", 22, R.drawable.squadron_r_ketsu_onyo_shadow_caster));
            squads.add(new SquadronData("", "Scurrg H-6 Bomber", 16, R.drawable.squadron_r_scurrg_h_6_bomber));
            squads.add(new SquadronData("Nym", " Havoc / Scurrg H-6 Bomber", 21, R.drawable.squadron_r_nym));
            squads.add(new SquadronData("", "VCX-100 Freighter", 15, R.drawable.squadron_r_vcx_100_freighter));
            squads.add(new SquadronData("Hera Syndulla", "Ghost / VCX-100 Freighter", 28, R.drawable.squadron_r_hera_syndulla));
            squads.add(new SquadronData("", "X-Wing Squadron", 13, R.drawable.squadron_r_xwing_squadron));
            squads.add(new SquadronData("Wedge Antilles", "X-Wing Squadron", 19, R.drawable.squadron_r_wedge_antilles));
            squads.add(new SquadronData("Luke Skywalker", "X-Wing Squadron", 20, R.drawable.tn_ship_r_nebulon_b_support_refit));
            squads.add(new SquadronData("", "Y-Wing Squadron", 10, R.drawable.squadron_r_y_wing_squadron));
            squads.add(new SquadronData("Dutch Vander", "Y-Wing Squadron", 16, R.drawable.squadron_r_dutch_vander));
            squads.add(new SquadronData("", "YT-1300", 13, R.drawable.squadron_r_yt_1300));
            squads.add(new SquadronData("Han Solo", "YT-1300", 26, R.drawable.squadron_r_han_solo));
            squads.add(new SquadronData("", "YT-2400", 16, R.drawable.squadron_r_yt_2400));
            squads.add(new SquadronData("Dash Rendar", "YT-2400", 24, R.drawable.squadron_r_dash_rendar));
            squads.add(new SquadronData("", "z-95 Headhunter Squadron", 7, R.drawable.squadron_r_z_95_headhunter_squadron));
            squads.add(new SquadronData("Lieutenant Blount", "z-95 Headhunter Squadron", 14, R.drawable.squadron_r_lieutenant_blount_z_95_headhunter));

            return squads;

        }

    }
