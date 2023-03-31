package listaexercicios1;

public class Aluno {
    private String nome;
    private String ra;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    public float getAc1() {
        return ac1;
    }
    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }
    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }
    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }
    public void setAf(float af) {
        this.af = af;
    }
    
    public float CalcularMedia(){
        return (float)(ac1*0.15)+(float)(ac2*0.3)+(float)(ag*0.1)+(float)(af*0.45);
    }
    
    public String VerificarAprovacao(){
        if(CalcularMedia() > 5){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    
    public String Imprimir() {
        String result;
        result = "\nRA: "+ra;
        result += "\nNome: "+nome;
        result += "\nAC1: "+ac1;
        result += "\nAC2: "+ac2;
        result += "\nAG: "+ag;
        result += "\nAF: "+af;
        result += "\nMédia: "+CalcularMedia();
        result += "\nSituação: "+VerificarAprovacao();
        
        return result;
    }
}