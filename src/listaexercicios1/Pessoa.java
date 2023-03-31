package listaexercicios1;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String sexo;
    private int idade;
    
    public Pessoa() { }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String Imprimir(){
        String result;
        result = "\nNome: "+this.nome;
        result += "\nCPF: "+this.cpf;
        result += "\nSexo: "+this.sexo;
        result += "\nIdade: "+this.idade;
        
        return result;
    }
}
