package AcividadObligatoria01;

public class Asiento {
    private boolean libre;
    public Asiento(){
        libre=true;
    }
    public void liberarAsiento(){
        libre=true;
    }
    public void ocuparAsiento(){
        libre=false;
    }
    public boolean estadoAsiento(){
        return libre;
    }
}
