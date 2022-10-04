package vehiculos;

public class Camioneta extends Vehiculo {

	private boolean volco;
	private int velocidadMaxima = 90;
	private String traccion = "4X4";
	protected static int cantidadCamioneta;

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

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fab, boolean volco) {
		super();
		cantidadCamioneta++;
		for (Pais paisCamioneta : Pais.paises) {
			if (fab.getPais().getNombre().equals(paisCamioneta.getNombre())) {
				paisCamioneta.cantidadVehiculosP++;

			}

		}
		
		for (Fabricante fabricaCamioneta:Fabricante.fabricas) {
			if (fab.getNombre().equals(fabricaCamioneta.getNombre())){
				fabricaCamioneta.cantidadVehiculosF++;
				
					
			}
			
		}
	}

}
