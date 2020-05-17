package Sprint3;

public class Cerveza extends Bebidas {

	public Cerveza(){
		this("cerveza");
	}
	public Cerveza(String cerveza) {
		// TODO Auto-generated constructor stub
	}
	public void Cerveza(String cerveza){
		super(cerveza);
		System.out.println("elige cerveza");
	}

	@Override
	public String toString(){
		return "Bebidas: "+ super.getCerveza();
	}

	
	
}
