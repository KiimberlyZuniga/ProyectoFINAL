package com.example.proyectofinal;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofinal.adapters.IncendioAdapter;
import com.example.proyectofinal.models.Incendio;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static com.example.proyectofinal.R.layout.activity_pantalla_uno__incendio_reportando;

public class PantallaUno_IncendioReportando extends AppCompatActivity {

    FloatingActionButton botonFlotante;
    TextView name, email;
    Button logOut;
    Button incendPendButt;

    private DatabaseReference mDtabase;

    private IncendioAdapter mIncendioAdapter;
    private RecyclerView mRecyclerView;
    private ArrayList<Incendio> mIncendioArrayList = new ArrayList<>();
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

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewIncendios);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

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

        getIncendioFromFirebase();

    }
    private void getIncendioFromFirebase(){
        mDtabase.child("Incendios").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    mIncendioArrayList.clear();
                    for (DataSnapshot ds: snapshot.getChildren()){
                        String incendio = ds.child("incendio").getValue().toString();
                        mIncendioArrayList.add(new Incendio(incendio));
                    }
                    mIncendioAdapter = new IncendioAdapter(mIncendioArrayList, R.layout.incendios_view);
                    mRecyclerView.setAdapter(mIncendioAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}