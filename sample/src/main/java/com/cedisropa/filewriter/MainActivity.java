package com.cedisropa.filewriter;

import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.PrimitiveIterator;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int STORAGE_PERMISSIONS = 1;

    private File file;
    private Guia guia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                STORAGE_PERMISSIONS);


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        file = new File(this, generarGuia());
        try {
            file.write();
        } catch (IOException e) {
            Log.e(TAG, "Error al generar archivo", e);
            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Ocurrió un error al generar archivo de impresión")
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }

    private Guia generarGuia(){
        guia = new Guia();
        guia.setCiudad("Culican");
        guia.setFecha("30/08/2019");
        guia.setNomGuia("ST BR 05041123455335");
        guia.setNumGuia("05041123455335");
        guia.setNumLote(14);
        guia.setNumSurtidor(234);
        guia.setTipoEmpaque("garrafa");
        guia.setUnidades(30);
        return guia;
    }
}
