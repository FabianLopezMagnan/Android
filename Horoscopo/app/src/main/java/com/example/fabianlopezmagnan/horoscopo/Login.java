package com.example.fabianlopezmagnan.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    Button btnI,btnR;
    EditText nombre,clave;
    String n,c;
    ArrayList<User> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nombre = (EditText) findViewById(R.id.nombre);
        clave = (EditText) findViewById(R.id.clave);
        btnI = (Button) findViewById(R.id.btnI);
        btnR = (Button) findViewById(R.id.btnR);
        if(getIntent().getSerializableExtra("lista")!=null){
            lista=(ArrayList<User>) getIntent().getSerializableExtra("lista");
        }
        else{
            lista=new ArrayList<User>();
        }
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,Registro.class);
                i.putExtra("lista",lista);
                Toast.makeText(getBaseContext(),"Abriendo Registro...",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });


        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = nombre.getText().toString();
                c = clave.getText().toString();
                int com=0;
                int p=0;
                if(n.equals("")||c.equals("")){
                    Toast.makeText(getBaseContext(), "Complete los campos", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(lista.isEmpty()){
                        Toast.makeText(getBaseContext(), "No hay usuarios registrados", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getNombre().equals(n)) {
                                if (lista.get(i).getClave().equals(c)) {
                                    com = 1;
                                    p = i;
                                }
                            }
                        }
                        if (com == 1) {
                            Intent i = new Intent(Login.this, Inicio.class);
                            int anio = lista.get(p).getAnio();
                            String a = String.valueOf(anio);
                            i.putExtra("nombre", n);
                            i.putExtra("anio", a);
                            startActivity(i);
                            Toast.makeText(getBaseContext(), "Ingresando...", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getBaseContext(), "Usuario y/o contraseña incorrectas", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }
        });
    }

}
