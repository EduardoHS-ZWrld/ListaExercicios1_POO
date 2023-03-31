package listaexercicios1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    int opcao;
    int opcaoAluno;
    ArrayList<Aluno> alunos = new ArrayList();
    Scanner input = new Scanner(System.in);
        
        
    public void Executar(){
        do{
            System.out.println("\n Escolha uma opção");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Mostrar Aluno");
            System.out.println("0 - Finalizar Exercício 2");
            opcao = Integer.parseInt(input.next());
            
            switch(opcao){
                case 1:
                    this.AdicionarAluno();
                    break;
                case 2:
                    this.ImprimirAlunos();
                    break;
                case 0:
                    System.out.println("Finalizando exercício 2");
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        }while(opcao != 0);
    }
    
    public void AdicionarAluno() {
        var novoAluno = new Aluno();    
           
        System.out.print("\nDigite o RA: ");
        novoAluno.setRa(input.next());
        System.out.print("Digite o Nome: ");
        novoAluno.setNome(input.next()); 
        System.out.print("Digite a AC1: ");
        novoAluno.setAc1(input.nextFloat());
        System.out.print("Digite a AC2: ");
        novoAluno.setAc2(input.nextFloat());
        System.out.print("Digite a AG: ");
        novoAluno.setAg(input.nextFloat());
        System.out.print("Digite a AF: ");
        novoAluno.setAf(input.nextFloat());

        alunos.add(novoAluno);
    }
    
    public void ImprimirAlunos() {
        System.out.println("\nAlunos");
        for(var i = 0; i < alunos.size(); i++) {
            System.out.println((i+1) + " - " + alunos.get(i).getNome());
        }
        System.out.println("0 - Cancelar");
        System.out.println("\nEscolha o número do Aluno para imprimir: ");
        this.opcaoAluno = input.nextInt();
        System.out.println("");
        try {
            if(opcaoAluno == 0){
                return;
            }
            System.out.println(alunos.get(opcaoAluno - 1).Imprimir());
        } catch (Exception e) {
            System.out.println("--------------------------------");
            System.out.println("Número inválido!");
            System.out.println("--------------------------------");
            this.ImprimirAlunos();
        }
        
    }
}
