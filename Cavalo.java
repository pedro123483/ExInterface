package Polimorfismo;

public class Cavalo implements Animal {
    private String correr;
    
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return "ventania";
	}

	@Override
	public int idade() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public String som() {
		// TODO Auto-generated method stub
		return "in ha in in";
	} 

}
