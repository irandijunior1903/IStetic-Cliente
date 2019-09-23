package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class CadastrarCliente extends AppCompatActivity {
    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_cadastrar_cliente);
        ImageView salvarCliente = findViewById(R.id.salvarCliente);
        salvarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salvarCliente = new Intent(CadastrarCliente.this, BoasVindas1.class);
                startActivity(salvarCliente);

            }
        });

    }

}
