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

     public File(Context context, Guia guia){
         this.context = context;
         this.guia = guia;
     }

     public void write() throws IOException {
         java.io.File root = new java.io.File(Environment.getExternalStorageDirectory(), "Lib");
         if (!root.exists()) {
             root.mkdirs();
         }
         java.io.File gpxfile = new java.io.File(root, "PRUEBA_GUIAGENERADA.DAT");
         FileWriter writerFile = new FileWriter(gpxfile);
         writerFile.append(guia.getFecha());
         writerFile.append(guia.getCiudad());
         writerFile.append(guia.getNumGuia());
         writerFile.append(guia.getNomGuia());
         writerFile.append(String.format("%1$04d",guia.getNumLote()));
         writerFile.append(guia.getTipoEmpaque());
         writerFile.append(String.valueOf(guia.getNumSurtidor()));
         writerFile.append(String.format("%1$04d",guia.getUnidades()));
         writerFile.flush();
         writerFile.close();
         Toast.makeText(context, "Archivo creado", Toast.LENGTH_SHORT).show();
     }
}
