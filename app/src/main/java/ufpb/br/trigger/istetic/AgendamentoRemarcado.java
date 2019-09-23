package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AgendamentoRemarcado extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_agendamento_remarcado);

        ImageView telainicio = findViewById(R.id.salvarAgendamento);
        telainicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telainicio = new Intent(AgendamentoRemarcado.this, PerfilCliente.class);
                startActivity(telainicio);
            }
        });
    }
}
