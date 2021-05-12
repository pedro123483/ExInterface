package Polimorfismo;

public class TestandoAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.setCorrer("Correndo...");
		Cavalo cavalo = new Cavalo();
		cavalo.setCorrer("O cavalo est� correndo...");
		Preguica preguicinha = new Preguica();
		preguicinha.setSubir("A pregui�a est� subindo...");
		
		System.out.println("===CACHORRO===");
		System.out.println("Nome do cachorro �: " + cachorro.nome());
		System.out.println("A idade do cachorro �: " + cachorro.idade());
		System.out.println("O som do cachorro �: " + cachorro.som());
		System.out.println("O cachorro est�: " + cachorro.getCorrer());
		System.out.println("\n===CAVALO===");
		System.out.println("Nome do cavalo �: " + cavalo.nome());
		System.out.println("A idade do cavalo �: " + cavalo.idade());
		System.out.println("O som do cavalo �: " + cavalo.som());
		System.out.println(": " + cavalo.getCorrer());
		System.out.println("\n===PREGUI�A===");
		System.out.println("Nome da pregui�a �: " + preguicinha.nome());
		System.out.println("A idade da pregui�a �: " + preguicinha.idade());
		System.out.println("O som da pregui�a �: " + preguicinha.som());
		System.out.println(": " + preguicinha.getSubir());
		
		
		
				

	}

}
