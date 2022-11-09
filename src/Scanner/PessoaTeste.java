package Scanner;

import java.util.Scanner;


public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Arthur", 18);
		Pessoa pessoa2 = new Pessoa("Gabriel", 5);
		Pessoa pessoa3 = new Pessoa("Yuri", 20);
		Pessoa pessoa4 = new Pessoa("João", 30);
		Pessoa pessoa5 = new Pessoa("Adam", 15);
		
		Pessoa pessoas[] = new Pessoa[5];
		pessoas[0] = pessoa1; //1
		pessoas[1] = pessoa2; //2
		pessoas[2] = pessoa3; //3
		pessoas[3] = pessoa4;
		pessoas[4] = pessoa5;
		
		System.out.println("Listagem de Pessoas: \n");
		for(int i = 0; i < 5; i++) {
			if(pessoas[i] == null) {
				continue;

	}
			System.out.println("Pessoa: " + (i + 1));
			System.out.println("Nome: " + pessoas[i].getNome());
			System.out.println("Idade: " + pessoas[i].getIdade());
			System.out.println();
			
			
			
				//Para copiar os nomes mais rapido: Arthur Gabriel Yuri João Adam
}
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um nome que deseja saber a idade: ");
		String nome = entrada.next();
		for(int i=0; i<pessoas.length; i++){
			if(nome.equals(pessoas[i].getNome())) {
				System.out.println("O nome " + nome + " Foi encontrado no índice: " +(i+1));
				System.out.println("Idade dessa pessoa: " + pessoas[i].getIdade());
			} else {
				System.out.println("O nome " + nome + " Não foi encontrado no índice: " +(i+1));
			}
		
		
		
			
			
			
		}
		
		
		
		entrada.close();   

}
}	
