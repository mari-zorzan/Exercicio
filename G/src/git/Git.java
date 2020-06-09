package git;

import java.util.Scanner;

public class Git {

	public static void main(String[] args) {
		
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Digite seu nome:");
				
				String nome = scan.nextLine(); //faz a leitura do nome
				
		        System.out.println("Digite sua idade:");
				
				int idade = scan.nextInt();
				
				System.out.println("Seu nome é : " + nome + "\n" + " Você tem " + idade + " anos");

			}

		}
