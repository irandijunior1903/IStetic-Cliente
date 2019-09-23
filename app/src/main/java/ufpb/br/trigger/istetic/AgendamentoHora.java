package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AgendamentoHora extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_agendamento_hora);

        ImageButton voltar = findViewById(R.id.voltar);
        FloatingActionButton avancar = findViewById(R.id.avancar);
        PorterDuffColorFilter filtroEscuro = new PorterDuffColorFilter(getResources().getColor(android.R.color.darker_gray), PorterDuff.Mode.MULTIPLY);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarTela = new Intent(AgendamentoHora.this, AgendamentoDia.class);
                startActivity(voltarTela);
            }
        });

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent avancarTela = new Intent(AgendamentoHora.this,AgendamentoConcluido.class);
                startActivity(avancarTela);
            }
        });
    }
}
