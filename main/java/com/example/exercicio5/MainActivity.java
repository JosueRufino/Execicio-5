package com.example.exercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText salario;

    public void button(View view){

        salario = findViewById(R.id.txtsalario);
        double salario0 = Double.parseDouble(salario.getText().toString());

        double salario1 = salario0 + ((salario0 * 5)/100);
        double salario2 = salario1 - ((salario1 * 7 )/100);

        Toast.makeText(MainActivity.this,"O sálario a receber é : " + salario2 + " Kzs",Toast.LENGTH_LONG ).show();
    }
}