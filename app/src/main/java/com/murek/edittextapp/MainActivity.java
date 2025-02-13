package com.murek.edittextapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.murek.edittextapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    public void Registrar(View view) {
        String nombre = binding.etNombre.getText().toString();
        String password = binding.etPass.getText().toString();

        if (nombre.isEmpty()) {
            binding.etNombre.setError("Debes agregar un Nombre");
        }
        if (password.isEmpty()) {
            binding.etNombre.setError("Debes agregar una Contraseña");
        }
        if (nombre.length() < 3) {
            binding.etNombre.setError("El nombre debe tener al menos 3 caracteres");
        }
        if (nombre.length() > 3 && password.length() > 3) {
            Toast.makeText(this, "El nombre es: " + nombre + " y la contraseña es: " + password, Toast.LENGTH_SHORT).show();
        }
    }

}