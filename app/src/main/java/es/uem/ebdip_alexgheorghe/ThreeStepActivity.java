package es.uem.ebdip_alexgheorghe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThreeStepActivity extends AppCompatActivity {

    Button btnLlamada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_step);

        btnLlamada = findViewById(R.id.btnCall);

        btnLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri telefono = Uri.parse("tel: 640911777");

                Intent llamada = new Intent(Intent.ACTION_DIAL, telefono);

                startActivity(llamada);
            }
        });

    }
}