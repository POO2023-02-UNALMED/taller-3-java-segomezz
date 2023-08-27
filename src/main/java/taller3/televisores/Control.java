package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	public void turnOff() {
        if (tv != null) {
            tv.turnOff(); 
        }
	}
	public void turnOn() {
        if (tv != null) {
            tv.turnOff(); 
        }
	}
	public void canalUp() {
        if (tv != null) {
            tv.canalUp(); 
        }
	}
	public void canalDown() {
        if (tv != null) {
            tv.canalDown(); 
        }
	}
	public void volumenUp() {
        if (tv != null) {
            tv.volumenUp(); 
        }
	}
	public void volumenDown() {
        if (tv != null) {
            tv.canalDown(); 
        }
	}
	public void setCanal(int nuevoCanal) {
		tv.setCanal(nuevoCanal);
}
	public void setVolumen(int nuevoVolumen) {
		tv.setVolumen(nuevoVolumen);
}
	public void setTv(TV tv) {
		this.tv=tv;
	}
	public TV getTv(){
		return tv;
	}
}
