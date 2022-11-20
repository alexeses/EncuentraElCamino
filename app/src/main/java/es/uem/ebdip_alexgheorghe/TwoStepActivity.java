package es.uem.ebdip_alexgheorghe;

import static es.uem.ebdip_alexgheorghe.MainActivity.KEY_PERSONA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwoStepActivity extends AppCompatActivity {

    Button pasoCorto;
    Button pasoLargo;
    TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_step);

        pasoCorto = findViewById(R.id.pasoCorto);
        tvNombre = findViewById(R.id.titulo02);
        pasoLargo = findViewById(R.id.pasoLargo);

        String nombre = getIntent().getStringExtra(KEY_PERSONA);
        tvNombre.setText(String.format(getString(R.string.titulo02), nombre));

        pasoCorto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Paso corto");
                Intent i = new Intent(TwoStepActivity.this, FourStepActivity.class);
                i.putExtra(KEY_PERSONA, nombre);
                startActivity(i);
            }
        });

        pasoLargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Paso largo");
                Intent i = new Intent(TwoStepActivity.this, ThreeStepActivity.class);
                startActivity(i);
            }
        });

    }
}