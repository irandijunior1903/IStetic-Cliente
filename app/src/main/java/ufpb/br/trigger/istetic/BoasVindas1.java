package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class BoasVindas1 extends AppCompatActivity {
    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.boas_vindas_1_activity);

        ImageView tela2 = findViewById(R.id.proxTela);
        tela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(BoasVindas1.this, BoasVindas2.class);
                startActivity(tela2);
            }
        });



    }
}
