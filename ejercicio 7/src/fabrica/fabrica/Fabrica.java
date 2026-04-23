package fabrica;

import java.util.ArrayList;
import java.util.List;


public class Fabrica {
	
	private List<Automovil> listaAutomoviles;
    
	public Fabrica() {
		super();
		this.listaAutomoviles = new ArrayList<>();
		
	}
	
	public void agregarAutomovil(Automovil automovil) {
		this.listaAutomoviles.add(automovil);
		
	}
	
	
	public void mostrarAutos() {
		
		for(Automovil automovil : listaAutomoviles) {
			System.out.println(automovil);
		}
	}

}
