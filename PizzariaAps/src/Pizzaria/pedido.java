package Pizzaria;

import java.util.Scanner;

public class pedido {
	
	public static void main(String[]args) {
		
		String nome;
		int escolha;
		double valortotal = 0;
	
		Scanner sc = new Scanner(System.in);
		
		Pizza calabresa = new Pizza(1,"CALABRESA", "Mussarela", "Comum", "Calabresa", "Cebola", 35.00);
		Pizza frango = new Pizza(2,"FRANGO", "Mussarela", "Comum", "Frango", "Catupiry", "Orégano", 37.00);
		Pizza mussarela = new Pizza(3, "MUSSARELA", "Mussarela", "Comum", "Orégano", 30.00);
		Pizza portuguesa = new Pizza(4, "PORTUGUESA", "Mussarela", "Comum", "Presunto", "Ovo", "Pimentão", "Tomate", 36.00);
		Pizza atum = new Pizza(5, "ATUM", "Mussarela", "Comum", "Atum", "Cebola", 32.00);
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Olá, " + nome +"! O que deseja fazer?");
		System.out.println("1 - VER CARDÁPIO");
		System.out.println("2 - MONTAR MINHA PRÓPRIA PIZZA");
		
		escolha = sc.nextInt();
		sc.nextLine();
		
		if(escolha == 1) {
			
			System.out.println("CARDÁPIO");
			System.out.println("---------");
			System.out.println("");
			System.out.println("Escolha um sabor: ");
			System.out.println("");
			System.out.println(calabresa.getCodigo() + " - " + calabresa.sabor + " - R$ " + calabresa.getValor());
			System.out.println("   Borda " + calabresa.borda + ", queijo " + calabresa.queijo + ", " +calabresa.ingrediente1 + ", " + calabresa.ingrediente2);
			System.out.println("");
			System.out.println(frango.getCodigo() + " - " + frango.sabor + " - R$ " + frango.getValor());
			System.out.println("   Borda " + frango.borda + ", queijo " + frango.queijo + ", " + frango.ingrediente1 + ", " + frango.ingrediente2 + ", " + frango.ingrediente3);
			System.out.println("");
			System.out.println(mussarela.getCodigo() + " - " + mussarela.sabor + " - R$ " + mussarela.getValor());
			System.out.println("   Borda " + mussarela.borda + ", queijo " + mussarela.queijo + ", " + mussarela.ingrediente1);
			System.out.println("");
			System.out.println(portuguesa.getCodigo() + " - " + portuguesa.sabor + " - R$ " + portuguesa.getValor());
			System.out.println("   Borda " + portuguesa.borda + ", queijo " + portuguesa.queijo + ", " + portuguesa.ingrediente1 + ", " + portuguesa.ingrediente2 + ", " + portuguesa.ingrediente3 + ", " + portuguesa.ingrediente4);
			System.out.println("");
			System.out.println(atum.getCodigo() + " - " + atum.sabor + " - R$ " + atum.getValor());
			System.out.println("   Borda " + atum.borda + ", queijo " + atum.queijo + ", " + atum.ingrediente1 + ", " + atum.ingrediente2);
			
			switch(sc.nextInt()) {
				case 1:
					System.out.println("Sucesso! Sua pizza foi adicionada! Segue abaixo o resumo de seu pedido: ");
					System.out.println("");
					System.out.println("PEDIDO DE " + nome);
					System.out.println("-----------------");
					System.out.println(calabresa.getCodigo() + " - " + calabresa.sabor + " - R$ " + calabresa.getValor());
					System.out.println("   Borda " + calabresa.borda + ", queijo " + calabresa.queijo + ", " +calabresa.ingrediente1 + ", " + calabresa.ingrediente2);
					valortotal = calabresa.getValor();
					
					break;
				case 2:
					System.out.println("Sucesso! Sua pizza foi adicionada! Segue abaixo o resumo de seu pedido: ");
					System.out.println("");
					System.out.println("PEDIDO DE " + nome);
					System.out.println("-----------------");
					System.out.println(frango.getCodigo() + " - " + frango.sabor + " - R$ " + frango.getValor());
					System.out.println("   Borda " + frango.borda + ", queijo " + frango.queijo + ", " + frango.ingrediente1 + ", " + frango.ingrediente2 + ", " + frango.ingrediente3);
					valortotal = frango.getValor();
					
					break;
				
				case 3:
					System.out.println("Sucesso! Sua pizza foi adicionada! Segue abaixo o resumo de seu pedido: ");
					System.out.println("");
					System.out.println("PEDIDO DE " + nome);
					System.out.println("-----------------");
					System.out.println(mussarela.getCodigo() + " - " + mussarela.sabor + " - R$ " + mussarela.getValor());
					System.out.println("   Borda " + mussarela.borda + ", queijo " + mussarela.queijo + ", " + mussarela.ingrediente1);
					valortotal = mussarela.getValor();
					
					break;
					
				case 4:
					System.out.println("Sucesso! Sua pizza foi adicionada! Segue abaixo o resumo de seu pedido: ");
					System.out.println("");
					System.out.println("PEDIDO DE " + nome);
					System.out.println("-----------------");
					System.out.println(portuguesa.getCodigo() + " - " + portuguesa.sabor + " - R$ " + portuguesa.getValor());
					System.out.println("   Borda " + portuguesa.borda + ", queijo " + portuguesa.queijo + ", " + portuguesa.ingrediente1 + ", " + portuguesa.ingrediente2 + ", " + portuguesa.ingrediente3 + ", " + portuguesa.ingrediente4);
					valortotal = portuguesa.getValor();
					
					break;
					
				case 5:
					System.out.println("Sucesso! Sua pizza foi adicionada! Segue abaixo o resumo de seu pedido: ");
					System.out.println("");
					System.out.println("PEDIDO DE " + nome);
					System.out.println("-----------------");
					System.out.println(atum.getCodigo() + " - " + atum.sabor + " - R$ " + atum.getValor());
					System.out.println("   Borda " + atum.borda + ", queijo " + atum.queijo + ", " + atum.ingrediente1 + ", " + atum.ingrediente2);
					valortotal = atum.getValor();
			}
			
			
			
		}
		
		if(escolha == 2) {
			
			int queijopropria;
			int bordapropria;
			int numeroingredientes = 0;
			String [] nomeingrediente = new String [16];
			double [] precoingrediente = new double [16];
			String [] ingredienteToken = new String [5];
			int n;
			
			nomeingrediente[1] = "Presunto";
			nomeingrediente[2] = "Calabresa";
			nomeingrediente[3] = "Frango";
			nomeingrediente[4] = "Bacon";
			nomeingrediente[5] = "Cebola";
			nomeingrediente[6] = "Catupiry";
			nomeingrediente[7] = "Ovo";
			nomeingrediente[8] = "Pimentão";
			nomeingrediente[9] = "Atum";
			nomeingrediente[10] = "Palmito";
			nomeingrediente[11] = "Carne seca";
			nomeingrediente[12] = "Azeitona";
			nomeingrediente[13] = "Pepperoni";
			nomeingrediente[14] = "Milho";
			nomeingrediente[15] = "Tomate";
			
			precoingrediente[1] = 3.00;
			precoingrediente[2] = 5.50;
			precoingrediente[3] = 7.00;
			precoingrediente[4] = 2.00;
			precoingrediente[5] = 0.50;
			precoingrediente[6] = 3.00;
			precoingrediente[7] = 2.00;
			precoingrediente[8] = 1.50;
			precoingrediente[9] = 5.00;
			precoingrediente[10] = 2.00;
			precoingrediente[11] = 9.00;
			precoingrediente[12] = 2.00;
			precoingrediente[13] = 8.50;
			precoingrediente[14] = 2.00;
			precoingrediente[15] = 3.50;
			
			Pizza pizzapropria = new Pizza();
			valortotal += 15.00;
			
			System.out.println("Escolha um tipo de queijo: 1 - Mussarela | 2 - Gorgonzola | 3 - Parmesão ");
			queijopropria = sc.nextInt();
			sc.nextLine();
			
			if(queijopropria == 1) {
				pizzapropria.queijo = "Mussarela";
				valortotal += 5.00;
			}else if(queijopropria == 2) {
				pizzapropria.queijo = "Gorgonzola";
				valortotal += 8.00;
			}else if(queijopropria == 3) {
				pizzapropria.queijo = "Parmesão";
				valortotal += 9.00;
			}
			
		
			System.out.println("Queijo " + pizzapropria.queijo + " adicionado!");
			System.out.println(" ");
			
			
			System.out.println("Escolha um tipo de borda: ");
			System.out.println("1 - Comum | 2 - Catupiry | 3 - Cheddar");
			bordapropria = sc.nextInt();
			sc.nextLine();
			
			if(bordapropria == 1) {
				pizzapropria.borda = "Comum";
				valortotal += 10.00;
			}else if(bordapropria == 2){
				pizzapropria.borda = "Catupiry";
				valortotal += 15.00;
			}else if(bordapropria == 3){
				pizzapropria.borda = "Cheddar";
				valortotal += 20.00;
			}
			
			System.out.println("Borda " + pizzapropria.borda + " adicionada!");
			
			System.out.println(" ");
			
			for(int i = 1; i <= 4; i++) {
				System.out.println(" ");
				System.out.println("Escolha o " + i +"° ingrediente");
				System.out.println(" ");
				for (int x=1; x<=15; x++) {
					System.out.println(x + " - " + nomeingrediente[x] + " - +R$ " + precoingrediente[x]);
				}
				
				n = sc.nextInt();
				System.out.println(nomeingrediente[n] + " adicionado com sucesso!");
				ingredienteToken[i] = nomeingrediente[n];
				valortotal += precoingrediente[n];
			}
			
			pizzapropria.ingrediente1 = ingredienteToken[1];
			pizzapropria.ingrediente2 = ingredienteToken[2];
			pizzapropria.ingrediente3 = ingredienteToken[3];
			pizzapropria.ingrediente4 = ingredienteToken[4];
			pizzapropria.setValor(valortotal);
			
			System.out.println("-------------------------------------------------------------------");
			System.out.println(" ");
			System.out.println("Sucesso! A sua pizza foi montada! Segue abaixo o resumo do pedido:");
			System.out.println(" ");
			System.out.println("PIZZA DE " + nome);
			System.out.println("---------------------");
			System.out.println(" ");
			System.out.println("Borda: " + pizzapropria.borda);
			System.out.println("Queijo: " + pizzapropria.queijo);
			System.out.println(" ");
			System.out.println("Ingredientes: ");
			for(int i = 1; i<= 4; i ++) {
				System.out.println(i + " - " + ingredienteToken[i]);
			}	
		}	
		
		System.out.println(" ");
		System.out.println("---------------");
		System.out.println("VALOR TOTAL: R$ " + valortotal);
	}
}
