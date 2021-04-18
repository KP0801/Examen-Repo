
import utils.Reposteria;
import utils.Sucursal;

public class Main{

	public static void main(String[] args){
		
    
    Reposteria buttercup = new Reposteria("Buttercup");
		buttercup.agregarSucursal("ButtercupNY");
		buttercup.agregarSucursal("ButtercupTGU");

		Sucursal buttercupNY = buttercup.buscarSucursal("ButtercupNY");
    //Insumos primer sucursal
    buttercupNY.agregarInsumo("Huevos", "blancos" );
    buttercupNY.agregarInsumo("Leche", "entera");
    buttercupNY.agregarInsumo("Mantequilla", "deslactosada");
    buttercupNY.agregarInsumo("Harina", "Enpolvo");
    buttercupNY.agregarInsumo("Chocolate", "Negro");
    buttercupNY.agregarInsumo("Manzana", "Roja");
    //receta
    String[] ingredientesPastelChocolate = {"2,Leche","3,Huevos","1,Chocolate","1,Harina"};
    String[] ingredientesPastel3Leches = {"3,Leche","2,Huevos"};
    String[] ingredientesPieManzana = {"3 , Harina","1,Mantequilla","3,Manzana"};  
    //Postre
    buttercupNY.agregarPostre("PastelChocolate", 650, ingredientesPastelChocolate );   
    buttercupNY.agregarPostre("Pastel3Leches", 200, ingredientesPastel3Leches );
    buttercupNY.agregarPostre("PieManzana", 350, ingredientesPieManzana);
    //Pedido
		/*fecha= dd-mm-yy*/
    buttercupNY.realizarPedido("Alex", "Roland", "Mario", "PastelChocolate" , 2, "14-04-21");
    buttercupNY.realizarPedido("Carlos", "Roland", "Mario", "Pastel3Leches" , 5, "15-04-21");
    buttercupNY.realizarPedido("Alejandra", "Roland", "Mario", "PieManzana" , 4, "16-04-21");
    //informe diario
    buttercupNY.generarInformeDia("14-04-21");
    
    Sucursal buttercupTGU = buttercup.buscarSucursal("ButtercupTGU");
    //Insumos segunda sucursal

    buttercupTGU.agregarInsumo("Huevos", "blancos" );
    buttercupTGU.agregarInsumo("Leche", "entera");
    buttercupTGU.agregarInsumo("Mantequilla", "deslactosada");
    buttercupTGU.agregarInsumo("Harina", "Enpolvo");
    buttercupTGU.agregarInsumo("Vainilla", "Suave");
    buttercupTGU.agregarInsumo("Zanahoria", "Tierna");
   
    
    // receta
    String[] ingredientesPastelVainilla = {"3,Huevos","2,Leche"," 1,Vainilla"};
    String[] ingredientesPandeZanahoria = {"3,Zanahoria","1,Leche","1,Harina"};
    String[] ingredientesPastelGrande = {"5,Huevos","5,Leche","6,Harina","3, Vainilla"};

		 // Posrtres
    buttercupTGU.agregarPostre("PastelVainilla", 550, ingredientesPastelVainilla);
    buttercupTGU.agregarPostre("PandeZanahoria", 225, ingredientesPandeZanahoria);
    buttercupTGU.agregarPostre("PastelGrande", 900,ingredientesPastelGrande );

 // Orden
    buttercupTGU.realizarPedido("Armando", "Kevin", "Ariel","PastelVainilla" , 3, "14-04-21");
    buttercupTGU.realizarPedido("Oscar", "Kevin", "Ariel","PandeZanahoria " , 2, "15-04-21");
    buttercupTGU.realizarPedido("Pedro", "Kevin", "Ariel","PastelGrande" , 4, "14-04-21");


    //informe diario  
    


    
		/*Agregar pedidos por Sucursal*/
		/*buttercupNY.generarInformeDia(...);*/
		/*buttercup.generarInformeMesAnio(anio,mes);*/
		//buttercupTGU.realizarPedido(...);
	}
}