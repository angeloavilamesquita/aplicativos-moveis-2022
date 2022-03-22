package br.edu.unis.aplicativosmoveis;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View btnCalculoImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculoImc = findViewById(R.id.linear_main_imc);
        btnCalculoImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // intenções de utilizar um serviço
                Intent intent = new Intent(MainActivity.this, ImcActivity.class);
                startActivity(intent);
            }
        });
    }
}