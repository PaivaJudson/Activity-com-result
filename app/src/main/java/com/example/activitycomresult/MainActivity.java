package com.example.activitycomresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt_utilizador;
    Button btn_enviar;
    String nome = "Utilizador";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_utilizador = findViewById(R.id.txt_utilizador);
        btn_enviar = findViewById(R.id.btn_enviar);

        txt_utilizador.setText("Olá "+nome);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaDoisActivity.class);
                intent.putExtra("keyNome", nome);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if( requestCode == 1 && resultCode == 1 && data !=null){
            nome = data.getExtras().getString("kNome");
            txt_utilizador.setText("Olá "+nome);
        }else{
            Toast.makeText(this, "Result Inválido!!", Toast.LENGTH_SHORT).show();
        }
    }
}