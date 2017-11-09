package com.example.fabianlopezmagnan.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Registro extends AppCompatActivity {

    Button btnR,btnL;
    EditText nombre,clave,anio;
    int a;
    ArrayList<User> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = (EditText) findViewById(R.id.nombre);
        clave = (EditText) findViewById(R.id.clave);
        anio = (EditText) findViewById(R.id.anio);
        btnL = (Button) findViewById(R.id.btnL);
        btnR = (Button) findViewById(R.id.btnR);
        lista=(ArrayList<User>) getIntent().getSerializableExtra("lista");

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom=nombre.getText().toString();
                String pass=clave.getText().toString();
                String an=anio.getText().toString();
                int a=Integer.parseInt(an);
                if(nom.trim().equals("")||pass.trim().equals("")||an.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Complete los campos",Toast.LENGTH_SHORT).show();
                }
                else if(a<2017){
                    if(lista.isEmpty()) {
                        User u = new User(nom, pass, a);
                        lista.add(u);
                        Intent i = new Intent(Registro.this, Login.class);
                        i.putExtra("lista", lista);
                        Toast.makeText(getBaseContext(), "Registrando cuenta...", Toast.LENGTH_SHORT).show();
                        startActivity(i);
                    }
                    else{
                        int comp=0;
                        for(int i=0;i<lista.size();i++){
                            if(lista.get(i).getNombre().equals(nom)){
                                comp=1;
                            }
                        }
                        if(comp==1){
                            Toast.makeText(getBaseContext(),"Esta cuenta ya existe",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            User u=new User(nom,pass,a);
                            lista.add(u);
                            Intent i = new Intent(Registro.this,Login.class);
                            i.putExtra("lista",lista);
                            Toast.makeText(getBaseContext(),"Registrando cuenta...",Toast.LENGTH_SHORT).show();
                            startActivity(i);
                        }
                    }
                }
                else{
                    Toast.makeText(getBaseContext(),"Ingrese un año valido",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registro.this,Login.class);
                Toast.makeText(getBaseContext(),"Ir a Login...",Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

    }
}
