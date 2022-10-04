package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	private int puertas=2;
	private int velocidadMaxima=80;
	private String traccion="4X2";
	protected static int cantidadCamion;
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Camion(String placa,String nombre, int precio, int peso, Fabricante fab, int ejes ) {
		super();
		cantidadCamion++;
		for (Pais paisCamion:Pais.paises) {
			if (fab.getPais().getNombre().equals(paisCamion.getNombre())){
				paisCamion.cantidadVehiculosP++;
				
					
			}
			
		}
		
		for (Fabricante fabricaCamion:Fabricante.fabricas) {
			if (fab.getNombre().equals(fabricaCamion.getNombre())){
				fabricaCamion.cantidadVehiculosF++;
				
					
			}
			
		}
	}
	
	
	
	
	

}
