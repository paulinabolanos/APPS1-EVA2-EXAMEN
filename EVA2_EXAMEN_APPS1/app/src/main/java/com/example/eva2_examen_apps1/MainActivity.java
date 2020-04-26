package com.example.eva2_examen_apps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnVerRes, btnReRes;
    int REQUEST_CODE = 11;
    Intent i;
    ArrayList<Restaurante> listRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVerRes = findViewById(R.id.btnVerRes);
        btnReRes = findViewById(R.id.btnReRes);

    }

    public void onClickRegistrar(View v){
        i = new Intent(this,Registrar.class);
        startActivityForResult(i,REQUEST_CODE);
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
        i = new Intent(this,Mostrar.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("lista",listRes);
        i.putExtras(bundle);
        startActivity(i);

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
