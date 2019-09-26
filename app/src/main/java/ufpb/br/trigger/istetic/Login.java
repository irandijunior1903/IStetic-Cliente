package ufpb.br.trigger.istetic;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    @Override

    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_login);
        Button entrar = findViewById(R.id.entrar);
        Button cadastrar = findViewById(R.id.cadastrar);


        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                TextView tlogin = findViewById(R.id.email);
                TextView tsenha = findViewById(R.id.senha);
                String login = tlogin.getText().toString();
                String senha = tsenha.getText().toString();

                if(login.equals("j") && senha.equals("1")) {
                    Intent it = new Intent(Login.this, TelaInicialAdm.class);
                    startActivity(it);
                    finish();
                    alert("Logado com sucesso");
                }else if (login.equals("irandi") && senha.equals("999")) {
                    Intent cliente = new Intent(Login.this, PerfilCliente.class);
                    startActivity(cliente);
                    finish();
                    alert("Logado com sucesso, bem vindo(a)!");

                }else alert("Login incorreto!");

            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new Intent(Login.this, CadastrarCliente.class);
                startActivity(cadastrar);
            }
        });

    }

    private void alert (String s){
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }


}
