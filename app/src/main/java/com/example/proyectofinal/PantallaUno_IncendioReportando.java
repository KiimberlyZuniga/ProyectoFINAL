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

import static com.example.proyectofinal.R.layout.activity_pantalla_uno__incendio_reportando;

public class PantallaUno_IncendioReportando extends AppCompatActivity {

    FloatingActionButton botonFlotante;
    TextView name, email;
    Button logOut;
    Button incendPendButt;
    //TABS
   // TabLayout tabLayout;
    //ViewPager viewPager;
   // TabItem tab1;
   // TabItem tab2;
   // TabItem tab3;
   // PagerController pagerAdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_pantalla_uno__incendio_reportando);


        //TABS

       // tabLayout = findViewById(R.id.tablayout);
        //viewPager = findViewById(R.id.viewpager);
        //tab1 = findViewById(R.id.tabincendiopend);
        //tab2 = findViewById(R.id.tabinformationn);
        //tab3 = findViewById(R.id.tabcontactus);
     /*   pagerAdater = new PagerController(getSupportFragmentManager(), tabLayout.getTabCount());
        //viewPager.setAdapter(pagerAdater);
        tabLayout.setOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               // viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0){
                    pagerAdater.notifyDataSetChanged();
                }
                if (tab.getPosition()==1){
                    pagerAdater.notifyDataSetChanged();
                }
                if (tab.getPosition()==2){
                    pagerAdater.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

*/
        //Bton FLOTANTE

        botonFlotante = (FloatingActionButton) findViewById(R.id.BotonFlotante1);
        incendPendButt = (Button) findViewById(R.id.butIncendioPend);

        botonFlotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguienteActivity = new Intent(PantallaUno_IncendioReportando.this, PantallaDos_ReportarIncendio.class);
                startActivity(siguienteActivity);
            }
        });

        incendPendButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent incendPendActiv = new Intent(PantallaUno_IncendioReportando.this, PantallaTres_IncendioPendiente.class);
                startActivity(incendPendActiv);
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