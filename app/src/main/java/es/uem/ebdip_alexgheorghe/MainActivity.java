package es.uem.ebdip_alexgheorghe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente;
    EditText etNombre;

    public static final String KEY_PERSONA = "nombre";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente = findViewById(R.id.btnSiguiente);
        etNombre = findViewById(R.id.username);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                if (etNombre.getText().toString().isEmpty()) {
                    etNombre.setError("Introduce un nombre");
                } else {
                    Intent i = new Intent(MainActivity.this, TwoStepActivity.class);
                    i.putExtra(KEY_PERSONA, etNombre.getText().toString());
                    startActivity(i);
            }
            }
        });

    }
}