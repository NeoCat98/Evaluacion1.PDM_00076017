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

public class Main2Activity extends AppCompatActivity {

    private TextView cont_producto1,cont_producto2,cont_producto3,cont_producto4,cont_producto5,cont_producto6,cont_producto7,cont_producto8,cont_producto9;
    private String cont1,cont2,cont3,cont4,cont5,cont6,cont7,cont8,cont9;
    private TextView tv_totalproducto,tv_username,tv_correo;
    private String usuario,correo;
    private Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        datos();

        Intent m_intent = this.getIntent();
        if(m_intent !=  null){
            Bundle m;
            m = m_intent.getExtras();
            usuario = m.getString(INTENT_ARRAY_USUARIO);
            correo = m.getString(INTENT_ARRAY_CORREO);
            cont1= m.getString(INTENT_ARRAY_CONTADOR1);
            cont2= m.getString(INTENT_ARRAY_CONTADOR2);
            cont3= m.getString(INTENT_ARRAY_CONTADOR3);
            cont4= m.getString(INTENT_ARRAY_CONTADOR4);
            cont5= m.getString(INTENT_ARRAY_CONTADOR5);
            cont6= m.getString(INTENT_ARRAY_CONTADOR6);
            cont7= m.getString(INTENT_ARRAY_CONTADOR7);
            cont8= m.getString(INTENT_ARRAY_CONTADOR8);
            cont9= m.getString(INTENT_ARRAY_CONTADOR9);
            cont_producto1.setText(cont1);
            cont_producto2.setText(cont2);
            cont_producto3.setText(cont3);
            cont_producto4.setText(cont4);
            cont_producto5.setText(cont5);
            cont_producto6.setText(cont6);
            cont_producto7.setText(cont7);
            cont_producto8.setText(cont8);
            cont_producto9.setText(cont9);
            int result;
            result = Integer.parseInt(cont1)+Integer.parseInt(cont2)
                    +Integer.parseInt(cont3)+Integer.parseInt(cont4)
                    +Integer.parseInt(cont5)+Integer.parseInt(cont6)
                    +Integer.parseInt(cont7)+Integer.parseInt(cont8)
                    +Integer.parseInt(cont9);
            String total = Integer.toString(result);
            tv_totalproducto.setText("Total del producto: "+total);
            tv_username.setText("User: "+usuario);
            tv_correo.setText("Correo: "+correo);
        }
        btn_share.setOnClickListener(v->{
            Intent intent = new Intent();

            String result="Detalles";
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plane");
            intent.putExtra(Intent.EXTRA_TEXT,result);
            startActivity(intent);
        });
    }

    void datos(){
        cont_producto1 = findViewById(R.id.tv_cont_producto1);
        cont_producto2 = findViewById(R.id.tv_cont_producto2);
        cont_producto3 = findViewById(R.id.tv_cont_producto3);
        cont_producto4 = findViewById(R.id.tv_cont_producto4);
        cont_producto5 = findViewById(R.id.tv_cont_producto5);
        cont_producto6 = findViewById(R.id.tv_cont_producto6);
        cont_producto7 = findViewById(R.id.tv_cont_producto7);
        cont_producto8 = findViewById(R.id.tv_cont_producto8);
        cont_producto9 = findViewById(R.id.tv_cont_producto9);
        tv_totalproducto = findViewById(R.id.tv_contador_producto);
        tv_username = findViewById(R.id.tv_usuario);
        tv_correo = findViewById(R.id.tv_correo);
        btn_share = findViewById(R.id.btn_share);
    }
}
