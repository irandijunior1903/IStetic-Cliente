package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AgendamentoDia extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_agendamento_dia);

        ImageButton voltar = findViewById(R.id.voltar);

        FloatingActionButton avancar = findViewById(R.id.avancar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarTela = new Intent(AgendamentoDia.this,Agendamento2.class);
                startActivity(voltarTela);
            }
        });

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent avancarTela = new Intent(AgendamentoDia.this,AgendamentoHora.class);
                startActivity(avancarTela);
            }
        });
    }
}
