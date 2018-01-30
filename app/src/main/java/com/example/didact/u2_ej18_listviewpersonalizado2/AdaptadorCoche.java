package com.example.didact.u2_ej18_listviewpersonalizado2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 30/01/2018.
 */

public class AdaptadorCoche extends ArrayAdapter<Coches> {

    ArrayList<Coches> coches;
    Context c;

    public AdaptadorCoche(Context c, ArrayList<Coches> coches){
        super(c,R.layout.item_coche,coches);
        this.c = c;
        this.coches = coches;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_coche,null);

        //TextView Nombre
        TextView tv_tvmarca=(TextView)item.findViewById(R.id.item_tvmarca);
        tv_tvmarca.setText(coches.get(position).getMarca());

        //TextView Estadio
        TextView tv_tvmodelo=(TextView)item.findViewById(R.id.item_tvmodelo);
        tv_tvmodelo.setText(coches.get(position).getModelo());

        //ImagenView
        String imagen = coches.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen,"drawable",c.getPackageName());

        ImageView iv_imagen = (ImageView)item.findViewById(R.id.item_imagencoche);

        iv_imagen.setImageResource(idImagen);

        return item;
    }
}

