package com.meridional.gen5.business;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.meridional.gen5.domain.Destino;
import com.meridional.gen5.domain.Origen;

public class Ejecutador {
    
	// Formato fecha
	private final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
	
	public void generarArchivos(String inputFolder, String outputFolder, String backupFolder, String context){
		
		File input = new File(inputFolder);
		
	    for (final File archivo : input.listFiles()) {
	    	if (!archivo.isDirectory()) {
	    		try {
					this.convertir(
					"file:" + archivo.toString(),
					"file:" + outputFolder + "\\" + archivo.getName().replaceAll(".txt", ".tsv")
					);
				} catch (Exception e) {
					e.printStackTrace();
				} 
	    	}
	        
	    	// Luego de cada ejecución, limpiamos los contadores de los ítems
	        Origen.reiniciarContador();
	        Origen.setContar('S');
	        Destino.reiniciarContador();
	        
	        backupearArchivo(backupFolder, archivo);
	    }
	}

	private void backupearArchivo(String backupFolder, final File archivo) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(backupFolder);
		stringBuilder.append("\\");
		stringBuilder.append(archivo.getName());
		stringBuilder.append("_");

		Date fechaArchivo = new Date();
		stringBuilder.append(DATE_TIME_FORMAT.format(fechaArchivo));
		
		File backup = new File(stringBuilder.toString());
		archivo.renameTo(backup);
	}
	
	private void convertir(String input, String output){
		System.out.println("do something");
	}
	
}
