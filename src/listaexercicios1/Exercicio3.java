package listaexercicios1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    int opcao;
    int opcaoFuncionario;
    ArrayList<Funcionario> funcionarios = new ArrayList();
    Scanner input = new Scanner(System.in);
    
    public void Executar(){
        do{
            System.out.println("\n Escolha uma opção");
            System.out.println("1 - Criar Funcionário");
            System.out.println("2 - Mostrar Folha de Pagamento");
            System.out.println("3 - Alterar Remuneração");
            System.out.println("0 - Finalizar Exercício 2");
            opcao = Integer.parseInt(input.next());
            
            switch(opcao){
                case 1:
                    this.AdicionarFuncionario();
                    break;
                case 2:
                    this.ImprimirFolhaPagamento();
                    break;
                case 3:
                    this.AlterarRemuneracao();
                    break;
                case 0:
                    System.out.println("Finalizando exercício 3");
                    break;
                default:
                    System.out.println("Entrada inválida!");
            }
        }while(opcao != 0);
    }
    
    public void AdicionarFuncionario() {
        var novoFuncionario = new Funcionario();    
           
        System.out.print("\nDigite o número de Crachá: ");
        novoFuncionario.setCracha(input.nextInt());
        System.out.print("Digite o Nome: ");
        novoFuncionario.setNome(input.next()); 
        System.out.print("Digite o Tipo de Vínculo: ");
        novoFuncionario.setTipoVinculo(input.next());
        if(novoFuncionario.getTipoVinculo() != 'H') {
            System.out.print("Digite o Salário: ");
            novoFuncionario.setSalario(input.nextFloat());
        } else {
            System.out.print("Digite o Valor por Horas Trabalhadas: ");
            novoFuncionario.setValorHora(input.nextFloat());
            System.out.print("Digite a Quantidade de Horas Trabalhadas: ");
            novoFuncionario.setQtdHora(input.nextFloat());            
        }
        System.out.print("Digite o valor de desconto: ");
        novoFuncionario.setValorDesconto(input.nextFloat());

        funcionarios.add(novoFuncionario);
    }
    
    public void ImprimirFolhaPagamento() {
        System.out.println("\nFuncionários");
        for(var i = 0; i < funcionarios.size(); i++) {
            System.out.println((i+1) + " - " + funcionarios.get(i).getNome());
        }
        System.out.println("0 - Cancelar");
        System.out.println("\nEscolha o número do Funcionário para imprimir: ");
        this.opcaoFuncionario = input.nextInt();
        System.out.println("");
        try {
            if(opcaoFuncionario == 0){
                return;
            }
            System.out.println(funcionarios.get(opcaoFuncionario - 1).Imprimir());
        } catch (Exception e) {
            System.out.println("--------------------------------");
            System.out.println("Número inválido!");
            System.out.println("--------------------------------");
            this.ImprimirFolhaPagamento();
        }
    }
    
    public void AlterarRemuneracao() {
        Funcionario funcionarioSelecionado = new Funcionario();
        System.out.println("\nFuncionários");
        for(var i = 0; i < funcionarios.size(); i++) {
            System.out.println((i+1) + " - " + funcionarios.get(i).getNome());
        }
        System.out.println("0 - Cancelar");
        System.out.println("\nEscolha o número do Funcionário para imprimir: ");
        this.opcaoFuncionario = input.nextInt();
        System.out.println("");
        try {
            if(opcaoFuncionario == 0){
                return;
            }
            funcionarioSelecionado = funcionarios.get(opcaoFuncionario - 1);
        } catch (Exception e) {
            System.out.println("--------------------------------");
            System.out.println("Número inválido!");
            System.out.println("--------------------------------");
            this.AlterarRemuneracao();
        }        
        
        if(funcionarioSelecionado.getTipoVinculo() != 'H') {
            System.out.print("Digite o Salário: ");
            funcionarioSelecionado.setSalario(input.nextFloat());
        } else {
            System.out.print("Digite o Valor por Horas Trabalhadas: ");
            funcionarioSelecionado.setValorHora(input.nextFloat());
            System.out.print("Digite a Quantidade de Horas Trabalhadas: ");
            funcionarioSelecionado.setQtdHora(input.nextFloat());            
        }
    }
}
