package vehiculos;

public class Automovil extends Vehiculo {
	
	private  int puestos;
	protected int puertas=4;
	private int velocidadMaxima=100;
	private String traccion="FWD";
	protected static int cantidadAutomovil;
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
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
	
	
	
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public Automovil(String placa,String nombre,int precio,int peso, Fabricante fab, int puestos ) {
		super();
		cantidadAutomovil++;
		for (Pais paisAutomovil:Pais.paises) {
			if (fab.getPais().getNombre().equals(paisAutomovil.getNombre())){
				paisAutomovil.cantidadVehiculosP++;
				
					
			}
			
		}
		
		for (Fabricante fabricaAutomovil:Fabricante.fabricas) {
			if (fab.getNombre().equals(fabricaAutomovil.getNombre())){
				fabricaAutomovil.cantidadVehiculosF++;
				
					
			}
			
		}
		
		
		
		 
		
	}
	
	
	
	
	
	
	


}
