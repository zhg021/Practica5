
public class MenuUsuario{
	
	public static void main(String args[]){
		int act;
		Banco servidor = new Banco();
		do{
			System.out.println("Menu banco XX##$$");
			System.out.println("1)Nueva cuenta");
			System.out.println("2)Mosrar lista de clientes");
			System.out.println("3)Agregar o quitar saldo");
			System.out.println("4)Ver estado de una cuenta");
			System.out.println("0)Finalizar\n");
			act = capturaEntrada.capturarEntero("Ingresar funcion en realizar");
		
			switch(act){
				case 1: servidor.NuevoDato();
					break;
				case 2: servidor.mostrarLista();
					break;
				case 3: servidor.mostrarLista();
						servidor.AddTakeSaldo();
					break;
				case 4: servidor.mostrarLista();
						servidor.MostrarEstado();
					break;
				case 0: System.out.println("\nFinalizando");
					break;
				default: System.out.println("\nFuncion no existe");
			}
		}while(act!=0);
	}
}