package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;


import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PerfilCliente extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_cliente);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_editarinfo)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.perfil_cliente, menu);
        return true;
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.botaodeacao:
                break;
            case R.id.botaodesair:
                Intent sair = new Intent(PerfilCliente.this,Login.class);
                startActivity(sair);
                Toast.makeText(PerfilCliente.this, "Você foi desconectado!", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.botaodebusca:
                break;
            case R.id.buscarEstabelecimentos:
                Intent buscar1 = new Intent(PerfilCliente.this, PesquisarEstabelecimentos.class);
                startActivity(buscar1);
                break;
            case R.id.buscarServicos:
                Intent buscar2 = new Intent(PerfilCliente.this, PesquisarServicos.class);
                startActivity(buscar2);
                break;
            case R.id.agendar:
                break;
            case R.id.novoAgendamento:
                Intent agendar = new Intent(PerfilCliente.this, Agendamento1.class);
                startActivity(agendar);
                break;
            case R.id.verAgendamentos:
                Intent verAgendamentos = new Intent(PerfilCliente.this, ListaAgendamento.class);
                startActivity(verAgendamentos);
                break;

        }
        return super.onOptionsItemSelected(item);

    }

}
