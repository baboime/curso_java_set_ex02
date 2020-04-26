package aplicacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		
		int qtde;
		
		System.out.print("Quantos estudantes estão no curso A? ");
		qtde = sc.nextInt();
		
		for (int i=0; i<qtde; i++) {
			cursoA.add(sc.nextInt());
		}
		
		System.out.print("Quantos estudantes estão no curso B? ");
		qtde = sc.nextInt();
		
		for (int i=0; i<qtde; i++) {
			cursoB.add(sc.nextInt());
		}
		
		System.out.print("Quantos estudantes estão no curso B? ");
		qtde = sc.nextInt();
		
		for (int i=0; i<qtde; i++) {
			cursoC.add(sc.nextInt());
		}
		
		Set<Integer> totalAlunos = new HashSet<>(cursoA);
		totalAlunos.addAll(cursoB);
		totalAlunos.addAll(cursoC);
		
		System.out.println("Total de estudantes: " + totalAlunos.size());
		
		sc.close();
	}

}
