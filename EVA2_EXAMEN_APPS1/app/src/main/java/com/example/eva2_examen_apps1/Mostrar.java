package com.example.eva2_examen_apps1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Mostrar extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listVwRes;
    ArrayList<Restaurante> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        listVwRes = findViewById(R.id.listVwRes);
        lista = (ArrayList<Restaurante>) getIntent().getExtras().getSerializable("lista");
        listVwRes.setAdapter(new RestauranteAdapter(this, R.layout.activity_mostrar, lista));
        listVwRes.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == Activity.RESULT_OK){ //Comparacion de la seleccion del usuario
            int cali = data.getIntExtra("NEW",0);
            int position = data.getIntExtra("I",1);
            listVwRes.setAdapter(new RestauranteAdapter(this, R.layout.activity_mostrar, lista));

        }else {

        }
    }
}
