package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
	
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		/* o resultado sera falso, pois o java usa a refer�ncia a posi��o de mem�ria
		por isso para comparar se o conte�do dos objetos s�o iguais, usamos o iquals
		Se for necess�rio comprara a refer�ncia dos objetos ultilizamos o ==  
		
	     */
		
		System.out.println(c1 == c2);



	}

}
