package org.Example.TPintegrador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class MainTP {
	private Participante participante;
	private static  Participante nombre;
	private Participante puntaje;
	public static void main(String[] args) {
	
		
		Collection<Partido> partidos = new ArrayList<Partido>();

		FileReader archivo;
		BufferedReader lector;
		List<String> lineasResultados = new ArrayList <String>();
		try {
			archivo= new FileReader("C:\\Users\\Angi\\eclipse-workspace\\TPintegrador\\java\\main\\resources\\Resultados");
			
			if(archivo.ready()) {
			lector = new BufferedReader(archivo);
			String lineasResultado;
			while((lineasResultado = lector.readLine()) != null) {
				System.out.println(lineasResultado);
				lineasResultados.add(lineasResultado);
			
			}
			
			
			
			}
			else{System.out.println("El archivo no etsa listo");}
			}
		catch(Exception e) {
			System.out.println("Error" + e.getMessage());
		}
		
		
		
		
	
	
	
	//acá deberia de leer
	
		
	
	
	boolean primera = true;
	for (String lineaResultado : lineasResultados) {
		if (primera) {
			primera = false;
		} else {
			// Argentina,1,2,Arabia Saudita
			String[] campos = lineaResultado.split(",");//CAMPOS
			Equipo equipo1 = new Equipo(campos[0]);
			
			Equipo equipo2 = new Equipo(campos[3]);
			Partido partido = new Partido(equipo1, equipo2);
			partido.setGolesEq1(Integer.parseInt(campos[1]));
			partido.setGolesEq2(Integer.parseInt(campos[2]));
			partidos.add(partido);
		}

	}
	// Leer pronostico
	
	
	
	int puntos = 0; // total puntos pesona
	
	List<String> lineasPronostico = new ArrayList <String>();//TOCA EL PRONOSTICO
	FileReader archivo2;
	BufferedReader lector2;
	
	try {
		archivo2= new FileReader("C:\\Users\\Angi\\eclipse-workspace\\TPintegrador\\java\\main\\resources\\Test pronosticos");
		
		if(archivo2.ready()) {
		lector2 = new BufferedReader(archivo2);
		String lineaPronostico;
		while((lineaPronostico = lector2.readLine()) != null) {
			System.out.println(lineaPronostico);
			lineasPronostico.add(lineaPronostico);
		} }}
		catch (IOException e) {
			System.out.println("No se pudo leer la linea de pronosticos...");
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	
	
	
	//asd
	primera = true;
	for (String lineaPronostico : lineasPronostico) {
		if (primera) {
			primera = false;
		} else {
			String[] campos = lineaPronostico.split(",");
			Equipo equipo1 = new Equipo(campos[0]);
			Equipo equipo2 = new Equipo(campos[4]);
			
			Partido partido = null;

			for (Partido partidoCol : partidos) {
				if (partidoCol.getEquipo1().getNombre(
						).equals(equipo1.getNombre())
						&& partidoCol.getEquipo2().getNombre(
								).equals(equipo2.getNombre())) {
					
					partido = partidoCol;
					
				}
			
			}
			Equipo equipo = null;
			EnumResultado resultado = null;
			if("X".equals(campos[1])) {
				equipo = equipo1;
				resultado = EnumResultado.GANADOR;
			}
			if("X".equals(campos[2])) {
				equipo = equipo1;
				resultado = EnumResultado.EMPATE;
			}
			if("X".equals(campos[3])) {
				equipo = equipo1;
				resultado = EnumResultado.PERDEDOR;
			}
			Participante participante = new Participante(null, 0);
			Pronostico pronostico = new Pronostico(partido, equipo, resultado);
			// sumar los puntos correspondientes
			puntos += pronostico.puntos();
		}
	}

	// mostrar los puntos
	System.out.println("Los puntos obtenidos por el usuario fueron:");
	System.out.println(puntos);

}}
		