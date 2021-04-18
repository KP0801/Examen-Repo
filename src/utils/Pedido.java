package utils;
import utils.Postre;

public class Pedido{
	private String cliente;
	private String vendedor;
	private String cocinero;
	private String postreID;
	private int cantidad;
	private String fecha;

	public Pedido(
			String cliente,
			String vendedor,
			String cocinero,
			String postreID,
			int cantidad,
			String fecha
	){
		this.cliente=cliente;
		this.vendedor=vendedor;
		this.cocinero=cocinero;
		this.postreID=postreID;
		this.cantidad=cantidad;
		this.fecha=fecha;
	}

	  public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCocinero() {
        return cocinero;
    }

    public void setCocinero(String cocinero) {
        this.cocinero = cocinero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPostreID() {
        return postreID;
    }
    public void setPostreID(String postreID) {
      this.postreID = postreID;
    }  

      public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
  
}