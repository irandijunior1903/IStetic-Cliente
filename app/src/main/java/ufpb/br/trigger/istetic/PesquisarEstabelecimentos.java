package ufpb.br.trigger.istetic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PesquisarEstabelecimentos extends Activity {
    private String[] listaEstabelecimentos;
    private ListView lView;
    private EditText eText;
    private ArrayList<String> pesquisa = new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_estabelecimento);

        FloatingActionButton avancar = findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent avancarTela = new Intent(PesquisarEstabelecimentos.this,Agendamento1.class);
                startActivity(avancarTela);

            }
        });

        // Declarando os objetos do main.xml
        lView = (ListView) findViewById(R.id.lView);
        eText = (EditText) findViewById(R.id.eText);

        listaEstabelecimentos = new String[] { "Lore Ipsum", "RT Depilação", "Jeane Hair Styles", "Irandi Barber",
                "Mailson Cabelos", "Sra Manicure", "Barbearia do Ricardo", "Salão da Vanessa", "Limpeza de pele S.A.", "Trois Beauty" };

        lView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaEstabelecimentos));

        // Função responsável pela pesquisa
        Pesquisar();

        eText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }

            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {
                Pesquisar();

                lView.setAdapter(new ArrayAdapter<String>(PesquisarEstabelecimentos.this, android.R.layout.simple_list_item_1, pesquisa));
            }
        });
    }

    public void Pesquisar() {
        int textlength = eText.getText().length();
        pesquisa.clear();

        for (int i = 0; i < listaEstabelecimentos.length; i++ ) {
            if (textlength <= listaEstabelecimentos[i].length()) {
                if (eText.getText().toString().equalsIgnoreCase((String)listaEstabelecimentos[i].subSequence(0, textlength))) {
                    pesquisa.add(listaEstabelecimentos[i]);
                }
            }
        }
    }

}
