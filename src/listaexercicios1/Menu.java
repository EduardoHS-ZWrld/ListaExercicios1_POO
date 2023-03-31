package listaexercicios1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Exercicio1 ex1 = new Exercicio1();
        Exercicio2 ex2 = new Exercicio2();
        Exercicio3 ex3 = new Exercicio3();
        
        do{            
            System.out.println("\n Escolha o exercício");
            System.out.println("1 - Executar exercício 1");
            System.out.println("2 - Executar exercício 2");
            System.out.println("3 - Executar exercício 3");
            System.out.println("0 - Finalizar apresentação");
            opcao = input.nextInt();
            
            switch(opcao){
                case 1:
                    ex1.Executar();
                    break;
                case 2:
                    ex2.Executar();
                    break;
                case 3:
                    ex3.Executar();
                    break;
                case 0: 
                    System.out.println("\n Finalizando apresentação");
                    break;
                default:
                    System.out.println("Entrada inválida!");
                    
            }
        }while(opcao != 0);      
    }    
}
