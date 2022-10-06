package com.example.gridviewyupt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterGridV3 extends BaseAdapter
{
    private Context context;
    private int layout;
    private ArrayList<Clientes> clientes;

    public AdapterGridV3(Context context, int layout, ArrayList<Clientes> clientes)
    {
        this.context = context;
        this.layout = layout;
        this.clientes = clientes;
    }

    @Override public int getCount()
    {
        return clientes.size();
    }

    @Override public Object getItem(int position)
    {
        return clientes.get(position);
    }

    @Override public long getItemId(int id)
    {
        return id;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup)
    {
        Clientes datos = clientes.get(position);

        View v = view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.gridv3, null);

        TextView tvNombre = (TextView)v.findViewById(R.id.tvNombre);
        TextView tvApellidos = (TextView)v.findViewById(R.id.tvApellidos);

        tvNombre.setText(datos.getNombre());
        tvApellidos.setText(datos.getApellidos());

        return v;
    }
}
