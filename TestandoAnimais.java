package Polimorfismo;

public class TestandoAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.setCorrer("Correndo...");
		Cavalo cavalo = new Cavalo();
		cavalo.setCorrer("O cavalo está correndo...");
		Preguica preguicinha = new Preguica();
		preguicinha.setSubir("A preguiça está subindo...");
		
		System.out.println("===CACHORRO===");
		System.out.println("Nome do cachorro é: " + cachorro.nome());
		System.out.println("A idade do cachorro é: " + cachorro.idade());
		System.out.println("O som do cachorro é: " + cachorro.som());
		System.out.println("O cachorro está: " + cachorro.getCorrer());
		System.out.println("\n===CAVALO===");
		System.out.println("Nome do cavalo é: " + cavalo.nome());
		System.out.println("A idade do cavalo é: " + cavalo.idade());
		System.out.println("O som do cavalo é: " + cavalo.som());
		System.out.println(": " + cavalo.getCorrer());
		System.out.println("\n===PREGUIÇA===");
		System.out.println("Nome da preguiça é: " + preguicinha.nome());
		System.out.println("A idade da preguiça é: " + preguicinha.idade());
		System.out.println("O som da preguiça é: " + preguicinha.som());
		System.out.println(": " + preguicinha.getSubir());
		
		
		
				

	}

}
