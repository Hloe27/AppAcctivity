package com.project.appacctivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo de boton enviar

    public  void  enviar(View view){
        Intent envian = new Intent(this, AppSegundoActivity.class);
        startActivity(envian);
    }
}