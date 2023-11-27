package Animais;

public class Gato {

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    public Gato(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public Gato(){}

    public Gato(String nome, String cor, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void miar(){
        System.out.println("Miau miau miau");
    }

    public String interagir(String acao){

        switch (acao){
            case "carinho": this.estadoDeEspirito = "feliz";break;
            case "comida" : this.estadoDeEspirito = "comer";break;
            case "brinquedo": this.estadoDeEspirito = "Brincar"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
        }

        return this.estadoDeEspirito;
    }



}
