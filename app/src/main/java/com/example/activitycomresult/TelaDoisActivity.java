package com.example.activitycomresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaDoisActivity extends AppCompatActivity {
    EditText edt_nome;
    Button btn_voltar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);

        edt_nome = findViewById(R.id.edt_nome);
        btn_voltar = findViewById(R.id.btn_voltar);

        intent = getIntent();
        System.out.println(intent.getExtras().getString("keyNome"));

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }
}