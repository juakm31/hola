package com.example.ejemplofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText tema;
    Spinner spinSeccion;
    Spinner spinAsignatura;
    Button registrar;

    private DatabaseReference clases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clases = FirebaseDatabase.getInstance().getReference("Clases");

        tema = (EditText) findViewById(R.id.txt_tema);
        spinAsignatura = (Spinner) findViewById(R.id.spin_asignatura);
        spinSeccion = (Spinner) findViewById(R.id.spin_seccion);
        registrar = (Button) findViewById(R.id.registrar);


    }

    public void registrarClase(View view){
        String seccionValor = spinSeccion.getSelectedItem().toString();
        tKey();
            Clases leccion = new Clases(id, seccionValor, asignaturaValor, temaValor);
            Toast.makeText(this, "Clase registrada", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Debe introducir un tema", Toast.LENGTH_SHORT).show();
        }
    }
}
