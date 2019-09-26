package ufpb.br.trigger.istetic;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaAgendamento extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_lista_agendamento);

        final PorterDuffColorFilter filtroRosa = new PorterDuffColorFilter(getResources().getColor(R.color.colorAccent), PorterDuff.Mode.MULTIPLY);
        final PorterDuffColorFilter filtroBranco = new PorterDuffColorFilter(getResources().getColor(android.R.color.white), PorterDuff.Mode.MULTIPLY);
        final ImageView base1 = findViewById(R.id.imageView13);
        final ImageView base2 = findViewById(R.id.imageView14);
        final ImageView base3 = findViewById(R.id.imageView7);
        FloatingActionButton editar = findViewById(R.id.editar);
        FloatingActionButton cancelar = findViewById(R.id.cancelar);
        ImageView voltar = findViewById(R.id.voltar);

        base1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                base1.getDrawable().setColorFilter(filtroRosa);
            }
        });

        base2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                base2.getDrawable().setColorFilter(filtroRosa);
            }
        });

        base3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                base3.getDrawable().setColorFilter(filtroRosa);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent editar = new Intent(ListaAgendamento.this, PerfilCliente.class);
                startActivity(editar);
                base1.getDrawable().setColorFilter(filtroBranco);
                base2.getDrawable().setColorFilter(filtroBranco);
                base3.getDrawable().setColorFilter(filtroBranco);

            }
        });

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent editar = new Intent(ListaAgendamento.this, EditarDia.class);
                startActivity(editar);
                base1.getDrawable().setColorFilter(filtroBranco);
                base2.getDrawable().setColorFilter(filtroBranco);
                base3.getDrawable().setColorFilter(filtroBranco);
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cancelar = new Intent(ListaAgendamento.this, PerfilCliente.class);
                Context contexto = getApplicationContext();
                String texto = "Você cancelou o agendamento, o estabelecimento será notificado!";
                int duracao = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(contexto, texto, duracao);
                toast.show();

                startActivity(cancelar);
                base1.getDrawable().setColorFilter(filtroBranco);
                base2.getDrawable().setColorFilter(filtroBranco);
                base3.getDrawable().setColorFilter(filtroBranco);
            }
        });

    }
}