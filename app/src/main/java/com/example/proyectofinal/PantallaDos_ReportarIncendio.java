package com.example.proyectofinal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofinal.adapters.IncendioAdapter;
import com.example.proyectofinal.models.Incendio;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class PantallaDos_ReportarIncendio extends AppCompatActivity {
    private EditText usuario;
    private EditText severidad;
    private EditText canton;
    private EditText distrito;
    private EditText fecha;
    private EditText estadoatencion;
    private Button guardar;
    private DatabaseReference mDtabase;

    private IncendioAdapter mIncendioAdapter;
    private RecyclerView mRecyclerView;
    private ArrayList<Incendio> mIncendioArrayList = new ArrayList<>();
   // private static final int PERMISSION_CODE = 1000;
   /* ImageView photoo;
    Button capturePhotoo;

    EditText usuario;
    Spinner severidad;
    Spinner canton;
    Spinner distrito;
    EditText date;
    Spinner estado;
    Button verGoogleMaps;
    Button savee;*/

   // DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_dos__reportar_incendio);

        usuario = (EditText) findViewById(R.id.usuarioTxt);
        severidad = (EditText) findViewById(R.id.editSeveridad);
        canton = (EditText) findViewById(R.id.editTCanton);
        distrito = (EditText) findViewById(R.id.editTDistrito);
        fecha = (EditText) findViewById(R.id.editTextFecha);
        estadoatencion = (EditText) findViewById(R.id.editTEstadoAtencion);
        guardar = (Button) findViewById(R.id.buttonGuardarSave);



        mDtabase = FirebaseDatabase.getInstance().getReference();

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  usu = usuario.getText().toString();
                String  severi = severidad.getText().toString();
                String  cant = canton.getText().toString();
                String  dist = distrito.getText().toString();
                String  fech = fecha.getText().toString();
                String  estAten = estadoatencion.getText().toString();

                mDtabase.child("Datos").push().child("usu").setValue(usu);
                mDtabase.child("Datos").push().child("severidad").setValue(severi);
                mDtabase.child("Datos").push().child("canton").setValue(cant);
                mDtabase.child("Datos").push().child("dist").setValue(dist);
                mDtabase.child("Datos").push().child("fecha").setValue(fech);
                mDtabase.child("Datos").push().child("est de ate").setValue(estAten);

            }
        });

        //CAMARA
       // photoo = findViewById(R.id.imagenV);
       // capturePhotoo = findViewById(R.id.botonTomarfoto);

        //capturePhotoo.setOnClickListener(new View.OnClickListener() {
          /*  @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CAMERA) ==
                            PackageManager.PERMISSION_DENIED ||
                            checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                                    PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission, PERMISSION_CODE);
                    }
                    else {
                        openCamera();
                    }
                }
                else {
                    openCamera();
                }
            }
        }); */



      /*  usuario = findViewById(R.id.usuarioTxt);
        severidad = findViewById(R.id.comboBoxSeveridad);
        canton = findViewById(R.id.comboBoxCanton);
        distrito = findViewById(R.id.comboBoxDistrito);
        date = findViewById(R.id.editTextFecha);
        estado = findViewById(R.id.comboBoxEstadoAtencion);
        verGoogleMaps = findViewById(R.id.buttonVerMaps);
        savee = findViewById(R.id.buttonGuardarSave); */

        //mDatabase = FirebaseDatabase.getInstance().getReference();
       // loadSeveridades();
    }

    private void openCamera() {

    }
/*
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_CODE:{
                if (grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_GRANTED){
                    openCamera();
                }else{
                    Toast.makeText(this, "Permission denied...", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }*/

    //SPINNERS CON FIREBASE *NEED TO CHECK*
   // public void loadSeveridades(){
   //     final List<Severidad> severidads = new ArrayList();
     //   mDatabase.child("Severidades").addListenerForSingleValueEvent(new ValueEventListener() {
       //     @Override
         //   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
           //     if (dataSnapshot.exists()){
             //       for (DataSnapshot ds: dataSnapshot.getChildren()){
               //         String id = ds.getKey();
                 //       String nombre = ds.child("nombre").getValue().toString();
                   //     severidads.add(new Severidad(id, nombre));
                    //}

                    //ArrayAdapter<Severidad> arrayAdapter = new ArrayAdapter<>(IncendioReportado.this, android.R.layout.simple_dropdown_item_1line, severidads);
                    //severidad.setAdapter(arrayAdapter);
                //}

            //}

          //  @Override
            //public void onCancelled(@NonNull DatabaseError databaseError) {
//
  //          }
    //    });

}