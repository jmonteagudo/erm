package com.meridional.gen5.tools;

import java.util.HashMap;

public class Provincias {
	
	public HashMap<Integer, String> provincias;
	
	public Provincias(){
		
		provincias = new HashMap<Integer, String>();
		
		provincias.put(1, "CAPITAL");
		provincias.put(2, "BUENOS AIRES");
		provincias.put(3, "CATAMARCA");
		provincias.put(4, "CORDOBA");
		provincias.put(5, "CORRIENTES");
		provincias.put(6, "ENTRE RIOS");
		provincias.put(7, "JUJUY");
		provincias.put(8, "LA RIOJA");
		provincias.put(9, "MENDOZA");
		provincias.put(10, "SALTA");
		provincias.put(11, "SAN JUAN");
		provincias.put(12, "SAN LUIS");
		provincias.put(13, "SANTA FE");
		provincias.put(14, "SANTIAGO DEL ESTERO");
		provincias.put(15, "TUCUMAN");
		provincias.put(16, "CHACO");
		provincias.put(17, "CHUBUT");
		provincias.put(18, "FORMOSA");
		provincias.put(19, "LA PAMPA");
		provincias.put(21, "MISIONES");
		provincias.put(22, "NEUQUEN");
		provincias.put(23, "RIO NEGRO");
		provincias.put(24, "SANTA CRUZ");
		provincias.put(25, "TIERRA DEL FUEGO");
	}
	
	public String get(String codigoProvincia){
		
		try{
			return provincias.get(Integer.parseInt(codigoProvincia));
		}catch(NumberFormatException ex){
			return "";	
		}
		
	}

}
