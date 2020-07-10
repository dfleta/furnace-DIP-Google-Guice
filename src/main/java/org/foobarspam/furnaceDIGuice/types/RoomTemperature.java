package org.foobarspam.furnaceDIGuice.types;


public class RoomTemperature {
	
	private double temperature = 0;
	
	/**
	 * Substituimos el constructor por la automatización de Guice:
	 * Inyecta la dependencia en el constructor de la clase.
	 * 
	 * public RoomTemperature(double temperature){
	 *		this.temperature = temperature;
	 * } 
	 */
	public RoomTemperature() {
		// Necesito un constructor sin argumentos para realizar inyeccion de dependencias
	}	

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public void incrementTemperature(double increment) {
		this.temperature += increment;
	}

}
