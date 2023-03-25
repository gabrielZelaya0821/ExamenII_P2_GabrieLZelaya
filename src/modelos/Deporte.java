package modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Deporte {
    private String nombre;
    private ArrayList<Torneo> torneos;
    
    public Deporte(String nombre){
        this.nombre = nombre;
        torneos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
