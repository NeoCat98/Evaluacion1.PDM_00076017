package com.ejemplo.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR1;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR2;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR3;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR4;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR5;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR6;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR7;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR8;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CONTADOR9;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_CORREO;
import static com.ejemplo.evaluacion1.Utilities.AppConstants.INTENT_ARRAY_USUARIO;

public class MainActivity extends AppCompatActivity {

    private LinearLayout producto1,producto2,producto3,producto4,producto5,producto6,producto7,producto8,producto9;
    private TextView cont_producto1,cont_producto2,cont_producto3,cont_producto4,cont_producto5,cont_producto6,cont_producto7,cont_producto8,cont_producto9;
    private EditText et_usuario,et_correo;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info_xml();
        producto1.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto1.getText().toString());
            dato++;
            cont_producto1.setText(Integer.toString(dato));
        });

        producto2.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto2.getText().toString());
            dato++;
            cont_producto2.setText(Integer.toString(dato));
        });
        producto3.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto3.getText().toString());
            dato++;
            cont_producto3.setText(Integer.toString(dato));
        });
        producto4.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto4.getText().toString());
            dato++;
            cont_producto4.setText(Integer.toString(dato));
        });
        producto5.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto5.getText().toString());
            dato++;
            cont_producto5.setText(Integer.toString(dato));
        });
        producto6.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto6.getText().toString());
            dato++;
            cont_producto6.setText(Integer.toString(dato));
        });
        producto7.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto7.getText().toString());
            dato++;
            cont_producto7.setText(Integer.toString(dato));
        });
        producto8.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto8.getText().toString());
            dato++;
            cont_producto8.setText(Integer.toString(dato));
        });
        producto9.setOnClickListener(v->{
            int dato = Integer.parseInt(cont_producto9.getText().toString());
            dato++;
            cont_producto9.setText(Integer.toString(dato));
        });

        btn_send.setOnClickListener(v->{


            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            Bundle list = new Bundle();
            list.putString(INTENT_ARRAY_CONTADOR1,cont_producto1.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR2,cont_producto2.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR3,cont_producto3.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR4,cont_producto4.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR5,cont_producto5.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR6,cont_producto6.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR7,cont_producto7.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR8,cont_producto8.getText().toString());
            list.putString(INTENT_ARRAY_CONTADOR9,cont_producto9.getText().toString());
            list.putString(INTENT_ARRAY_CORREO,et_correo.getText().toString());
            list.putString(INTENT_ARRAY_USUARIO,et_usuario.getText().toString());
            intent.putExtras(list);
            startActivity(intent);
        });
    }

    public void info_xml(){
        producto1 = findViewById(R.id.producto1);
        producto2 = findViewById(R.id.producto2);
        producto3 = findViewById(R.id.producto3);
        producto4 = findViewById(R.id.producto4);
        producto5 = findViewById(R.id.producto5);
        producto6 = findViewById(R.id.producto6);
        producto7 = findViewById(R.id.producto7);
        producto8 = findViewById(R.id.producto8);
        producto9 = findViewById(R.id.producto9);

        cont_producto1 = findViewById(R.id.tv_producto1);
        cont_producto2 = findViewById(R.id.tv_producto2);
        cont_producto3 = findViewById(R.id.tv_producto3);
        cont_producto4 = findViewById(R.id.tv_producto4);
        cont_producto5 = findViewById(R.id.tv_producto5);
        cont_producto6 = findViewById(R.id.tv_producto6);
        cont_producto7 = findViewById(R.id.tv_producto7);
        cont_producto8 = findViewById(R.id.tv_producto8);
        cont_producto9 = findViewById(R.id.tv_producto9);

        et_correo = findViewById(R.id.et_correo);
        et_usuario = findViewById(R.id.et_usuario);

        btn_send = findViewById(R.id.btn_send);
    }
}
