package ufpb.br.trigger.istetic.ui.informacoescliente;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.widget.Toast;
import ufpb.br.trigger.istetic.PerfilCliente;
import ufpb.br.trigger.istetic.R;

public class InfoClienteFragmento extends Fragment {

    public InfoClienteFragmento(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragmento_editar_info, container, false);
        root.findViewById(R.id.salvarEditar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(v.getContext());

                alertDialog.setTitle("EDIÇÃO")
                        .setMessage("Deseja salvar alterações?")
                        .setCancelable(true)
                        .setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).setPositiveButton("SALVAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        Intent trocatela = new Intent(v.getContext(), PerfilCliente.class);
                        InfoClienteFragmento.this.startActivity(trocatela);
                        Toast.makeText(getContext(), "Você salvou as alterações!", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }) ;
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();
            }
        });

        root.findViewById(R.id.cancelarEditar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(v.getContext());

                alertDialog.setTitle("EDIÇÃO")
                        .setMessage("Deseja cancelar alterações?")
                        .setCancelable(true)
                        .setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).setPositiveButton("CONFIRMAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
                        Intent trocatela = new Intent(v.getContext(), PerfilCliente.class);
                        InfoClienteFragmento.this.startActivity(trocatela);
                        Toast.makeText(getContext(), "Você cancelou as alterações!", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                }) ;
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();
            }
        });
        return root;
    }
}