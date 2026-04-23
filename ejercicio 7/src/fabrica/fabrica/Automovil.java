package fabrica;

import java.util.ArrayList;
import java.util.List;

public class Automovil {
	
    private String marca;
    private int modelo;
    private Motor motor;
    private Persona persona;
    private List<Llanta> llantas;
    
    
    public Automovil(String marca, int modelo, Persona persona, String tipoMotor) {
    	
    	this.marca = marca;
    	this.modelo = modelo;
    	
    	this.persona= persona;
    	
    	this.motor= new Motor(tipoMotor);
    	
    	this.llantas = new ArrayList<>();
    	
    	
    }
	
	public void agregarLlanta(Llanta llanta) {
		this.llantas.add(llanta);
		
	}
	
	public String getMarca() {
		return marca;
		
	}
	
	public void setMarca(String marca) {
		this.marca= marca;
	}
	public int getModelo() {
		return modelo;
	}
     
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public List<Llanta> getLlantas(){
    	
    	return llantas;
    	
    }
    
    
    public void setLlantas(List<Llanta> llantas) {
    	this.llantas = llantas;
    }
    
    @Override
    public String toString() {
    	return "Automovil  " + marca +
    			" Modelo  " + modelo  +
    			" Propietario "+ persona  +
    			" Llantas " + llantas  +
    			"  Motor " + motor;
    }
    
    
    
    
}
