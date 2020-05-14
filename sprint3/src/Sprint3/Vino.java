package Sprint3;

public class Vino extends Bebidas {
	
	
	public Vino(){
		this("Vino");
	}
	public Vino(String vino) {
		// TODO Auto-generated constructor stub
	}
	public void Vino(String vino){
		super(Vino);
		System.out.println("elige Vino");
	}

	@Override
	public String toString(){
		return "Bebidas: "+ super.getVino();
	}
}

