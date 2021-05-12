package Polimorfismo;

public class Cachorro implements Animal {
private String correr;
	
public String getCorrer() {
	return correr;
}

public void setCorrer(String correr) {
	this.correr = correr;
}

@Override
	public String nome() {
	
		return "scooby";
	}

	@Override
	public int idade() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String som() {
		// TODO Auto-generated method stub
		return "au au";
	}

}
