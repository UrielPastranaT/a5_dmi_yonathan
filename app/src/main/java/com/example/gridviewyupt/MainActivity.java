package com.example.gridviewyupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private GridView gvNombres;
    private Button btnGrid2;
    private Button btnGrid3;
    private ArrayList<String> nombres;
    private ArrayAdapter adapter;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = new ArrayList<String>();
        nombres.add("Uriel");
        nombres.add("Yosef");
        nombres.add("Yonathan");
        nombres.add("Amado");
        nombres.add("Kevin");
        nombres.add("Jose");
        nombres.add("Miguelito");
        nombres.add("Panfilo");
        nombres.add("Filomeno");
        nombres.add("Rasputin");
        nombres.add("Abel");
        nombres.add("Victor");
        nombres.add("Tereza");
        nombres.add("Maria");
        nombres.add("Angela");
        nombres.add("Napoleon");
        nombres.add("Yuki");
        nombres.add("Carla");
        nombres.add("Josefa");
        nombres.add("Eleonor");
        nombres.add("Miguel");
        nombres.add("Rambo");
        nombres.add("Ainz");
        nombres.add("Albedo");
        nombres.add("Demiurge");
        nombres.add("Mare");
        nombres.add("Aura");
        nombres.add("Shalltear");
        nombres.add("Sebas");
        nombres.add("Kimiko");

        gvNombres = (GridView)findViewById(R.id.gvNombres);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nombres);
        gvNombres.setAdapter(adapter);

        gvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "Has seleccionado: "+ nombres.get(position), Toast.LENGTH_LONG).show();
            }
        });

        btnGrid2 = (Button)findViewById(R.id.btnGrid2);
        btnGrid2.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                Intent viewGrid2 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(viewGrid2);
            }
        });

        btnGrid3 = (Button)findViewById(R.id.btnGrid3);
        btnGrid3.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                Intent viewGrid3 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(viewGrid3);
            }
        });
    }
}