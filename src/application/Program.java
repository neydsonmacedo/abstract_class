package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuente;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Contribuente> contribuentes = new ArrayList<>();
		
		for (int i = 1; i <=n;i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if (ch == 'i') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gastos com Saude: ");
				double gastosSaude = sc.nextDouble();
				contribuentes.add(new PessoaFisica(nome,rendaAnual,gastosSaude));
			}
			else {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Quantidade Funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				contribuentes.add(new PessoaJuridica(nome,rendaAnual,numeroFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (Contribuente c: contribuentes ) {
			System.out.println(c.getNome()+": $ "+String.format("%.2f", c.calculoImposto()));
		}
		System.out.println();
		double totalTaxes = 0.00;
		for (Contribuente c: contribuentes ) {
			totalTaxes += c.calculoImposto();
		}
		System.out.println("TOTAL TAXES: $ "+totalTaxes);
		
		sc.close();
		
		

	}

}
