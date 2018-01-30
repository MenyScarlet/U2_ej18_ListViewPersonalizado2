package com.example.didact.u2_ej18_listviewpersonalizado2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCoches;
    ArrayList<Coches> lista_coches = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        lvCoches=(ListView)findViewById(R.id.lvCoches);
        AdaptadorCoche adaptador = new AdaptadorCoche(this,lista_coches);
        lvCoches.setAdapter(adaptador);



    }//FIN OnCreate

    private void cargarDatos(){

        lista_coches.add(new Coches("Seat","Alhambra","alhambra",13000));

        lista_coches.add(new Coches("Seat","Altea","altea",17500));

        lista_coches.add(new Coches("Seat","Arona","arona",12300));

        lista_coches.add(new Coches("Seat","Ateca","ateca",21500));

        lista_coches.add(new Coches("Seat","Bocanegra","bocanegra",19000));

        lista_coches.add(new Coches("Seat","Cupra","cupra",18500));

        lista_coches.add(new Coches("Seat","Leon","leon",14900));

        lista_coches.add(new Coches("Seat","Ibiza","ibiza",9000));


    }


}
