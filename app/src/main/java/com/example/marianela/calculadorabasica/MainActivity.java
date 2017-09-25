package com.example.marianela.calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText cajaUno;
    private EditText cajaDos;
    private Button Boton;
    private TextView cajaResul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaUno=(EditText)findViewById(R.id.caja1);
        cajaDos= (EditText) findViewById(R.id.caja2);
        cajaResul= (TextView) findViewById(R.id.resultado);



    }

    public void sumar (View view){

        String c1=cajaUno.getText().toString();
        String c2=cajaDos.getText().toString();

        int a=Integer.parseInt(c1);
        int b=Integer.parseInt(c2);
        int res=a+b;
        cajaResul.setText(""+res);


    }
    public void restar (View view){
        cajaUno=(EditText)findViewById(R.id.caja1);
        cajaDos= (EditText) findViewById(R.id.caja2);
        cajaResul= (TextView) findViewById(R.id.resultado);


        String c1=cajaUno.getText().toString();
        String c2=cajaDos.getText().toString();

        int a=Integer.parseInt(c1);
        int b=Integer.parseInt(c2);
        int res=a-b;
        cajaResul.setText(""+res);
    }

    public void mult (View view){
        cajaUno=(EditText)findViewById(R.id.caja1);
        cajaDos= (EditText) findViewById(R.id.caja2);
        cajaResul= (TextView) findViewById(R.id.resultado);


        String c1=cajaUno.getText().toString();
        String c2=cajaDos.getText().toString();

        int a=Integer.parseInt(c1);
        int b=Integer.parseInt(c2);
        int res=a*b;
        cajaResul.setText(""+res);
    }

    public void div (View view){
        cajaUno=(EditText)findViewById(R.id.caja1);
        cajaDos= (EditText) findViewById(R.id.caja2);
        cajaResul= (TextView) findViewById(R.id.resultado);

        String c1=cajaUno.getText().toString();
        String c2=cajaDos.getText().toString();

        int a=Integer.parseInt(c1);
        int b=Integer.parseInt(c2);
        double res=a/b;
        cajaResul.setText(""+res);
    }
}
