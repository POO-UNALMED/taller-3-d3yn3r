package taller3.televisores;

public class TV {
	String  Marca;
	int     canal   = 1;
	int     precio  = 500;
	int     volumen = 1;
	boolean estado;
	String  control;
	static int numTV=0;
	
	//constructor
	public TV(String Mark,boolean state) {
		Marca  = Mark;
		estado = state;
		numTV+=numTV;
	}
	//Metodos get() / set()
	public String getMarca() {
		return Marca;
	}
	
	
}
