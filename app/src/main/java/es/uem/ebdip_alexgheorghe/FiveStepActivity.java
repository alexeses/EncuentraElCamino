package es.uem.ebdip_alexgheorghe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FiveStepActivity extends AppCompatActivity {

    public boolean llave = false;
    public static final String KEY_STATUS = "llave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_step);

    Button btnVolverConLlave = findViewById(R.id.btnVolverKey);
    Button btnVolverSinLlave = findViewById(R.id.btnVolverSinKey);

    btnVolverConLlave.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(FiveStepActivity.this, FourStepActivity.class);
            i.putExtra(KEY_STATUS, llave = true);
            i.putExtra(MainActivity.KEY_PERSONA, getIntent().getStringExtra(MainActivity.KEY_PERSONA));

            startActivity(i);
        }
    });

    btnVolverSinLlave.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(FiveStepActivity.this, FourStepActivity.class);
            startActivity(i);
        }
    });

    }
}