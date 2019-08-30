package com.cedisropa.filewriter;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class File {
    private static Guia guia;
    private static Context context;

     public File(Context context, Guia guia12){
         this.context = context;
         this.guia = guia12;
     }

     public void write() throws IOException {
<<<<<<< HEAD
         java.io.File root = new java.io.File(Environment.getExternalStorageDirectory(), "Cambio");
         if (!root.exists()) {
             root.mkdirs();
         }
         java.io.File gpxfile = new java.io.File(root, "GUIAGENERADA.DAT");
=======
         java.io.File root = new java.io.File(Environment.getExternalStorageDirectory(), "Libs");
         if (!root.exists()) {
             root.mkdirs();
         }
         java.io.File gpxfile = new java.io.File(root, "PRUEBA_GUIAGENERADA_CON_LIBRERIA.DAT");
>>>>>>> 77e7c4f680400f1b8df0e4a327c8d99972bd65e3
         FileWriter writer = new FileWriter(gpxfile);
         writer.append(guia.getFecha());
         writer.append(guia.getCiudad());
         writer.append(guia.getNumGuia());
         writer.append(guia.getNomGuia());
         writer.append(String.format("%1$05d",guia.getNumLote()));
         writer.append(guia.getTipoEmpaque());
         writer.append(String.valueOf(guia.getNumSurtidor()));
         writer.append(String.format("%1$05d",guia.getUnidades()));
         writer.flush();
         writer.close();
<<<<<<< HEAD
         Toast.makeText(context, "Se generó archivo", Toast.LENGTH_SHORT).show();
=======
         Toast.makeText(context, "Archivo creado con exito", Toast.LENGTH_SHORT).show();
>>>>>>> 77e7c4f680400f1b8df0e4a327c8d99972bd65e3
     }
}
