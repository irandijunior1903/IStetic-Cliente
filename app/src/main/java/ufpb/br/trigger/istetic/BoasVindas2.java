package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class BoasVindas2 extends AppCompatActivity {
    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.boas_vindas_2_activity);
        ImageView tela3 = findViewById(R.id.proxTela2);
        tela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela3 = new Intent(BoasVindas2.this, BoasVindas3.class);
                startActivity(tela3);
            }
        });


    }
}
