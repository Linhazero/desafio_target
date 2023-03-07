import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
	
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		while(k < indice) {
			k = k + 1;
			
			soma = soma + k;
		}
		System.out.println("1)  questão ");
		System.out.println("O valor da variavel soma é: " + soma);
		System.out.println("--------------------");
		
		
		
		
		//começando questão 2
		System.out.println("2) questão ");
		
		ArrayList<Integer> myList = new ArrayList<>();

		int i = 0;
		int j = 1;
		int total = 55;
		int p = 4;
		
		while (i + j < total) {
			j = i + j;
			System.out.print( j + ",");
			 Collections.addAll(myList, j);
			i = i +j;
			
			System.out.print(i + ",");
			 Collections.addAll(myList, i);
		}
		
		if(myList.contains(p)) {
		      System.out.println(p + "Numero pertence na lista");
		   } else {
		      System.out.println( " O Numero "  + p + " não pertence a lista");
		   }
		
		System.out.println("--------------------");
		
		
		
		//Começando questão 3
		System.out.println("3) questão ");
		
		System.out.println(" A) 9 ");
		System.out.println(" B) 128 ");
		System.out.println(" C) 49 ");
		System.out.println(" D) 100 ");
		System.out.println(" E) 13 ");
		System.out.println(" F) 200 ");
		
		System.out.println("--------------------");
		
		
		
		//Começando a questão 4
		System.out.println("4) questão ");
		
		System.out.println("O carro e o caminhão estão à mesma distância de Ribeirão Preto ao eles se cruzarem, obviamente sem nescessita de calculos a parti do momento que estão no mesmo ponto de referencia estão na mesma distancia de Riberão Preto");
		System.out.println("--------------------");
		
		
		
		
		//Começando a questão 5
		System.out.println("5) questão ");
		
		String hi = "Essa foi facil";
		System.out.println(new StringBuilder(hi).reverse().toString());
	}
	

}


