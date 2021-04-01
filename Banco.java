
public class Banco{
	
	Cuenta lista[];
	int num = 0;
	int llave1;
	int llave2;
	
	public void NuevoDato(){
		lista[num] = new Cuenta();
		lista[num].Nombre = capturaEntrada.capturaString("Nombre");
		lista[num].PIN = capturaEntrada.capturarEntero("ingresar clave unico");
		num++;
	}
	
	
	public void mostrarLista(){
		for(int i = 0 ; i <= lista.length ; i++){
			System.out.print("\nNombre:"+lista[i].Nombre);
		}
	}
	
	public void AddTakeSaldo(){
		llave1 = capturaEntrada.capturarEntero("ingresar numero de cuenta");
		llave2 = capturaEntrada.capturarEntero("Ingresar PIN");
		if(llave2 == lista[llave1].PIN){
			lista[llave1].Saldo = capturaEntrada.capturaFloat("Ingresar saldo en ingresar/sacar");
		}
		else{
			System.out.print("PIN Incorrecto");
		}
	}
	
	/*public void TakeSaldo(){
		llave1 = CapturaDato.CapturarInt("ingresar numero de cuenta");
		llave2 = CapturaDato.CapturarInt("Ingresar PIN");
		if(llave2 == lista[llave1].PIN){
			lista[lave1].saldo - CapturaDato.CapturarFlt("Ingresar saldo en sacar");
		}
		else{
			System.out.print("PIN Incorrecto");
		}
	}*/
	
	public void MostrarEstado(){
		llave1 = capturaEntrada.capturarEntero("ingresar numero de cuenta");
		llave2 = capturaEntrada.capturarEntero("Ingresar PIN");
		if(llave2 == lista[llave1].PIN){
			System.out.println("Nombre:"+lista[llave1].Nombre);
			System.out.println("Saldo:"+lista[llave1].Saldo);
		}
		else{
			System.out.print("PIN Incorrecto");
		}
	}
}