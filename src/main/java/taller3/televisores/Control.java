package taller3.televisores;

public class Control {
	TV tv;
	public void enlazar(TV tv){
		this.tv=tv;
		tv.setControl(this);
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.canalUp();
	}
	public void volumenDown() {
		tv.canalDown();
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public TV getTv(){
		return this.tv;
	}
	public void setTv(TV tv) {
		this.tv=tv;
	}
	
}
