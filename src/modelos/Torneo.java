package modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Torneo {
    private String nombre;
    private String periodo;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
    
    public Torneo(String nombre){
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}