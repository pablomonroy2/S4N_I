package co.com.s4n;

import co.com.s4n.modelo.Coordenada;
import co.com.s4n.modelo.Dron;
import co.com.s4n.util.Constantes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author PABLO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	Dron dron = new Dron();
        ArrayList<Coordenada> entregas = new ArrayList<Coordenada>();
        
        try (Stream<String> stream = Files.lines(Paths.get("Files/in.txt"))) {
			stream.limit(Constantes.LIMITE_ENTREGAS).forEach(linea ->{
				entregas.add(dron.entrega(linea));
			});
			dron.reporte(entregas);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }       
}
