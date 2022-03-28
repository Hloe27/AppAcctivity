package com.project.appacctivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppSegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_segundo);
    }

    //metodo para el segundo

    public void regresar(View view){
        Intent Regresar= new Intent(this, MainActivity.class);
        startActivity(Regresar);
    }
}