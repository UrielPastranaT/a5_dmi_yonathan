package com.example.gridviewyupt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity
{
    private GridView gvNombres;
    private Button btnGrid1;
    private Button btnGrid2;
    private ArrayList<Clientes> nombres;
    private AdapterGridV3 adapter;

    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        nombres = new ArrayList<Clientes>();
        nombres.add(new Clientes("Uriel", "Pastrana"));
        nombres.add(new Clientes("Kevin", "Camacho"));
        nombres.add(new Clientes("Yosef", "Flores"));
        nombres.add(new Clientes("Amado", "Perez"));
        nombres.add(new Clientes("Victor", "Nieves"));
        nombres.add(new Clientes("Jose", "Calisto"));
        nombres.add(new Clientes("Ainz", "Gown"));
        nombres.add(new Clientes("Aura", "Bella"));
        nombres.add(new Clientes("Martin", "Perez"));
        nombres.add(new Clientes("Rosendo", "Nava"));
        nombres.add(new Clientes("Shalltear", "Bloodfallen"));
        nombres.add(new Clientes("Monica", "Cruz"));
        nombres.add(new Clientes("Alberto", "Del Río"));
        nombres.add(new Clientes("Victor", "Perez"));
        nombres.add(new Clientes("Maria", "Nieves"));
        nombres.add(new Clientes("Chenco", "Pastrana"));
        nombres.add(new Clientes("Abel", "Camacho"));
        nombres.add(new Clientes("Roberto", "Flores"));
        nombres.add(new Clientes("Panfilo", "Perez"));
        nombres.add(new Clientes("Ramiro", "Hernandez"));
        nombres.add(new Clientes("Michelin", "Pastrana"));
        nombres.add(new Clientes("Lupe", "Reyes"));
        nombres.add(new Clientes("Toña", "Juarez"));
        nombres.add(new Clientes("Agustina", "Alvarez"));
        nombres.add(new Clientes("Josefa", "Ortiz"));

        gvNombres = (GridView)findViewById(R.id.gvNombres);
        adapter = new AdapterGridV3(this, R.layout.gridv3, nombres);
        gvNombres.setAdapter(adapter);

        gvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(ThirdActivity.this, "Has seleccionado: "+ nombres.get(position).getNombre() + " " + nombres.get(position).getApellidos(), Toast.LENGTH_LONG).show();
            }
        });

        btnGrid1 = (Button)findViewById(R.id.btnGrid1);
        btnGrid1.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                Intent viewGrid1 = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(viewGrid1);
            }
        });

        btnGrid2 = (Button)findViewById(R.id.btnGrid2);
        btnGrid2.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View view)
            {
                Intent viewGrid3 = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(viewGrid3);
            }
        });
    }
}
