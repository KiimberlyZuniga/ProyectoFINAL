package com.example.proyectofinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaDos_ReportarIncendio extends AppCompatActivity {

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