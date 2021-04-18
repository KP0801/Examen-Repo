package utils;

import java.util.ArrayList;

public class Postre {
  
  private String Id;
  private String Nombre;
  private ArrayList<String[]> Ingredientes;
  private float PrecioUnidad;

		public Postre( String ID,String Nombre, float PrecioUnidad){
				this.Id = ID;
				this.Nombre = Nombre;
				this.PrecioUnidad = PrecioUnidad;
				this.Ingredientes = new ArrayList<String[]>();
		}

    public String getId() {
        return Id;
    }

		public void agregarInsumo(String insumoID, String cantidad){
			String[] insumo = {insumoID, cantidad};
			this.Ingredientes.add(insumo);
		}

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<String[]> getIngredientes() {
        return this.Ingredientes;
    }

    public void setIngredientes(ArrayList<String[]> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public float getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(float PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }
    
	
}