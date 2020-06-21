package com.meridional.gen5.launchers;

import com.meridional.gen5.business.Ejecutador;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@ContextConfiguration(locations={"/launch-vuelco-context.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
public class Launcher {
	
	public static void main(String[] args) {
	    
		// Carpetas origen
		final String inputVuelcoFolder = "C:\\erm\\input\\vuelco";
		final String inputGenericaFolder = "C:\\erm\\input\\generica";
		final String inputHendelFolder = "C:\\erm\\input\\hendel";
		
		// Carpeta destino
		final String outputFolder = "C:\\erm\\output";
		
		// Carpetas backup
		final String backupVuelcoFolder = "C:\\erm\\backup\\vuelco";
		final String backupGenericaFolder = "C:\\erm\\backup\\generica";
		final String backupHendelFolder = "C:\\erm\\backup\\hendel";
		
		// Contextos de ejecución
		/*final String vuelcoContext = "C:\\erm\\launch-vuelco-context.xml";
		final String genericaContext = "C:\\erm\\launch-estructura-generica-context.xml";
		final String hendelContext = "C:\\erm\\launch-hendel-context.xml";*/
		final String vuelcoContext = "classpath:/META-INF/spring/launch-vuelco-context.xml";
		final String genericaContext = "classpath:/META-INF/spring/launch-estructura-generica-context.xml";
		final String hendelContext = "classpath:/META-INF/spring/launch-hendel-context.xml";
		
		Ejecutador vuelco = new Ejecutador();
		Ejecutador generico = new Ejecutador();
		Ejecutador hendel = new Ejecutador();
		    
		// Generamos archivos del vuelco
		vuelco.generarArchivos(inputVuelcoFolder, outputFolder, backupVuelcoFolder, vuelcoContext);
	    
	    // Generamos archivos genéricos
		generico.generarArchivos(inputGenericaFolder, outputFolder, backupGenericaFolder, genericaContext);
	    
	    // Generamos archivos de hendel
	    hendel.generarArchivos(inputHendelFolder, outputFolder, backupHendelFolder, hendelContext);
	}
}


