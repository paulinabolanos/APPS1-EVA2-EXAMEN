package com.example.eva2_examen_apps1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Calificacion extends AppCompatActivity implements ImageView.OnClickListener {
    TextView txtVwNom, txtVwDesc, txtVwDir, txtVwTel;
    ImageView imgVwRes, imgVwEs1, imgVwEs2, imgVwEs3;
    Button btnGuardar;
    Intent intent;
    int estrella = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificacion);
        txtVwNom = findViewById(R.id.txtVwNom);
        txtVwDesc = findViewById(R.id.txtVwDesc);
        txtVwDir = findViewById(R.id.txtVwDir);
        txtVwTel = findViewById(R.id.txtVwTel);
        imgVwRes = findViewById(R.id.imgVwRes);
        imgVwEs1 = findViewById(R.id.imgVwEs1);
        imgVwEs2 = findViewById(R.id.imgVwEs2);
        imgVwEs3 = findViewById(R.id.imgVwEs3);
        btnGuardar = findViewById(R.id.btnGuardar);

        intent = getIntent();
        imgVwRes.setBackgroundResource(intent.getIntExtra("IMG",R.drawable.estrellaa));
        txtVwNom.setText(intent.getStringExtra("NAME"));
        txtVwDesc.setText(intent.getStringExtra("DESC"));
        txtVwDir.setText(intent.getStringExtra("DIR"));
        txtVwTel.setText(intent.getStringExtra("TEL"));

        imgVwEs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.getIntExtra("CALIF",1);
                imgVwEs1.setBackgroundResource(R.drawable.estrellaa);
                imgVwEs2.setBackgroundResource(R.drawable.estrellan);
                imgVwEs3.setBackgroundResource(R.drawable.estrellan);
                estrella = 1;
            }
        });
        imgVwEs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.getIntExtra("CALIF",2);
                imgVwEs1.setBackgroundResource(R.drawable.estrellaa);
                imgVwEs2.setBackgroundResource(R.drawable.estrellaa);
                imgVwEs3.setBackgroundResource(R.drawable.estrellan);
                estrella = 2;
            }
        });
        imgVwEs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.getIntExtra("CALIF",3);
                imgVwEs1.setBackgroundResource(R.drawable.estrellaa);
                imgVwEs2.setBackgroundResource(R.drawable.estrellaa);
                imgVwEs3.setBackgroundResource(R.drawable.estrellaa);
                estrella = 3;
            }
        });
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enviar = getIntent();
                enviar.putExtra("NEW",intent.getIntExtra("CALIF",estrella));
                enviar.putExtra("I",intent.getIntExtra("I",1));
                setResult(Activity.RESULT_OK,enviar);
                finish();
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
