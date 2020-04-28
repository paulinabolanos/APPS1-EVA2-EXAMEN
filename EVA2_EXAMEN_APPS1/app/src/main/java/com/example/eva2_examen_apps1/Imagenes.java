package com.example.eva2_examen_apps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Imagenes extends AppCompatActivity implements ImageView.OnClickListener{
    ImageView imgVwRes1, imgVwRes2,imgVwRes3, imgVwRes4, imgVwRes5,imgVwRes6, imgVwRes7, imgVwRes8,
            imgVwRes9, imgVwRes10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes);

        imgVwRes1 = findViewById(R.id.imgVwRes1);
        imgVwRes2 = findViewById(R.id.imgVwRes2);
        imgVwRes3 = findViewById(R.id.imgVwRes3);
        imgVwRes4 = findViewById(R.id.imgVwRes4);
        imgVwRes5 = findViewById(R.id.imgVwRes5);
        imgVwRes6 = findViewById(R.id.imgVwRes6);
        imgVwRes7 = findViewById(R.id.imgVwRes7);
        imgVwRes8 = findViewById(R.id.imgVwRes8);
        imgVwRes9 = findViewById(R.id.imgVwRes9);
        imgVwRes10 = findViewById(R.id.imgVwRes10);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()){
            case R.id.imgVwRes1:
                intent.putExtra("imagen",R.drawable.res1);
                break;
            case R.id.imgVwRes2:
                intent.putExtra("imagen", R.drawable.res2);
                break;
            case R.id.imgVwRes3:
                intent.putExtra("imagen", R.drawable.res3);
                break;
            case R.id.imgVwRes4:
                intent.putExtra("imagen", R.drawable.res4);
                break;
            case R.id.imgVwRes5:
                intent.putExtra("imagen", R.drawable.res5);
                break;
            case R.id.imgVwRes6:
                intent.putExtra("imagen", R.drawable.res6);
                break;
            case R.id.imgVwRes7:
                intent.putExtra("imagen", R.drawable.res7);
                break;
            case R.id.imgVwRes8:
                intent.putExtra("imagen", R.drawable.res8);
                break;
            case R.id.imgVwRes9:
                intent.putExtra("imagen", R.drawable.res9);
                break;
            case R.id.imgVwRes10:
                intent.putExtra("imagen", R.drawable.res10);
                break;
            default:
                break;
        }
        setResult(RESULT_OK, intent);

        finish();
    }
}
