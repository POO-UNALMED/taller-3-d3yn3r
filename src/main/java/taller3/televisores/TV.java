package taller3.televisores;

public class TV {
	private Marca marca;
	int     canal   = 1;
	int     precio  = 500;
	int     volumen = 1;
	boolean estado;
	private Control control;
	static int numTV=0;
	
	//constructor
	public TV(Marca Mark,boolean state) {
		marca  = Mark;
		estado = state;
		numTV+=1;
	}
	//marca 
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca Marca) {
		this.marca = Marca;
	}
	
	//control
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control Control) {
		this.control = Control;
	}
	
	//Price 
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int Precio) {
		this.precio = Precio;
	}
	
	//Volume
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int Volumen) {
		if(this.estado==true && Volumen>=0 && Volumen<=7) {
			this.volumen = Volumen;
		}
		
	}
	
	//canal
	public int getCanal() {
		return canal;
	}
		
	public void setCanal(int Canal) {
		if(this.estado==true && Canal>=1 && Canal<=120) {
			this.canal = Canal;
		}
		
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado(){
		return estado;
	}
	
	public void canalUp() {
		if(this.estado==true && canal>=1 && canal<=120) {
			this.canal+=1;
		}
	}
	public void canalDown() {
		if(this.estado==true && canal>=1 && canal<=120) {
			this.canal-=1;
		}
	}
	
	public void volumenUp() {
		if(this.estado=true && volumen>=0 && volumen<=7) {
			this.volumen+=1;
		}
	}
	
	public void volumenDown() {
		if(this.estado=true && volumen>=0 && volumen<=7) {
			this.volumen-=1;
		}
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
