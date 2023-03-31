package listaexercicios1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    int opcao;
    int opcaoPessoa;
    ArrayList<Pessoa> pessoas = new ArrayList();
    Scanner input = new Scanner(System.in);
        
        
    public void Executar(){
        do{
            System.out.println("\n Escolha uma opção");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Mostrar Pessoa");
            System.out.println("0 - Finalizar Exercício 1");
            opcao = Integer.parseInt(input.next());
            
            switch(opcao){
                case 1:
                    this.AdicionarPessoa();
                    break;
                case 2:
                    this.ImprimirPessoas();
                    break;
                case 0:
                    System.out.println("\n Finalizando exercício 1!");
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        } while(opcao != 0);
    }
    
    public void AdicionarPessoa() {
        var novaPessoa = new Pessoa();    

        System.out.print("\nDigite o Nome: ");
        novaPessoa.setNome(input.next());            
        System.out.print("Digite o CPF: ");
        novaPessoa.setCPF(input.next());
        System.out.print("Digite o Sexo: ");
        novaPessoa.setSexo(input.next());
        System.out.print("Digite a Idade: ");
        novaPessoa.setIdade(input.nextInt());

        pessoas.add(novaPessoa);
    }
    
    public void ImprimirPessoas() {
        System.out.println("\nPessoas");
        for(var i = 0; i < pessoas.size(); i++) {
            System.out.println((i+1) + " - " + pessoas.get(i).getNome());
        }
        System.out.println("0 - Cancelar");
        System.out.println("\nEscolha o número da Pessoa para imprimir: ");
        this.opcaoPessoa = input.nextInt();
        System.out.println("");
        try {
            if(opcaoPessoa == 0){
                return;
            }
            System.out.println(pessoas.get(opcaoPessoa - 1).Imprimir());
            this.opcaoPessoa = 0;
        } catch (Exception e) {
            System.out.println("--------------------------------");
            System.out.println("Número inválido!");
            System.out.println("--------------------------------");
            this.ImprimirPessoas();
        }
    }
}