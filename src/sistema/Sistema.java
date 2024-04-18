package sistema;

import java.util.Scanner;

import services.HandleMenu;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HandleMenu hm = new HandleMenu();
		int opcao = 0;
		do {
			System.out.println("1 - Criar\n2 - Editar \n3 - Deletar \n4 - Listar\n5 - Visualizar\n6- Login de Acesso\n9 - Sair\n");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: {
				hm.criar();
				break;
			}
			case 2: {
				hm.editar();
				break;
				
			}
			case 3: {
				hm.deletar();
				break;
				
			}
			case 4: {
				hm.listar();
				break;
				
			}
			case 5:{
				hm.visualizar();
				break;
			}
			case 6:{
				hm.login();
				break;
			}
			default:
				System.out.println("Opcao invalida");
				break;
			}
			
		} while (opcao != 9);
		sc.close();
	}

}
