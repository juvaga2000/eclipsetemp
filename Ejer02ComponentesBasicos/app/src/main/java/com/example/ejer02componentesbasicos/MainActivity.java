package com.example.ejer02componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> datos =new ArrayList<>();
        datos.add("Valladolid");
        datos.add("Zamora");
        datos.add("Soria");
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item,datos);
        Spinner desplegable=(Spinner)findViewById(R.id.spinner);
        desplegable.setAdapter(adaptador);

        EditText editText=((EditText)findViewById(R.id.editText));
        RadioGroup radioGroup=((RadioGroup)findViewById(R.id.radioGroup));
        CheckBox basket=((CheckBox)findViewById(R.id.checkBoxBaloncesto));
        CheckBox futbol=((CheckBox)findViewById(R.id.checkBoxFutbol));
        CheckBox tenis=((CheckBox)findViewById(R.id.checkBoxTenis));

        ((Button)findViewById(R.id.buttonGuardar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto=editText.getText().toString();

                int selectedId=-1;
                String radio="";
                selectedId = radioGroup.getCheckedRadioButtonId();
                if(selectedId!=-1){
                    RadioButton rb = (RadioButton) findViewById(selectedId);
                    radio=rb.getText().toString();
                }else{
                    radio="Ninguno";
                }

                String spinner=((Spinner)findViewById(R.id.spinner)).getSelectedItem().toString();

                boolean checkBox1=futbol.isChecked();
                boolean checkBox2=tenis.isChecked();
                boolean checkBox3=basket.isChecked();

                Log.d("Debug: ",texto+"  -  "+radio+"  -  "+spinner+"  -  Futbol:"+checkBox1+"  -  Tenis:"
                        +checkBox2+"  -  Basket:"+checkBox3);
            }
        });
    }
}