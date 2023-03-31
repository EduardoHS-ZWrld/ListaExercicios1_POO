package listaexercicios1;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdHora;
    private float salario;
    private float valorDesconto;

    public Funcionario() { }

    public int getCracha() {
        return cracha;
    }
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }
    public void setTipoVinculo(String tipoVinculo) {
        if(tipoVinculo == "Honorário"){
            this.tipoVinculo = 'H';
        } else {
            this.tipoVinculo = 'E';
        }
    }

    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdHora() {
        return qtdHora;
    }
    public void setQtdHora(float qtdHora) {
        this.qtdHora = qtdHora;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float CalcularValorSalario() {
        if(this.tipoVinculo == 'H'){
            return (this.qtdHora * this.valorHora);
        } else {
            return this.salario;
        } 
    }
    
    public float CalcularValorSalarioComDesconto() {
        return this.CalcularValorSalario() - this.valorDesconto;
    }
    
    public String Imprimir() {
        String result;
        result = "\nCrachá: "+this.cracha;
        result += "\nNome: "+this.nome;
        result += "\nTipo de Vínculo: "+this.tipoVinculo;
        result += "\nSálario: "+this.CalcularValorSalario();
        result += "\nDesconto: "+this.valorDesconto;
        result += "\nValor a receber: "+this.CalcularValorSalarioComDesconto();
        
        return result;
    }
    
}
