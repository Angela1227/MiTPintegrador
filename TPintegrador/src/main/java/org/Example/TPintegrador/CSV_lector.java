package org.Example.TPintegrador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSV_lector {
	  public List<Participante> readCsvFile() throws FileNotFoundException {
	        FileReader reader =  new FileReader("Participante.csv");
	        CsvToBean<Participante> csvtobean= new CsvToBeanBuilder<Participante>(reader)
	                .withType(Participante.class)
	                .withSeparator(';')
	                .build();

	        return csvtobean.parse();
	    }
}
