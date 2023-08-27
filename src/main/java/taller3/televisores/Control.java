package taller3.televisores;

public class Control {
	private TV tv;
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	public void turnOff() {
        if (tv != null) {
            tv.turnOff(); // Llama al método turnOff de la TV enlazada
        }
	}
	public void turnOn() {
        if (tv != null) {
            tv.turnOff(); // Llama al método turnOff de la TV enlazada
        }
	}
	public void canalUp() {
        if (tv != null) {
            tv.canalUp(); // Llama al método turnOff de la TV enlazada
        }
	}
	public void canalDown() {
        if (tv != null) {
            tv.canalDown(); // Llama al método turnOff de la TV enlazada
        }
	}
	public void volumenUp() {
        if (tv != null) {
            tv.volumenUp(); // Llama al método turnOff de la TV enlazada
        }
	}
	public void volumenDown() {
        if (tv != null) {
            tv.canalDown(); // Llama al método turnOff de la TV enlazada
        }
	}
	public void setCanal(int nuevoCanal) {
		tv.setCanal(nuevoCanal);
}
	public void setVolumen(int nuevoVolumen) {
		tv.setVolumen(nuevoVolumen);
}
}
