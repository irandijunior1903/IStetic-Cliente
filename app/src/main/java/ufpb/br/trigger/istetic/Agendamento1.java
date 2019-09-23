package ufpb.br.trigger.istetic;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Agendamento1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_agendamento);

        final Drawable plusCinza = getResources().getDrawable(R.drawable.plus_cinza);
        final Drawable plus = getResources().getDrawable(R.drawable.plus);
        final Drawable heart = getResources().getDrawable(R.drawable.ic_button_favorito);
        final Drawable heartVermelho = getResources().getDrawable(R.drawable.heart);
        final ImageButton voltar = findViewById(R.id.voltar);
        final FloatingActionButton avancar = findViewById(R.id.avancar);
        final ImageButton plus1 = findViewById(R.id.imageButton);
        final ImageButton plus2 = findViewById(R.id.imageButton3);
        final ImageButton plus3 = findViewById(R.id.imageButton4);
        final ImageButton informacoes = findViewById(R.id.informacoes);
        final ImageButton favorito = findViewById(R.id.favorito);
        ImageButton local = findViewById(R.id.local);

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent avancarTela = new Intent(Agendamento1.this,Agendamento2.class);
                startActivity(avancarTela);
                plus1.setImageDrawable(getResources().getDrawable(R.drawable.plus));
                plus2.setImageDrawable(getResources().getDrawable(R.drawable.plus));
                plus3.setImageDrawable(getResources().getDrawable(R.drawable.plus));
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarTela = new Intent(Agendamento1.this,PerfilCliente.class);
                startActivity(voltarTela);
            }
        });

        informacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(Agendamento1.this,InformacoesEstabelecimento.class);
                startActivity(info);
            }
        });

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(plus1.getDrawable().getConstantState().equals(plus.getConstantState())) {
                    plus1.setImageDrawable(getResources().getDrawable(R.drawable.plus_cinza));
                    Context contexto = getApplicationContext();
                    String texto = "Serviço adicionado";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();
                }else if(plus1.getDrawable().getConstantState().equals(plusCinza.getConstantState())){
                    plus1.setImageDrawable(getResources().getDrawable(R.drawable.plus));
                    Context contexto = getApplicationContext();
                    String texto = "Serviço removido";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();
                }
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(plus2.getDrawable().getConstantState().equals(plus.getConstantState())) {
                    plus2.setImageDrawable(getResources().getDrawable(R.drawable.plus_cinza));
                    Context contexto = getApplicationContext();
                    String texto = "Serviço adicionado";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();
                }else if(plus2.getDrawable().getConstantState().equals(plusCinza.getConstantState())){
                    plus2.setImageDrawable(getResources().getDrawable(R.drawable.plus));
                    Context contexto = getApplicationContext();
                    String texto = "Serviço removido";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();
                }
            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(plus3.getDrawable().getConstantState().equals(plus.getConstantState())) {
                    plus3.setImageDrawable(getResources().getDrawable(R.drawable.plus_cinza));
                    Context contexto = getApplicationContext();
                    String texto = "Serviço adicionado";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();
                }else if(plus3.getDrawable().getConstantState().equals(plusCinza.getConstantState())){
                    plus3.setImageDrawable(getResources().getDrawable(R.drawable.plus));
                    Context contexto = getApplicationContext();
                    String texto = "Serviço removido";
                    int duracao = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();
                }
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
                Intent mapa = new Intent(Agendamento1.this, Maps.class);
                startActivity(mapa);
            }
        });
    }
}
