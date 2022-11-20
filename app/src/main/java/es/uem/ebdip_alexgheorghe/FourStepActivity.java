package es.uem.ebdip_alexgheorghe;

import static es.uem.ebdip_alexgheorghe.FiveStepActivity.KEY_STATUS;
import static es.uem.ebdip_alexgheorghe.MainActivity.KEY_PERSONA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FourStepActivity extends AppCompatActivity {

    Button btnCogerLlave;
    Button btnOpenDoor;
    TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_step);

        btnCogerLlave = findViewById(R.id.btnCogerKey);
        btnOpenDoor = findViewById(R.id.btnOpenDoor);
        tvTitulo = findViewById(R.id.titulo04);

        String nombre = getIntent().getStringExtra(KEY_PERSONA);
        tvTitulo.setText(String.format(getString(R.string.titulo04), nombre));

        btnCogerLlave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FourStepActivity.this, FiveStepActivity.class);
                startActivity(i);
            }
        });

        btnOpenDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean llave = getIntent().getBooleanExtra(KEY_STATUS, false);

                if (llave) {
                    Intent i = new Intent(FourStepActivity.this, SixStepActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(FourStepActivity.this, "No tienes la llave", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}