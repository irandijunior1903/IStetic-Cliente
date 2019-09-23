package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class TelaInicialAdm extends AppCompatActivity {

    @Override

    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_tela_inicial_adm);

        ImageButton cadastrar = findViewById(R.id.cadastrarFornecedor);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new Intent(TelaInicialAdm.this, CadastroFornecedor.class);
                startActivity(cadastrar);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.botaoacao:
                break;
            case R.id.botaosair:
                Intent sair = new Intent(TelaInicialAdm.this,Login.class);
                startActivity(sair);
                Toast.makeText(TelaInicialAdm.this, "Você foi desconectado!", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
