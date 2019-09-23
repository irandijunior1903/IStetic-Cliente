package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class BoasVindas3 extends AppCompatActivity {
    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.boas_vindas_3_activity);
        ImageView tela4 = findViewById(R.id.proxTela3);
        tela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela4 = new Intent(BoasVindas3.this, PerfilCliente.class);
                startActivity(tela4);
            }
        });

    }
}
