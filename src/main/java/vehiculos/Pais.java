package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {

	protected String nombre; 
	protected int cantidadVehiculosP;
	protected static ArrayList<Pais> paises = new ArrayList<>();
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais(String nombre) {

		this.nombre = nombre;
		paises.add(this);

	}

	private int getCantidadVehiculosP() {
		return cantidadVehiculosP;
	}

	private void setCantidadVehiculosP(int cantidadVehiculosP) {
		this.cantidadVehiculosP = cantidadVehiculosP;
	}

	public static Pais paisMasVendedor() {
		int mayor = paises.get(0).getCantidadVehiculosP();
		Pais mayor2 = null;

		for (Pais pais : paises) {

			if (pais.cantidadVehiculosP >= mayor) {
				mayor2 = pais;

			}

		}
		return mayor2;

	}
	
	
	
}
