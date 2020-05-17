package Sprint3;

public class Bebidas Extends Usuario {
	String vino;
	String cerveza;
	String ron;
	
	public Bebidas(String vino, String cerveza, String ron) {
		super();
		this.vino = vino;
		this.cerveza = cerveza;
		this.ron = ron;
	}
	public String getVino() {
		return vino;
	}
	public void setVino(String vino) {
		this.vino = vino;
	}
	public String getCerveza() {
		return cerveza;
	}
	public void setCerveza(String cerveza) {
		this.cerveza = cerveza;
	}
	public String getRon() {
		return ron;
	}
	public void setRon(String ron) {
		this.ron = ron;
	}
	
	public void SeleccionaVino(String eligevino) {
		Vino vino = new Vino(eligevino);
	}
	
	public void SeleccionaRon(String eligeron) {
		Ron ron = new Ron(eligeron);
		
	}
	public void SeleccionaCerveza(String eligecerveza) {
		Cerveza cerveza = new Cerveza(eligecerveza);
	}
}
