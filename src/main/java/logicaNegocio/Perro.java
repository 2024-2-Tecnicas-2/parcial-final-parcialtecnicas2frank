package logicaNegocio;

public class Perro extends Animal implements Domestico{
    private final TipoHabitat Habitat;

    public Perro() {
        this.Habitat = TipoHabitat.TERRESTRE;
    }

    @Override
    public TipoHabitat getHabitat() {
        return Habitat;
    }
    
    
    @Override
    public String emitirSonido() {
        return "Ladrido";
    }

    @Override
    public String obtenerDieta() {
        return "Omnivoro";
    }

    @Override
    public String interactuarConHumano() {
       return "El perro mueve la cola  y ladra de felicidad";
    }

  
    
}
