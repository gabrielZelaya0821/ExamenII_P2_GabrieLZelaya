package modelos;

/**
 *
 * @author gabri
 */
public class Equipo {
    private String nombre;
    private int puntos;
    
    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
