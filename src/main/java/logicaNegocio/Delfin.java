package logicaNegocio;

public class Delfin extends Animal{
    
    private final String TipoHabitat;

    public Delfin() {
        this.TipoHabitat = null;
    }
            
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }

    @Override
    public String obtenerDieta() {
       return "Pescado";
    }
}
