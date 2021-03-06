package co.com.s4n.interfaz;

import java.util.ArrayList;

import co.com.s4n.modelo.Coordenada;

/**
 *
 * @author PABLO
 */
public interface IDron {
    
	/**
     * @param moves
     * @return
     * @throws Exception
     */
    public Coordenada entrega(String moves) throws Exception;
    
    
    /**
     * @param rutas
     * @throws Exception
     */
    public void reporte(ArrayList<Coordenada> rutas) throws Exception;
}
