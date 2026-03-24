package fabrica;

public class App {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();

        Persona persona1 = new Persona("Jose Jose");

        Automovil automovil1 =new Automovil("Toyota",2016,persona1,"Gasolina");

        Llanta llanta1 = new Llanta("Roja");
        Llanta llanta2 = new Llanta("Negra");
        Llanta llanta3 = new Llanta("Blanca");
        Llanta llanta4 = new Llanta("Gris");

        automovil1.agregarLlanta(llanta1);
        automovil1.agregarLlanta(llanta2);
        automovil1.agregarLlanta(llanta3);
        automovil1.agregarLlanta(llanta4);

        fabrica.agregarAutomovil(automovil1);

        fabrica.mostrarAutos();
    }

}
