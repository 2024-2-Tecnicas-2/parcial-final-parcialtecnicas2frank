package logicaNegocio;

public class Leon extends Animal{

    private final String TipoHabitat;

    public Leon() {
        this.TipoHabitat = null;
    }
            
    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
       return "Carnívoro";
    }
}
