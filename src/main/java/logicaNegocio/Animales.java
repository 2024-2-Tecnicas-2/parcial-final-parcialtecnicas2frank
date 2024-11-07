package logicaNegocio;

public class Animales {
    
    public static void main(String []args){
        Perro perro = new Perro();
        Animal leon = new Leon();
        Animal delfin = new Delfin();
        
        System.out.println("Perro");
        perro.emitirSonido();
        perro.obtenerDieta();
        perro.interactuarConHumano();
        System.out.println("");
        System.out.println("Leon");
        leon.emitirSonido();
        leon.obtenerDieta();
        System.out.println("");
        System.out.println("Delfin");
        delfin.emitirSonido();
        delfin.obtenerDieta();
    }
}
