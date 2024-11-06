package logicaNegocio;

public class Delfin extends Animal{
    
    private final TipoHabitat Habitat;

    public Delfin() {
        this.Habitat = TipoHabitat.ACUATICO;
    }

    @Override
    public TipoHabitat getHabitat() {
        return Habitat;
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
