package Sprint3;

public class Ron extends Bebidas {

	public Ron(){
		this("ron");
	}
	public Ron(String ron) {
		// TODO Auto-generated constructor stub
	}
	public void Ron(String ron){
		super(ron);
		System.out.println("elige ron");
	}

	@Override
	public String toString(){
		return "Bebidas: "+ super.getRon();
	}

	
	
}
