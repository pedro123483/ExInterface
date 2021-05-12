package Polimorfismo;

public class Preguica implements Animal {
private String subir;

public String getSubir() {
	return subir;
}

public void setSubir(String subir) {
	this.subir = subir;
}

@Override
public String nome() {
	// TODO Auto-generated method stub
	return "preguicinha";
}

@Override
public int idade() {
	// TODO Auto-generated method stub
	return 19;
}

@Override
public String som() {
	// TODO Auto-generated method stub
	return "zzzzzzzzzzzz";
}

}
