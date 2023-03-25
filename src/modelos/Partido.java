package modelos;

/**
 *
 * @author gabri
 */
public class Partido {
    private String local;
    private String visitante;
    private int localPts;
    private int visistantePts;
    
    public Partido(String local, String visitante){
        this.local = local;
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return local + ": " + localPts + "vs." + visistantePts + ":" + visitante; 
    }
    
}
