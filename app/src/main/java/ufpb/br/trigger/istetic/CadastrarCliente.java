package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CadastrarCliente extends AppCompatActivity {
    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_cadastrar_cliente);
        ImageView salvarCliente = findViewById(R.id.salvarCliente);
        ImageView voltarInicio = findViewById(R.id.voltar);
        final ImageView mudarFoto = findViewById(R.id.camera);
        mudarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudarFoto.setImageResource(R.drawable.girl);
                alert("Você adicionou uma foto ;D");
            }
        });

        salvarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salvarCliente = new Intent(CadastrarCliente.this, BoasVindas1.class);
                startActivity(salvarCliente);
                alert("Cadastro realizado com sucesso!");

            }
        });
        voltarInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarInicio = new Intent(CadastrarCliente.this, Login.class);
                startActivity(voltarInicio);
                alert("Cadastro não concluído...");
                mudarFoto.setImageResource(R.drawable.camera);

            }
        });

    }

    private void alert(String string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

}
