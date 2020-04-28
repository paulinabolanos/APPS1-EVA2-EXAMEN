package com.example.eva2_examen_apps1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Registrar extends AppCompatActivity implements ImageView.OnClickListener{
    EditText edTxtNom, edTxtDesc, edTxtDir, edTxtTel;
    ImageView imgVwRes;

    Restaurante res;

    int idRes;

    int REQUEST_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        edTxtNom = findViewById(R.id.edTxtNom);
        edTxtDesc = findViewById(R.id.edTxtDesc);
        edTxtDir = findViewById(R.id.edTxtDir);
        edTxtTel = findViewById(R.id.edTxtTel);
        imgVwRes = findViewById(R.id.imgVwRes);





    }
    public void onClickGuardar(View v){
        //imagen
        Intent intent = new Intent();
        res = new Restaurante(idRes, edTxtNom.getText().toString(), edTxtDesc.getText().toString(),
                edTxtDir.getText().toString(), edTxtDir.getText().toString(),0);
        Bundle bundle = new Bundle();
        bundle.putSerializable("restaurante",res);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Imagenes.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {
            if (data.hasExtra("imagen")) {
                imgVwRes.setImageResource(data.getExtras().getInt("imagen"));
                idRes = data.getExtras().getInt("imagen");
                data.removeExtra("imagen");
            }
        }
    }



}
