package ejercicioficheroCSV;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class AlumnoLocator {

	public static String ruta="c:\\temporal\\prueba.csv";
	
	public static Stream<Alumno> alumnos(){
	Path pt=Paths.get(ruta);
	try {
			
		return Files.lines(pt)
		.map(s->s.split("[,]")) 
				.map(e -> new Alumno(e[0], e[1],Double.parseDouble(e[2])));
				
	}	
	catch(IOException ex){
		ex.printStackTrace();
		return Stream.empty();
	}
	
	}
	
}
