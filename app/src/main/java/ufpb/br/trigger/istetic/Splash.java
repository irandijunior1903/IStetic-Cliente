package ufpb.br.trigger.istetic;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Sair da splash para outra tela
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent (getBaseContext(), Login.class));
                finish();
            }
        },2000);
    }

}