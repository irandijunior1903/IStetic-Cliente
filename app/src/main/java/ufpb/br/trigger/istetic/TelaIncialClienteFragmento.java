package ufpb.br.trigger.istetic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ufpb.br.trigger.istetic.R;

public class TelaIncialClienteFragmento extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragmento_tela_inicial_cliente, container, false);
        return root;
    }
}