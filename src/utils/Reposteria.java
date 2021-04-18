package utils;
import utils.Sucursal;
import java.util.ArrayList;

public class Reposteria {
	private String nombre;
	private ArrayList<Sucursal> sucursales;

	public Reposteria(String nombre){
		this.nombre = nombre;
		this.sucursales = new ArrayList<Sucursal>();
	}
  
	public String getNombre() {
			return nombre;
	}

	public void setNombre(String nombre) {
			this.nombre = nombre;
	}

  public void agregarSucursal(String nombre){
      this.sucursales.add(new Sucursal(nombre, this.sucursales.size()+1));
	}

	
	public Sucursal buscarSucursal(String nombre){
		Sucursal resultado = null;

		for(Sucursal sucursal: this.sucursales){
			if(sucursal.getNombre().equals(nombre)){
				resultado = sucursal;

				break;
			}
		}

		return resultado;
	}

	public void crearReporteMesAnio(int mes,int anio){
    
	}

}