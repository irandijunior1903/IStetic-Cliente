package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InformacoesEstabelecimento extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_informacoes_estabelecimento);

        ImageButton informacoes = findViewById(R.id.informacoes);
        ImageButton voltar = findViewById(R.id.voltar);
        final Drawable heart = getResources().getDrawable(R.drawable.ic_button_favorito);
        final Drawable heartVermelho = getResources().getDrawable(R.drawable.heart);
        final ImageButton favorito = findViewById(R.id.favorito);

        informacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent servicos = new Intent(InformacoesEstabelecimento.this,Agendamento1.class);
                startActivity(servicos);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarTela = new Intent(InformacoesEstabelecimento.this,Agendamento1.class);
                startActivity(voltarTela);
            }
        });

        favorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(favorito.getDrawable().getConstantState().equals(heart.getConstantState())) {
                    favorito.setImageDrawable(getResources().getDrawable(R.drawable.heart));
                    alert("Você avaliou o estabelecimento :D");
                }else if(favorito.getDrawable().getConstantState().equals(heartVermelho.getConstantState())){
                    favorito.setImageDrawable(getResources().getDrawable(R.drawable.ic_button_favorito));
                }
            }
        });
    }

    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
