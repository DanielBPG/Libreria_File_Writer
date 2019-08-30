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

     public File(Context context, Guia nomGuia){
         this.context = context;
         this.guia = nomGuia;
     }

     public void write() throws IOException {
         java.io.File root = new java.io.File(Environment.getExternalStorageDirectory(), "Lib");
         if (!root.exists()) {
             root.mkdirs();
         }
         java.io.File gpxfile = new java.io.File(root, "PRUEBA_GUIAGENERADA.DAT");
         FileWriter writer = new FileWriter(gpxfile);
         writer.append(guia.getFecha());
         writer.append(guia.getCiudad());
         writer.append(guia.getNumGuia());
         writer.append(guia.getNomGuia());
         writer.append(String.format("%1$04d",guia.getNumLote()));
         writer.append(guia.getTipoEmpaque());
         writer.append(String.valueOf(guia.getNumSurtidor()));
         writer.append(String.format("%1$04d",guia.getUnidades()));
         writer.flush();
         writer.close();
         Toast.makeText(context, "Se crea archivo!!!", Toast.LENGTH_SHORT).show();
         System.out.println();
     }
}
