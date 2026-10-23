package aula_22_10_2026;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		
		Pessoa jogador1 = new Pessoa();
		Pessoa jogador2 = new Pessoa("Pedro Utsumi", 22);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
		jogador1.setNome("Jesus");
		jogador1.setIdade(2026);
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		
	}

}
