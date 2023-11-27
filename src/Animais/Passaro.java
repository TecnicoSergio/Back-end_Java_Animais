package Animais;

public class Passaro {

    private String nome;
    private String cor;
    private double peso;
    private String estadoDeEspirito;

    public Passaro(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public Passaro(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Passaro(){}

    public void piar(){
        System.out.println("Piu Piu Piu");
    }

    public String interagir(String acao){
        switch (acao){
            case "Alpiste":this.estadoDeEspirito = "come";break;
            case "carinho":this.estadoDeEspirito = "Canta"; break;

        }
        return this.estadoDeEspirito;
    }
}
