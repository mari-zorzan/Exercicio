package git;

import java.util.Scanner;

public class Git {

	public static void main(String[] args) {
		
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Digite seu nome:");
				
				String nome = scan.nextLine();
				
		        System.out.println("Digite sua idade:");
				
				int idade = scan.nextInt();
				
				System.out.println("Seu nome � : " + nome + "\n" + " Voc� tem " + idade + " anos");

			}

		}
