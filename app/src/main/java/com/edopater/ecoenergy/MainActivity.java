package com.edopater.ecoenergy;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarar las variables y enlazarlas
        Button btn_home = findViewById(R.id.btn_home);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Generar una Ventana Emergente que de alguna información
                Toast.makeText(getApplicationContext(),"¡VAMOS ADELANTE!",Toast.LENGTH_SHORT).show();
                //Crear el intento de ir a la segunda página
                Intent irAPag2 = new Intent(MainActivity.this, MainActivity2.class);
                // Iniciamos el Intento
                startActivity(irAPag2);
            }
        });
    }
}