package com.example.proyectofinal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PantallaDos_ReportarIncendio extends AppCompatActivity {
    private EditText usuario;
    private EditText severidad;
    private EditText canton;
    private EditText distrito;
    private EditText fecha;
    private EditText estadoatencion;
    private Button guardar;
    private DatabaseReference mDtabase;
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

                mDtabase.child("usuario").setValue(usu);
                mDtabase.child("severidad").setValue(severi);
                mDtabase.child("canton").setValue(cant);
                mDtabase.child("distrito").setValue(dist);
                mDtabase.child("fecha").setValue(fech);
                mDtabase.child("estado de atencion").setValue(estAten);

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