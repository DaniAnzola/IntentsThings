package com.example.intentsthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    private TextView tvNombre, tvCorreo, tvTelf;
    private String nombre, correo, telf;

    private Usuario u = new Usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        u = (Usuario) getIntent().getSerializableExtra("usuario");

        tvNombre = findViewById(R.id.tvNombre);
        tvCorreo = findViewById(R.id.tvCorreo);
        tvTelf = findViewById(R.id.tvTelf);

        tvNombre.setText(u.getNombre()+" "+u.getApellido());
        tvCorreo.setText(u.getCorreo());
        tvTelf.setText(u.getTelf());
    }
}