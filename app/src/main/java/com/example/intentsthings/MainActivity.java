package com.example.intentsthings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText etNombre, etCorreo, etTelefono, etContrasenia, etConfContrasenia, etApellido, etDni;
private Button btnRegistro;

private String nombre, correo, apellido, dni, contrasenia, confContrasenia, telf;
private boolean verificado;


private Usuario u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //*esto es para crear variables y llamarlas y buscarlas
        etNombre = findViewById(R.id.etNombre);
        etCorreo = findViewById(R.id.etCorreo);
        etTelefono = findViewById(R.id.etTelefono);
        etContrasenia = findViewById(R.id.etContrasenia);
        etConfContrasenia = findViewById(R.id.etConfContrasenia);
        etApellido = findViewById(R.id.etApellido);
        etDni = findViewById(R.id.etDni);
        btnRegistro = findViewById(R.id.btnRegistro);
        //private String nombre, corre, apellido, dni, contrasenia, confContrasenia;
       btnRegistro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               nombre = etNombre.getText().toString().trim();
               correo = etCorreo.getText().toString().trim();
               telf = etTelefono.getText().toString().trim();
               contrasenia = etContrasenia.getText().toString().trim();
               confContrasenia = etConfContrasenia.getText().toString().trim();
               apellido = etApellido.getText().toString().trim();
               dni = etDni.getText().toString().trim();


               verificado = verificarDatos(nombre,correo,telf,contrasenia,confContrasenia,apellido,dni);

               if(verificado==true){
                   u = new Usuario(dni,correo,contrasenia,nombre,apellido,telf,true);

                   Intent i = new Intent(MainActivity.this, PerfilActivity.class);
                   i.putExtra("usuario", u);


                   startActivity(i);
               }else{
                   Toast.makeText(MainActivity.this, "Revisa todos los campos ", Toast.LENGTH_SHORT).show();
               }
           }
       });
       
    }

    private boolean verificarDatos(String nombre, String correo, String telefono, String contra, String contraConf, String apellido, String dni) {
        boolean a;
        if(contra.equals(contraConf)){
            if(nombre.isEmpty()
                    || correo.isEmpty()
                    || String.valueOf(telefono).isEmpty()
                    || contra.isEmpty()
                    || contraConf.isEmpty()
                    || apellido.isEmpty()
                    || dni.isEmpty()){

                //* esto es para validar la cosas de la app//**
                a = false;
            }else{
                a = true;
            }
        }else{
            etContrasenia.setText("");
            etConfContrasenia.setText("");
            a = false;
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();

        }

        return a;
    }

}