
class Cuenta{
    String Nombre;
	private float Saldo = 0;
	private int PIN;
	
	public void setNombre(String nombre){
		this.Nombre = nombre;
	}
	
	public void setSaldo(float dinero){
		this.Saldo =+ dinero;
		//this.saldo + dinero;
	}
	
	public void setPin(int clave){
		this.PIN = clave;
	}
	
	public String getNombre(){
		return Nombre;
	}
	
	public float getSaldo(){
		return Saldo;
	}
	
	public int getPIN(){
		return PIN;
	}
}