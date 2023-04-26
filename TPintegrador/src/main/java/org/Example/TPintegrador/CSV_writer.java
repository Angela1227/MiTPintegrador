package org.Example.TPintegrador;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSV_writer {
	
	 List<String[]> rows = new ArrayList<String[]>();
	
	 public void Writer() throws IOException {

	        CSVWriter writer = new CSVWriter(new FileWriter("Participante.csv"),
	                ';',
	                '"','\\'
	                ,CSVWriter.DEFAULT_LINE_END);
	        String[] header = new String[]{"Nombre", "Puntos", "Estado"};
	        rows.add(header);
	        writer.writeAll(rows);
	        writer.close();
	 }
	
	
	public  CSV_writer(String Participante, String Puntos, String Estado) {
		 String[] row1 = new String[]{Participante, Puntos, Estado};
		rows.add(row1);
	 }
}
