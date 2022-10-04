package vehiculos;

import java.util.ArrayList;

public class Fabricante {

	
	private String nombre; 
	protected Pais pais; 
	protected static ArrayList<Fabricante> fabricas = new ArrayList<>();
	protected int cantidadVehiculosF;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre=nombre;
		this.pais=pais;
		
		fabricas.add(this);
		
	}
	
	private int getCantidadVehiculosF() {
		return cantidadVehiculosF;
	}
	
	
	public static Fabricante fabricaMayorVentas() {
		int mayor = fabricas.get(0).getCantidadVehiculosF();
		
		Fabricante mayor2 = null;

		for (Fabricante fabrica : fabricas) {

			if (fabrica.cantidadVehiculosF >= mayor) {
				mayor2 = fabrica;

			}

		}
		return mayor2;

	}
	
	
	
	
}
