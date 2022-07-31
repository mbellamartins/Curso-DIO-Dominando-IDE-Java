package br.com.dio;

import br.com.dio.model.Gato1;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato1 gato1 = new Gato1();
		Livros livros = new Livros();
		
		
		System.out.println(gato1);
		System.out.println(livros);
		
		/*int a = 2;
		  int b = 3;
		System.out.println("Hello World! " + (a+b));*/
	}
	
}

class Livros {
	 private String nome;
	 private String npag;
}