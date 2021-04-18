package utils;

import java.util.ArrayList;

public class Sucursal {
  private String nombre;
  private int sucursalID;
  private ArrayList<Pedido> pedidos;
  private ArrayList<Insumo> insumos;
  private ArrayList<Postre> postres;

  public Sucursal(String nombre, int sucursalID) {
    this.nombre = nombre;
    this.sucursalID = sucursalID * 1000;
    this.pedidos = new ArrayList<Pedido>();
    this.insumos = new ArrayList<Insumo>();
    this.postres = new ArrayList<Postre>();
  }

  public void agregarInsumo(String Nombre, String descripcion) {

    int ID;

    if (this.insumos.size() > 1) {
      ID = this.sucursalID + this.insumos.size();
    } else {
      ID = this.sucursalID;
    }

    this.insumos.add(new Insumo(Integer.toString(ID), Nombre, descripcion));
  }

  public void agregarPostre(String Nombre, float precio, String[] ingredientes) {

    if (this.buscarPostrePorNombre(Nombre) == null) {
      int ID = (this.sucursalID * 10) + this.postres.size();

      Postre nuevoPostre = new Postre(Integer.toString(ID), Nombre, precio);

      for (String ingrediente : ingredientes) {
        String[] info = ingrediente.split(",");

        Insumo insumoEncontrado = this.buscarInsumoPorNombre(info[1]);

        if (insumoEncontrado == null) {
          this.agregarInsumo(info[1], "Auto Generado");

          nuevoPostre.agregarInsumo(this.buscarInsumoPorNombre(info[1]).getId(), info[0]);
        } else {

          nuevoPostre.agregarInsumo(insumoEncontrado.getId(), info[0]);
        }
      }

      this.postres.add(nuevoPostre);

    } else {
      System.out.println("El postre indicado ya existe en esta sucursal.");
    }
  }

  private Postre buscarPostrePorNombre(String nombre) {
    Postre resultado = null;

    for (Postre postre : this.postres) {
      if (postre.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
        resultado = postre;
        break;
      }
    }

    return resultado;
  }

  public void realizarPedido(String cliente, String vendedor, String cocinero, String nombrePostre, int cantidad,
      String fecha) {

    Postre postreEncontrado = this.buscarPostrePorNombre(nombrePostre);

    if (postreEncontrado != null) {
      this.pedidos.add(new Pedido(cliente, vendedor, cocinero, postreEncontrado.getId(), cantidad, fecha));
    } else {
      System.out.println("El postre '" + nombrePostre + "' no existe.");
    }

  }

  private Postre buscarPostrePorID(String ID) {
    Postre resultado = null;

    for (Postre postre : this.postres) {
      if (postre.getId().equals(ID)) {
        resultado = postre;
        break;
      }
    }

    return resultado;
  }

  public void generarInformeDia(String fecha) {

    ArrayList<Pedido> pedidosFecha = new ArrayList<Pedido>();

    for (Pedido pedido : this.pedidos) {
      if (pedido.getFecha().equals(fecha)) {
        pedidosFecha.add(pedido);
      }
    }

		System.out.println("**********************************************************");
    System.out.println("Fecha\tPostreID\tNombre de postre\tCantidad\tPrecio Unidad\tTotal");
    for (Pedido pedido : pedidosFecha) {
			Postre postrePedido = this.buscarPostrePorID(pedido.getPostreID());

      System.out.println(pedido.getFecha() + "\t"+ 
			pedido.getPostreID() + "\t"+
			postrePedido.getNombre() + "\t\t"+
			pedido.getCantidad() + "\t"+
			postrePedido.getPrecioUnidad()+"\t"+
			(postrePedido.getPrecioUnidad()*pedido.getCantidad())
			);
    }
		System.out.println("**********************************************************");
  }

  public Insumo buscarInsumoPorNombre(String nombre) {
    Insumo resultado = null;

    for (Insumo insumo : this.insumos) {
      if (nombre.equals(insumo.getNombre())) {

        resultado = insumo;
        break;
      }
    }

    return resultado;
  }

  public ArrayList<Pedido> getPedidos() {
    return this.pedidos;
  }

  public ArrayList<Insumo> getInsumos() {
    return this.insumos;
  }

  public ArrayList<Postre> getPostres() {
    return this.postres;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}