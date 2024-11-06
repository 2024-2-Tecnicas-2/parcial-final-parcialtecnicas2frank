package logicaNegocio;

public class Leon extends Animal{

    private final TipoHabitat Habitat;

    public Leon() {
        this.Habitat = TipoHabitat.TERRESTRE;
    }

    public TipoHabitat getHabitat() {
        return Habitat;
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
