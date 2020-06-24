package com.example.proyectofinal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

public class PantallaUno_IncendioReportando extends AppCompatActivity {

    FloatingActionButton botonFlotante;
    TextView name, email;
    Button logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_uno__incendio_reportando);

        botonFlotante = (FloatingActionButton) findViewById(R.id.BotonFlotante1);

        botonFlotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguienteActivity = new Intent(PantallaUno_IncendioReportando.this, PantallaDos_ReportarIncendio.class);
                startActivity(siguienteActivity);
            }
        });

        logOut = findViewById(R.id.googleLogOut);
        name = findViewById(R.id.txtUsuPant1);
        email = findViewById(R.id.txtEmailPant1);

        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if (signInAccount != null){
            name.setText(signInAccount.getDisplayName());
            email.setText(signInAccount.getEmail());
        }


        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}