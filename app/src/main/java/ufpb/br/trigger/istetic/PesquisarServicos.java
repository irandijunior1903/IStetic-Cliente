package ufpb.br.trigger.istetic;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class PesquisarServicos extends Activity {
    private String[] listaServicos;
    private ListView lView2;
    private EditText eText2;
    private ArrayList<String> pesquisa = new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_servicos);

        // Declarando os objetos do main.xml
        lView2 = (ListView) findViewById(R.id.lView2);
        eText2 = (EditText) findViewById(R.id.eText2);

        listaServicos = new String[] { "Barbearia", "Cabeleireiro(a)", "Manicure", "Pedicure",
                "Depilação", "Massagem", "Limpeza de Pele", "Bronzeamento", "Maquiagem", "Design de Sombrancelha" };

        lView2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaServicos));

        // Função responsável pela pesquisa
        Pesquisar();

        eText2.addTextChangedListener(new TextWatcher() {

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

                lView2.setAdapter(new ArrayAdapter<String>(PesquisarServicos.this, android.R.layout.simple_list_item_1, pesquisa));
            }
        });
    }

    public void Pesquisar() {
        int textlength = eText2.getText().length();
        pesquisa.clear();

        for (int i = 0; i < listaServicos.length; i++ ) {
            if (textlength <= listaServicos[i].length()) {
                if (eText2.getText().toString().equalsIgnoreCase((String)listaServicos[i].subSequence(0, textlength))) {
                    pesquisa.add(listaServicos[i]);
                }
            }
        }
    }


}
