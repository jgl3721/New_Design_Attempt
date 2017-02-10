package com.example.android.newdesignattempt;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView, squadRecyclerView;

    private ShipAdapter adapter;

    private SquadAdapter squadAdapter;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        squadRecyclerView=(RecyclerView) findViewById(R.id.squad_recycler_view);



        adapter = new ShipAdapter(ShipData.getTempShips());
       squadAdapter = new SquadAdapter(SquadronData.getTempSquads());

        LinearLayoutManager shipHorizontalLayoutManager
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(shipHorizontalLayoutManager);

        LinearLayoutManager squadHorizontalLayoutManager
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        squadRecyclerView.setLayoutManager(squadHorizontalLayoutManager);


        recyclerView.setAdapter(adapter);
        squadRecyclerView.setAdapter(squadAdapter);

    }

}

