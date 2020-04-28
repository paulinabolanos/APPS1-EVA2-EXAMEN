package com.example.eva2_examen_apps1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class RestauranteAdapter extends ArrayAdapter<Restaurante> {
    Context context;
    int resource;
    ArrayList<Restaurante> listRest;

    public RestauranteAdapter(Context context, int resource, ArrayList<Restaurante> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.listRest = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgVwRes, imgVwEs1, imgVwEs2, imgVwEs3;
        TextView txtVwNom, txtVwDesc, txtVwDir, txtVwTel;



        //ConvertView es el layout que representa una fila en la lista
        if (convertView == null){
            //Crear nuestro Layout
            //Inflater
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            convertView = layoutInflater.inflate(resource, parent, false);
        }
        imgVwRes = convertView.findViewById(R.id.imgVwRes);
        txtVwNom = convertView.findViewById(R.id.txtVwNom);
        txtVwDesc = convertView.findViewById(R.id.txtVwDesc);
        txtVwDir = convertView.findViewById(R.id.txtVwDir);
        txtVwTel = convertView.findViewById(R.id.txtVwTel);
        imgVwEs1 = convertView.findViewById(R.id.imgVwEs1);
        imgVwEs2 = convertView.findViewById(R.id.imgVwEs2);
        imgVwEs3 = convertView.findViewById(R.id.imgVwEs3);


        imgVwRes.setImageResource(listRest.get(position).getImagen());
        txtVwNom.setText(listRest.get(position).getNombre());
        txtVwDesc.setText(listRest.get(position).getDescripcion());
        txtVwDir.setText(listRest.get(position).getDireccion());
        txtVwTel.setText(listRest.get(position).getTelefono());
        switch(listRest.get(position).getCalificacion()){
            case 1:
                imgVwEs1.setBackgroundResource(R.drawable.estrellaA);
                imgVwEs2.setBackgroundResource(R.drawable.estrellaN);
                imgVwEs3.setBackgroundResource(R.drawable.estrellaN);
                break;
            case 2:
                imgVwEs1.setBackgroundResource(R.drawable.estrellaA);
                imgVwEs2.setBackgroundResource(R.drawable.estrellaA);
                imgVwEs3.setBackgroundResource(R.drawable.estrellaN);
                break;
            case 3:
                imgVwEs1.setBackgroundResource(R.drawable.estrellaA);
                imgVwEs2.setBackgroundResource(R.drawable.estrellaA);
                imgVwEs3.setBackgroundResource(R.drawable.estrellaA);
                break;
            default:
                imgVwEs1.setBackgroundResource(R.drawable.estrellaN);
                imgVwEs2.setBackgroundResource(R.drawable.estrellaN);
                imgVwEs3.setBackgroundResource(R.drawable.estrellaN);
                break;
        }
        return convertView;
    }
}
