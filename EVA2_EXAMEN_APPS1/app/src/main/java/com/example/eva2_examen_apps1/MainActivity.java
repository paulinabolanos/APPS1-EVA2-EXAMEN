package com.example.eva2_examen_apps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Restaurante> listRes;
    int REQUEST_CODE = 11;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listRes = new ArrayList<>();

    }

    public void onClickRegistrar(View v){
        intent = new Intent(this,Registrar.class);
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            if (data.getExtras() != null) {
                listRes.add((Restaurante) data.getExtras().getSerializable("restaurante"));
                //Toast.makeText(this,"se agregó",Toast.LENGTH_SHORT).show();
                data.removeExtra("restaurante");
            }
        }
    }

    public void onClickMostrar(View v){
        intent = new Intent(this,Mostrar.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("lista",listRes);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    public ArrayList<Restaurante> getLista() {
        return listRes;
    }

    public void setLista(ArrayList<Restaurante> lista) {
        this.listRes = lista;
    }

    public void imprimir(View v){
        for (int i = 0;i < listRes.size();i++){
            Log.wtf("Restaurante", listRes.get(i).getNombre());
        }
    }

}
