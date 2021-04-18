package utils;

public class Insumo {
	private String Id;
	private String Nombre;
	private String descripcion;

	public Insumo(String ID, String Nombre, String descripcion){
		this.Id = ID;
		this.Nombre = Nombre;
		this.descripcion = descripcion;
	}

  public String getId() {
        return Id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}