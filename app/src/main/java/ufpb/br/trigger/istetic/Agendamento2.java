package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Agendamento2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_agendamento2);

        FloatingActionButton avancar = findViewById(R.id.avancar);
        ImageButton voltar = findViewById(R.id.voltar);
        ImageButton informacoes = findViewById(R.id.informacoes);
        final Drawable heart = getResources().getDrawable(R.drawable.ic_button_favorito);
        final Drawable heartVermelho = getResources().getDrawable(R.drawable.heart);
        final ImageButton favorito = findViewById(R.id.favorito);
        ImageButton local = findViewById(R.id.local);

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent avancarTela = new Intent(Agendamento2.this,AgendamentoDia.class);
                startActivity(avancarTela);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarTela = new Intent(Agendamento2.this,Agendamento1.class);
                startActivity(voltarTela);
            }
        });

        informacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(Agendamento2.this,InformacoesEstabelecimento.class);
                startActivity(info);
            }
        });

        favorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(favorito.getDrawable().getConstantState().equals(heart.getConstantState())) {
                    favorito.setImageDrawable(getResources().getDrawable(R.drawable.heart));
                }else if(favorito.getDrawable().getConstantState().equals(heartVermelho.getConstantState())){
                    favorito.setImageDrawable(getResources().getDrawable(R.drawable.ic_button_favorito));
                }
            }
        });

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapa = new Intent(Agendamento2.this, Maps.class);
                startActivity(mapa);
            }
        });

    }
}
